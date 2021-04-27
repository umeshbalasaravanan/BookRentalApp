package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

import org.w3c.dom.Text;

public class RecommendedBooks extends AppCompatActivity {

//    public static final String fiction = "false";
//    public static final String nonFiction = "false";
//    public static final String romance = "false";
//    public static final String detective = "false";
//    public static final String education = "false";
//    public static final String thriller = "false";

    TextView bookName;
    TextView authorName;
    TextView bookPrice;
    RoundedImageView bookImage;

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

            View.OnClickListener fiction1LayoutOnClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bookName = (TextView)findViewById(R.id.fiction1BookName);
                    authorName = (TextView)findViewById(R.id.fiction1AuthorName);
                    bookPrice = (TextView)findViewById(R.id.fiction1price);
                    bookImage = (RoundedImageView)findViewById(R.id.fiction1Image);
                    Intent intent = new Intent(RecommendedBooks.this, RentBooks.class);
                    intent.putExtra("synopsis","Ten years after her teenage daughter went missing, a mother begins a new relationship only to discover she can't truly move on until she answers lingering questions about the past. Laurel Mack's life stopped in many ways the day her 15-year-old daughter, Ellie, left the house to study at the library and never returned.");
                    intent.putExtra("bookName",bookName.getText());
                    intent.putExtra("author",authorName.getText());
                    intent.putExtra("price",bookPrice.getText());
                    intent.putExtra("image", "fiction1");
                    startActivity(intent);
                }
            };

            fiction1Layout.setOnClickListener(fiction1LayoutOnClickListener);

            View.OnClickListener fiction2LayoutOnClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bookName = (TextView)findViewById(R.id.fiction2BookName);
                    authorName = (TextView)findViewById(R.id.fiction2AuthorName);
                    bookPrice = (TextView)findViewById(R.id.fiction2price);
                    bookImage = (RoundedImageView)findViewById(R.id.fiction2Image);
                    Intent intent = new Intent(RecommendedBooks.this, RentBooks.class);
                    intent.putExtra("synopsis","In The Four Winds by Kristin Hannah, Elsa Wolcott is a woman trying to raise two children on farm in the Great Plains during the Dust Bowl following the Great Depression. She watches as the lands around her crack in their perpetually parched state and the hopelessness threatens to breaks the spirit of those around her.");
                    intent.putExtra("bookName",bookName.getText());
                    intent.putExtra("author",authorName.getText());
                    intent.putExtra("price",bookPrice.getText());
                    intent.putExtra("image", "fiction2");
                    startActivity(intent);
                }
            };

            fiction2Layout.setOnClickListener(fiction2LayoutOnClickListener);

            View.OnClickListener fiction3LayoutOnClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bookName = (TextView)findViewById(R.id.fiction3BookName);
                    authorName = (TextView)findViewById(R.id.fiction3AuthorName);
                    bookPrice = (TextView)findViewById(R.id.fiction3price);
                    bookImage = (RoundedImageView)findViewById(R.id.fiction3Image);
                    Intent intent = new Intent(RecommendedBooks.this, RentBooks.class);
                    intent.putExtra("synopsis","This new novel is set in the early 1980s, as the man of two faces flees not to America but to France. He’s survived a harrowing boat trip, and a flight from Jakarta with Bon, his “best friend and blood brother.” Their story is complicated to unwind.");
                    intent.putExtra("bookName",bookName.getText());
                    intent.putExtra("author",authorName.getText());
                    intent.putExtra("price",bookPrice.getText());
                    intent.putExtra("image", "fiction3");
                    startActivity(intent);
                }
            };

            fiction3Layout.setOnClickListener(fiction3LayoutOnClickListener);

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