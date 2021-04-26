package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class RecommendedBooks extends AppCompatActivity {

//    public static final String fiction = "false";
//    public static final String nonFiction = "false";
//    public static final String romance = "false";
//    public static final String detective = "false";
//    public static final String education = "false";
//    public static final String thriller = "false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_books);

        //Intent intent = getIntent();
        Bundle myExtras = getIntent().getExtras();

        LinearLayout fiction1Layout = (LinearLayout)findViewById(R.id.fiction1LinearLayout);
        LinearLayout fiction2Layout = (LinearLayout)findViewById(R.id.fiction2LinearLayout);
        LinearLayout fiction3Layout = (LinearLayout)findViewById(R.id.fiction3LinearLayout);
        LinearLayout nonfiction1Layout = (LinearLayout)findViewById(R.id.nonfiction1LinearLayout);
        LinearLayout nonfiction2Layout = (LinearLayout)findViewById(R.id.nonfiction2LinearLayout);
        LinearLayout nonfiction3Layout = (LinearLayout)findViewById(R.id.nonfiction3LinearLayout);
        LinearLayout romance1Layout = (LinearLayout)findViewById(R.id.romance1LinearLayout);
        LinearLayout romance2Layout = (LinearLayout)findViewById(R.id.romance2LinearLayout);
        LinearLayout romance3Layout = (LinearLayout)findViewById(R.id.romance3LinearLayout);
//        View f1View = (View)findViewById(R.id.f1View);
//        View f2View = (View)findViewById(R.id.f2View);
//        View f3View = (View)findViewById(R.id.f3View);

        if(myExtras != null){
            String f = myExtras.getString("fiction");
            String nf = myExtras.getString("nonfiction");
            String r = myExtras.getString("romance");
            String d = myExtras.getString("detective");
            String e = myExtras.getString("education");
            String t = myExtras.getString("thriller");

            Log.i("fiction", f);
            Log.i("nonfiction",nf);
            if(f.equals("true")){
                fiction1Layout.setVisibility(View.VISIBLE);
                fiction2Layout.setVisibility(View.VISIBLE);
                fiction3Layout.setVisibility(View.VISIBLE);
//                f1View.setVisibility(View.VISIBLE);
//                f2View.setVisibility(View.VISIBLE);
//                f3View.setVisibility(View.VISIBLE);
            }
            if(nf.equals("true")){
                nonfiction1Layout.setVisibility(View.VISIBLE);
                nonfiction2Layout.setVisibility(View.VISIBLE);
                nonfiction3Layout.setVisibility(View.VISIBLE);
            }
            if(r.equals("true")){
                romance1Layout.setVisibility(View.VISIBLE);
                romance2Layout.setVisibility(View.VISIBLE);
                romance3Layout.setVisibility(View.VISIBLE);
            }

        }
    }
}