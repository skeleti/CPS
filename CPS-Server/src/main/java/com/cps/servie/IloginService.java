package com.cps.servie;

import com.cps.data.UserDetailsData;

public interface IloginService {

	public void createUser(UserDetailsData user);

	public void updateUser(UserDetailsData user);

	public UserDetailsData getUserDetails(String userName, String password);

}