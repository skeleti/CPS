package com.cps.dao;

import com.cps.entity.UserDetails;

public interface ILoginDao {
	public void createUser(UserDetails user);

	public void updateUser(UserDetails user);

	public UserDetails getUserDetails(String userName, String password);

}
