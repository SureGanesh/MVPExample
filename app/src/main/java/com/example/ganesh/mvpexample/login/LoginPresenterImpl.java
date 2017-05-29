package com.example.ganesh.mvpexample.login;

/**
 * Created by kvana on 5/26/17.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginInteractor.onLoginFinishedListener{

    LoginView mLoginView;
    LoginInteractor mLoginInteractor;

    public LoginPresenterImpl(LoginView mLoginView) {
        this.mLoginView = mLoginView;
        mLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredential(String username, String password) {
        if(mLoginView !=null){
            mLoginView.showProgress();
            mLoginInteractor.login(username,password,this);
        }


    }

    @Override
    public void onDestroy() {
        if(mLoginView !=null){
            mLoginView = null;
        }

    }

    @Override
    public void onUserNameError() {
        if(mLoginView !=null){
            mLoginView.hideProgress();
            mLoginView.setUserNameError();

        }

    }

    @Override
    public void onPasswordError() {
        if(mLoginView !=null){
            mLoginView.hideProgress();
            mLoginView.setPasswordError();

        }

    }

    @Override
    public void onSuccess() {
        if(mLoginView !=null){
            mLoginView.hideProgress();
            mLoginView.navigateToMain();

        }

    }

    @Override
    public void onFailure(String message) {
        if(mLoginView !=null){
            mLoginView.hideProgress();
           mLoginView.showAlert(message);

        }


    }
}
