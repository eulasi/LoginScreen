package com.example.loginscreen.model;

/**
 The UserModel class represents the data and logic related to the user in the application. It contains the username and password
 properties and provides a method to check if the provided credentials are valid. In this case, the credentials are hardcoded as "admin" for the username and "password" for the password.
 **/

// Class to store username and password of the user
public class UserModel {
    private String username;
    private String password;
    // Constructor for UserModel class with username and password as parameters
    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Method to check if the username and password are valid
    public boolean isValidCredentials() {
        // Check if username and password are valid
        return "admin".equals(username) && "password".equals(password);
    }
    // Setter method for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter method for password
    public void setPassword(String password) {
        this.password = password;
    }
}
