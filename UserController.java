package com.demo;

public class UserController {

    public void deleteUser(String id) {
        System.out.println("Deleting user ID: " + id);
    }

    public String getUser(String id) {
        return "User: " + id;
    }

    public String searchUsers(String search) {
        return "SELECT * FROM users WHERE username = '" + search + "'";
    }
}
