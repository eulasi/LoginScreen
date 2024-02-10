package com.example.loginscreen.presenter;

/**
 The LoginPresenter class acts as an intermediary between the UserModel and the LoginActivity. It receives user input from the LoginActivity, processes it, interacts with the UserModel to validate the credentials, and then updates the LoginActivity accordingly.
 **/

import com.example.loginscreen.model.UserModel;
import com.example.loginscreen.view.LoginView;

// LoginPresenter class
public class LoginPresenter {
    private final LoginView view;
    private final UserModel model;

    // Constructor for LoginPresenter class. It takes a LoginView object as an argument. It also creates a new UserModel object.
    public LoginPresenter(LoginView view) {
        this.view = view;
        this.model = new UserModel("", "");
    }
    // Getter for the LoginView object. It is used by the LoginActivity to update the view.
    public LoginView getView() {
        return view;
    }
    // Getter for the UserModel object. It is used by the LoginPresenter to interact with the UserModel.
    public void onLogin(String username, String password) {
        view.showLoading();

        // Set the username and password in the UserModel. It is used by the UserModel to validate the credentials.
        model.setUsername(username);
        model.setPassword(password);

        // Check if the credentials are valid
        if (model.isValidCredentials()) {
            view.hideLoading();
            view.showLoginSuccessMessage();
        } else {
            view.hideLoading();
            view.showLoginErrorMessage();
        }
    }
}
