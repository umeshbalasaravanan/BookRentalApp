package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        cancel = (TextView)findViewById(R.id.cancelButtonView);

        View.OnClickListener cancelOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        };
        cancel.setOnClickListener(cancelOnClickListener);
    }
}