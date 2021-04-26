package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class PersonalizeProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalize_profile);

        Button savePrefButtonView = (Button)findViewById(R.id.savePrefButton);
        final CheckBox fictionCheckBox = (CheckBox)findViewById(R.id.fictionCheckBox);
        final CheckBox nonFictionCheckBox = (CheckBox)findViewById(R.id.nonFictionCheckBox);
        final CheckBox romanceCheckBox = (CheckBox)findViewById(R.id.romanceCheckBox);
        final CheckBox detectiveCheckBox = (CheckBox)findViewById(R.id.detectiveCheckBox);
        final CheckBox educationCheckBox = (CheckBox)findViewById(R.id.educationCheckBox);
        final CheckBox thrillerCheckBox = (CheckBox)findViewById(R.id.thrillerCheckBox);


        View.OnClickListener savePrefButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PersonalizeProfile.this, RecommendedBooks.class);
                intent.putExtra("fiction",Boolean.toString(fictionCheckBox.isChecked()));
                intent.putExtra("nonfiction",Boolean.toString(nonFictionCheckBox.isChecked()));
                intent.putExtra("romance",Boolean.toString(romanceCheckBox.isChecked()));
                intent.putExtra("detective",Boolean.toString(detectiveCheckBox.isChecked()));
                intent.putExtra("education",Boolean.toString(educationCheckBox.isChecked()));
                intent.putExtra("thriller",Boolean.toString(thrillerCheckBox.isChecked()));
                startActivity(intent);
            }
        };
        savePrefButtonView.setOnClickListener(savePrefButtonListener);
    }
}