package com.example.loginscreen.view;

/**
 The LoginView interface defines the contract for the view layer of the application. It fetches data from the model and updates the view accordingly. It contains methods for showing loading indicators, hiding loading indicators, displaying login success messages, and displaying login error messages.
 **/

// View interface for LoginActivity class
public interface LoginView {
    void showLoading();
    void hideLoading();
    void showLoginSuccessMessage();
    void showLoginErrorMessage();
}
