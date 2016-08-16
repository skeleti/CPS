package com.cps.servie.factory;

import com.cps.servie.IloginService;
import com.cps.servie.impl.LoginService;

public class CPSServiceFactory {

	private static IloginService loginService;

	public static IloginService getLoginService() {

		return loginService == null ? loginService =new LoginService() : loginService;

	}

}
