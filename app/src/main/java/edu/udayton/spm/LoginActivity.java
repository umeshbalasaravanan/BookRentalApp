package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerLinkView = (TextView)findViewById(R.id.registerLinkView);

        Button loginButton = (Button)findViewById(R.id.loginButtonView);

        View.OnClickListener registerLinkViewListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        };
        registerLinkView.setOnClickListener(registerLinkViewListener);

        View.OnClickListener loginButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, PersonalizeProfile.class);
                startActivity(intent);
            }
        };

        loginButton.setOnClickListener(loginButtonListener);
    }
}