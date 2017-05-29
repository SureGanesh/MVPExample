package com.example.ganesh.mvpexample.login;

/**
 * Created by kvana on 5/26/17.
 */

public interface LoginView {

    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigateToMain();
    void showAlert(String message);
}
