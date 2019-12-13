package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class moist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public void ShopMoist(View view) {
        Uri uri = Uri.parse("https://shopee.co.id/search?keyword=moisturizer");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.shopee.android");

        try {
            Toast.makeText(this, "Shopee", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/search?keyword=moisturizer")));
        }
    }
}
