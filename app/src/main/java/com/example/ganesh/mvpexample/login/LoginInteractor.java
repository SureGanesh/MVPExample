package com.example.ganesh.mvpexample.login;

/**
 * Created by kvana on 5/26/17.
 */

public interface LoginInteractor {

    interface onLoginFinishedListener{

        void onUserNameError();
        void onPasswordError();
        void onSuccess();
        void onFailure(String message);
    }

    void login(String username,String password,onLoginFinishedListener listener);
}
