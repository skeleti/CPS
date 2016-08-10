package com.cps.dao.factory;

import com.cps.dao.ILoginDao;
import com.cps.dao.impl.LoginDao;

public class CpsDaoFactory {
	
	private static ILoginDao loginDao;
	
	public static ILoginDao getLoginDao(){
		return loginDao == null ? loginDao= new LoginDao() : loginDao;
	}

}
