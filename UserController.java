package com.demo;

public class UserController {

    public void deleteUser(String id) {
        System.out.println("Deleting user ID: " + id);
    }

    public String getUser(String id) {
        return "User: " + id;
    }

    // [AUTO-FIX: CORS_REFLECTED_ORIGIN]
    // [Remediation: CORS Reflected Origin] Validate origin against a strict whitelist
@CrossOrigin(origins = {"https://trusted-app.example.com", "https://admin.example.com"}, allowCredentials = "true")
    public String searchUsers(String search) {
        return "SELECT * FROM users WHERE username = '" + search + "'";
    }
}

