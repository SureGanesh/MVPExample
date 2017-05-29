package com.example.ganesh.mvpexample.login;

/**
 * Created by kvana on 5/26/17.
 */

public interface LoginPresenter {

    void validateCredential(String username,String password);
    void onDestroy();
}
