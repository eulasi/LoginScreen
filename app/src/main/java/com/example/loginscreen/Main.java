package com.example.loginscreen;

/**
 This is the entry point of the application. It creates an instance of LoginActivity and LoginPresenter. It also sets the presenter for the LoginActivity. The LoginActivity is the view and the LoginPresenter is the presenter.
 **/

import com.example.loginscreen.presenter.LoginPresenter;
import com.example.loginscreen.view.LoginActivity;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LoginActivity
        LoginActivity loginView = new LoginActivity();

        // Create an instance of LoginPresenter and pass the loginView to its constructor
        LoginPresenter loginPresenter = new LoginPresenter(loginView);

        // Set the presenter for the LoginActivity
        loginView.setPresenter(loginPresenter);
    }
}
