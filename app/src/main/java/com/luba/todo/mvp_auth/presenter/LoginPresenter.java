package com.luba.todo.mvp_auth.presenter;

import com.luba.todo.mvp_auth.model.User;
import com.luba.todo.mvp_auth.view.ILoginView;

public class LoginPresenter implements ILoginPresenter {
    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String pass) {
        User user=new User(email,pass);
        int loginCode= user.isValidData();

        if(loginCode==0) loginView.onLoginError("Enter email, please");
        else if(loginCode==1) loginView.onLoginError("Enter right email, please");
        else if(loginCode==2) loginView.onLoginError("pass must be more than 6 letters");
       else loginView.onLoginSuccess("Success");
    }
}
