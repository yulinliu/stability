package io;

import java.util.List;

import utils.Dao;
import bean.User;
import bean.UserLoginLog;
import bean.UserRole;

public class NonPreLoader {

	public static void main(String[] args) {
		
		try {
			long start = System.currentTimeMillis();
			
			NonPreLoader nonPreLoader = new NonPreLoader();
			
			for(int i=0;i<1000;i++){
				nonPreLoader.checkUserIsActivate(i);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println(end - start);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean checkUserIsActivate(long user_id) throws Exception{
		boolean success = false;
		
		Dao dao = null;
		try {
			dao = new Dao();
			
			User user = dao.findUser(user_id);
			
			if(user != null && user.isActivate()){
				List<UserRole> roles = dao.getUserRole(user_id);
				
				if(hasUserRole(roles, "WebUser")){
					List<UserLoginLog> loginList = dao.getUserLoginLog(user_id);
					if(loginList.size() >0){
						success = true;
					}
				}
			}
			
		} catch (Exception e) {
			throw e;
			
		}finally{
			if(dao != null) dao.close();
		}
		
		return success;
	}
	
	public boolean hasUserRole(List<UserRole> list, String roleName){
		boolean success = false;
		
		for(UserRole role : list){
			if(roleName.equals(role.getName())){
				success = false;
				break;
			}
		}
		
		return success;
	}
}
