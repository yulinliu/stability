package handle;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import bean.User;
import bean.UserLoginLog;
import bean.UserRole;
import utils.Dao;

public class NonCatchError implements Runnable {

	public static void main(String[] args) {
		try {
			int thread_count = 200;
			int run_count = thread_count * 2;
			
			ExecutorService executor = Executors.newFixedThreadPool(thread_count);
			
			long start = System.currentTimeMillis();
			
			for(int i=0;i<run_count;i++){
				executor.execute(new NonCatchError());
			}
			
			executor.shutdown();
			
			while (!executor.isTerminated()) {
	        }
			
			long end = System.currentTimeMillis();
			
			System.out.println(end - start);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		
		try {
			long user_id = 1;
			Dao dao = new Dao();
			User user = dao.findUser(user_id);
			List<UserRole> roles = dao.getUserRole(user_id);
			List<UserLoginLog> loginList = dao.getUserLoginLog(user_id);
			
			roles.get(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
