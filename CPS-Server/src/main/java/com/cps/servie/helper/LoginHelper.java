package com.cps.servie.helper;

import com.cps.data.UserDetailsData;
import com.cps.entity.UserDetails;

public class LoginHelper {

	public static UserDetailsData getUserDetailsData(UserDetails master) {
		UserDetailsData data = new UserDetailsData();
		try {
			data.setFirstName(master.getFirstName());
			data.setLastName(master.getLastName());
			data.setPassword(master.getPassword());
			data.setRole(master.getRole());
			data.setEmail(master.getEmail());
			data.setDob(master.getDob());
			data.setMobile(master.getMobile());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public static UserDetails getUserDetails(UserDetailsData data) {
		UserDetails master = new UserDetails();
		try {
			master.setFirstName(data.getFirstName());
			master.setLastName(data.getLastName());
			master.setPassword(data.getPassword());
			master.setRole(data.getRole());
			master.setEmail(data.getEmail());
			master.setDob(data.getDob());
			master.setMobile(data.getMobile());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return master;
	}
}
