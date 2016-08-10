package com.cps.servie.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("user")
public interface IUserManagementRestService {

	@POST
	@Path("new")
	@Consumes("application/json")
	@Produces("application/json")
	public void createUser(String user);

	@PUT
	@Path("update")
	@Consumes("application/json")
	@Produces("application/json")
	public void updateUser(String user);

	@GET
	@Path("get")
	@Produces("application/json")
	public String getUserDetails(String userName, String password);

}
