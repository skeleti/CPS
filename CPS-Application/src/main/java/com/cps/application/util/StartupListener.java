package com.cps.application.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.cps.dao.util.CPSServer;

public class StartupListener implements ServletContextListener {

	private static final Logger logger = Logger
			.getLogger(StartupListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent theServletContext) {
	}

	@Override
	public void contextInitialized(ServletContextEvent theServletContext) {
		System.out.println("listener started");
		CPSServer.init("cpsPersistenceUnit");
	}

}
