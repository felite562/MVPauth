package com.luba.todo.mvp_auth.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {
public String email, pass;

    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public int isValidData() {
        if (TextUtils.isEmpty(getEmail())) return 0;
        else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) return 1;
        else if(getPass().length()<=6) return 2;
        else return -1;







    }
}
