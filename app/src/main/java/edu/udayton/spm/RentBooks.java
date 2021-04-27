package edu.udayton.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

public class RentBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_books);

        Bundle myExtras = getIntent().getExtras();
        TextView bookDesc = (TextView)findViewById(R.id.bookDesc);
        bookDesc.setText(myExtras.getString("synopsis"));
        TextView bookTitle = (TextView)findViewById(R.id.rentBookTitleView);
        bookTitle.setText("Title: " + myExtras.getString("bookName"));
        TextView bookAuthor = (TextView)findViewById(R.id.rentBookAuthorView);
        bookAuthor.setText("author "+ myExtras.getString("author"));
        TextView price = (TextView)findViewById(R.id.rentBookPriceView);
        price.setText("price: " + myExtras.getString("price"));
        RoundedImageView bookimage = (RoundedImageView)findViewById(R.id.rentBookImageView);
        if(myExtras.getString("image").equals("fiction1")){
            bookimage.setImageResource(R.drawable.fiction1);
        }else if(myExtras.getString("image").equals("fiction2")){
            bookimage.setImageResource(R.drawable.fiction2);
        }else if(myExtras.getString("image").equals("fiction3")){
            bookimage.setImageResource(R.drawable.fiction3);
        }
    }
}