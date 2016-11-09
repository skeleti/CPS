package com.cps.servie.impl;

import org.apache.log4j.Logger;

import com.cps.dao.ILoginDao;
import com.cps.dao.factory.CpsDaoFactory;
import com.cps.data.UserDetailsData;
import com.cps.entity.UserDetails;
import com.cps.servie.IloginService;
import com.cps.servie.helper.LoginHelper;

public class LoginService implements IloginService {

	private static final Logger logger = Logger.getLogger(LoginService.class);

	@Override
	public String createUser(UserDetailsData user) {
		String response="";
		try {
			ILoginDao dao = CpsDaoFactory.getLoginDao();
			UserDetails master=LoginHelper.getUserDetails(user);
			dao.createUser(master);
			response ="User Created successfully";
		} catch (Exception e) {
			response =" Error while creating User";
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public String updateUser(UserDetailsData user) {
		// TODO Auto-generated method stub
return null;
	}

	@Override
	public UserDetailsData getUserDetails(String userName, String password) {
		logger.info("Start: getting user details in getUserDetails()");
		UserDetailsData user = new UserDetailsData();
		ILoginDao dao = CpsDaoFactory.getLoginDao();
		try {
			user = LoginHelper.getUserDetailsData(dao.getUserDetails(userName,
					password));
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("End: getting user details in getUserDetails()");
		return user;
	}

}
