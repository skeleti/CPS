package com.cps.dao.util;

import org.apache.log4j.Logger;

public class CPSServer {

	private static Logger logger = Logger.getLogger(CPSServer.class);

	private static boolean intialized = false;

	private static CPSServer cpsServer = null;

	private CPSServer() {
		if (!intialized) {
			init("cpsPersistenceUnit");
		}
	}

	public static void init(String thePersistentUnit) {
		EntityManagerUtil.init(thePersistentUnit);
		intialized = true;
		System.out.println("CPS Server is Intialized ..");
	}

	public static CPSServer getInstance() {
		if (cpsServer == null) {
			cpsServer = new CPSServer();
		}
		return cpsServer;
	}

	public static void main(String[] args) {
		System.out.println("testing" + CPSServer.getInstance());
	}

}
