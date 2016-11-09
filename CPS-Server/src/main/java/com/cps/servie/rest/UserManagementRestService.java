package com.cps.servie.rest;


import org.apache.log4j.Logger;

import com.cps.data.UserDetailsData;
import com.cps.servie.IloginService;
import com.cps.servie.factory.CPSServiceFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserManagementRestService implements IUserManagementRestService {

	private static final Logger logger = Logger.getLogger(UserManagementRestService.class);
	
	@Override
	public String createUser(String user) {
		logger.info("Start: getting user details in getUserDetails()");
		String response=null;
		IloginService service = CPSServiceFactory.getLoginService();
		try {
			Gson gson = new GsonBuilder().create();
			UserDetailsData data = gson.fromJson(user, UserDetailsData.class);
			response=service.createUser(data);
			} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("End: getting user details in getUserDetails()");
		return response;
	}

	@Override
	public String updateUser(String user) {
		// TODO Auto-generated method stub
return null;
	}

	@Override
	public String getUserDetails(String userName, String password) {
		
		logger.info("Start: getting user details in getUserDetails()");
		String response=null;
		IloginService service = CPSServiceFactory.getLoginService();
		try {
			UserDetailsData data = service.getUserDetails(userName, password);
			Gson gson = new GsonBuilder().create();
			response = gson.toJson(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("End: getting user details in getUserDetails()");
		return response;
	}

}
