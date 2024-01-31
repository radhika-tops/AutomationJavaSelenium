package com.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class userDao {
	List<User> users;

	public userDao() {
		users = new ArrayList<User>();
		User user1 = new User(1, "java");
		User user2 = new User(2, "dart");
		User user3 = new User(3, "kotlin");
		User user4 = new User(4, "python");
		users.addAll(Arrays.asList(user1, user2, user3, user4));
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUserById(int id) {
		return users.stream().filter(x -> x.getId() == id).collect(Collectors.toList()).get(0);
	}

	public void createUser(User user) {
		users.add(user);
	}

	public List<User> deleteUser(int id) {
		users.removeIf(x -> x.getId() == id);
		return users;
	}

	public List<User> updateUser(int id, String name) {
		users.stream().filter(x -> x.getId() == id).collect(Collectors.toList()).get(0).setName(name);
		return users;
	}

}
