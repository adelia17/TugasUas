package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splashactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
         Thread thread = new Thread(){
             public void run(){
                 try{
                     sleep(1000);
                 }catch(InterruptedException e){
                     e.printStackTrace();
                 }finally {
                     startActivity(new Intent (splashactivity.this, halpertama.class));
                     finish();
                 }
             }
         };

         thread.start();
    }
}
