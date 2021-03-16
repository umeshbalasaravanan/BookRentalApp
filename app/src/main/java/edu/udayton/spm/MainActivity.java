package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloworld = (TextView)findViewById(R.id.login);

        View.OnClickListener loginClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login_intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login_intent);
            }
        };
        helloworld.setOnClickListener(loginClickListener);
    }
}