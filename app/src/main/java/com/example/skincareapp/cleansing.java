package com.example.skincareapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class cleansing extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleansing);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    public void ShopCleansing(View view) {
        Uri uri = Uri.parse("https://shopee.co.id/search?keyword=senka%20cleansing");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.shopee.android");

        try {
            Toast.makeText(this, "Shopee", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/search?keyword=senka%20cleansing")));
        }
    }


    }

