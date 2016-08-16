package com.cps.servie.helper;

import com.cps.data.UserDetailsData;
import com.cps.entity.UserDetails;

public class LoginHelper {

	public static UserDetailsData getUserDetailsData(UserDetails master) {
		UserDetailsData data = new UserDetailsData();
		try {
			data.setUserName(master.getUserName());
			data.setPassword(master.getPassword());
			data.setRole(master.getRole());
			data.setToken(master.getToken());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
