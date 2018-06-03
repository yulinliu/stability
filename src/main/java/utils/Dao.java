package utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.User;
import bean.UserLoginLog;
import bean.UserRole;

public class Dao {
	
	private int magnify = 1;
	
	public Dao(){}

	public Dao(int magnify){
		this.magnify = magnify;
	}

	public User findUser(long user_id) throws InterruptedException{
		//模擬DB回應時間
		Thread.sleep(10 * magnify);
				
		User user = new User();
		user.setUserId(user_id);
		user.setActivate(user_id%2==1);
		
		return user;
	}
	
	public List<UserRole> getUserRole(long user_id) throws InterruptedException{
		//模擬DB回應時間
		Thread.sleep(10 * magnify);
		
		List<UserRole> list = new ArrayList<UserRole>();
		
		if(user_id%2==1){
			UserRole role = new UserRole();
			role.setUserId(user_id);
			role.setName("WebUser");
			
			list.add(role);
		}
		
		return list;
	}
	
	public List<UserLoginLog> getUserLoginLog(long user_id) throws InterruptedException{
		//模擬DB回應時間
		Thread.sleep(20 * magnify);
		
		List<UserLoginLog> list = new ArrayList<UserLoginLog>();
		
		for(int i=0;i<100;i++){
			UserLoginLog log = new UserLoginLog();
			log.setIp("ip");
			log.setTime(new Date());
			log.setUserId(user_id);
			
			list.add(log);
		}
		
		return list;
	}
	
	public void close(){
		
	}
}
