package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    EditText search;
    ViewFlipper v_flipper;
    CardView clean,toner,serum,moist;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] = {R.drawable.skincarehome, R.drawable.skincare2, R.drawable.skincare3, R.drawable.skincare5 };

        v_flipper = findViewById(R.id.v_flipper);

        for(int i = 0; i< images.length; i++){
            flipperImages(images[i]);

        }

        clean=findViewById(R.id.clean);
        clean.setOnClickListener(this);

        toner=findViewById(R.id.toner);
        toner.setOnClickListener(this);

        serum=findViewById(R.id.serum);
        serum.setOnClickListener(this);

        moist=findViewById(R.id.moist);
        moist.setOnClickListener(this);

        search=findViewById(R.id.search);
        search.setOnClickListener(this);

        logout=findViewById((R.id.logout));
        logout.setOnClickListener(this);



    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.search:
                startActivity(new Intent(this, listproduk.class));
                break;

            case R.id.clean:
                startActivity(new Intent(this, cleansing.class));
                break;

            case R.id.serum:
                startActivity(new Intent(this, serum.class));
                break;

            case R.id.toner:
                startActivity(new Intent(this, toner.class));
                break;

            case R.id.moist:
                startActivity(new Intent(this, moist.class));
                break;

            case R.id.logout:
                finish();





        }



    }
}
