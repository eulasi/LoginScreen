package com.example.loginscreen.view;

/**
 The LoginActivity class implements the LoginView interface and serves as the actual UI component of the application. It interacts with the user, displaying login-related information and receiving user input.
 **/

import com.example.loginscreen.presenter.LoginPresenter;
import com.example.loginscreen.view.LoginView;

// View implementation for LoginActivity class. Presenter is injected into the constructor.
public class LoginActivity implements LoginView {
    private LoginPresenter presenter;


    // Constructor for LoginActivity class. Presenter is injected into the constructor.
    public LoginActivity() {
        // Initialize the presenter here if needed
    }

    @Override
    public void showLoading() {
        // show loading
    }

    @Override
    public void hideLoading() {
        // hide loading
    }

    @Override
    public void showLoginSuccessMessage() {
        // show success message
    }

    @Override
    public void showLoginErrorMessage() {
        // show error message
    }

    // assigns the presenter argument to the presenter field of the LoginActivity instance. allows the LoginActivity to access and use the LoginPresenter instance.
    public void setPresenter(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    // method called from LoginActivity class.
    public void onLoginButtonClick(String username, String password) {
        presenter.onLogin(username, password);
    }
}