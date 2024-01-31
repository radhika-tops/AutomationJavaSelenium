package com.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
public class UserResource {
	userDao dao = new userDao();

	@GET
	@Path("getusers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUser() {
		return dao.getAllUsers();
	}

	@GET
	@Path("getusers/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("id") int id) {
		return dao.getUserById(id);
	}

	@POST
	@Path("adduser")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> addUser(User user) {
		dao.createUser(user);
		return dao.getAllUsers();
	}

	@DELETE
	@Path("deleteuser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> deleteUserById(@PathParam("id") int id) {
		return dao.deleteUser(id);
	}

	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> updateUserById(@PathParam("id") int id, User user) {
		return dao.updateUser(id, user.getName());
	}

}
