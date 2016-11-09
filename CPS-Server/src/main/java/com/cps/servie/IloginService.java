package com.cps.servie;

import com.cps.data.UserDetailsData;

public interface IloginService {

	public String createUser(UserDetailsData user);

	public String updateUser(UserDetailsData user);

	public UserDetailsData getUserDetails(String userName, String password);

}
