package com.imu.coursenet.action;

import com.imu.coursenet.action.base.UserManagerBaseAction;

public class DeleteUserAction extends UserManagerBaseAction{
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String execute() throws Exception {
		int result=userManager.deleteUser(userId);
		if(result == userManager.ADMIN){
			return "admin_succ";
		}else if(result == userManager.TEACHER){
			return "teacher_succ";
		}else if(result == userManager.STUDENT){
			return "student_succ";
		}
		else
			return ERROR;
	}
	
}
