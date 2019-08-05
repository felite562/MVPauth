package com.luba.todo.mvp_auth.view;

public interface ILoginView {
    void onLoginSuccess(String message);
    void onLoginError(String message);
}
