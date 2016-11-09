package com.cps.servie.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/user")
public interface IUserManagementRestService {

	@POST
	@Path("/new")
	@Consumes("application/json")
	@Produces("application/json")
	public String createUser(String user);

	@PUT
	@Path("/update")
	@Consumes("application/json")
	@Produces("application/json")
	public String updateUser(String user);

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUserDetails(@QueryParam("userName") String userName, @QueryParam("password") String password);

}
