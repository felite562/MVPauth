package com.luba.todo.mvp_auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.luba.todo.mvp_auth.presenter.ILoginPresenter;
import com.luba.todo.mvp_auth.presenter.LoginPresenter;
import com.luba.todo.mvp_auth.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {
        EditText email, pass;
        Button button;
    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.edt_email);
        pass=findViewById(R.id.edt_pass);
        button=findViewById(R.id.button);

        presenter=new LoginPresenter(this);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onLogin(email.getText().toString(),pass.getText().toString());

            }
        });
    }


    @Override
    public void onLoginSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
