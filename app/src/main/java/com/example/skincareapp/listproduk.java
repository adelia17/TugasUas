package com.example.skincareapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class listproduk extends AppCompatActivity {

    ListView lv_produk;
    String nproduk[]={"Benton","Cetaphil","Clinique","Cosrx","Innisfree", "Kiehl's","Laneige",
                       "Nature Republic","Senka","SK II", "The Body Shop","Wardah",};
    ArrayAdapter adapter;
    ArrayList <HashMap<String, String>> myproduk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listproduk);

        lv_produk= findViewById(R.id.listproduk);

        listproduk.Myadapter1 adapter = new listproduk.Myadapter1(this, nproduk);
        lv_produk.setAdapter(adapter);

        lv_produk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Intent intent = new Intent(getApplicationContext(), benton.class);
                    startActivity(intent);
                }

                if (position ==  1) {
                    Intent intent = new Intent(getApplicationContext(), cetaphil2.class);
                    startActivity(intent);
                }

                if (position ==  2) {
                    Intent intent = new Intent(getApplicationContext(), clinique.class);
                    startActivity(intent);
                }
                if (position ==  3) {
                    Intent intent = new Intent(getApplicationContext(), cosrx.class);
                    startActivity(intent);
                }
                if (position ==  4) {
                    Intent intent = new Intent(getApplicationContext(), innisfree.class);
                    startActivity(intent);
                }
                if (position ==  5) {
                    Intent intent = new Intent(getApplicationContext(), kiehls.class);
                    startActivity(intent);
                }
                if (position ==  6) {
                    Intent intent = new Intent(getApplicationContext(), laneige.class);
                    startActivity(intent);
                }
                if (position ==  7) {
                    Intent intent = new Intent(getApplicationContext(), natrep.class);
                    startActivity(intent);
                }
                if (position ==  8) {
                    Intent intent = new Intent(getApplicationContext(), senka.class);
                    startActivity(intent);
                }
                if (position ==  9) {
                    Intent intent = new Intent(getApplicationContext(),sk2.class);
                    startActivity(intent);
                }
                if (position ==  10) {
                    Intent intent = new Intent(getApplicationContext(),tbs.class);
                    startActivity(intent);
                }
                if (position ==  11) {
                    Intent intent = new Intent(getApplicationContext(),wardah.class);
                    startActivity(intent);
                }





            }
        });

    }

    class Myadapter1 extends ArrayAdapter<String> {
        Context context;
        String[] nproduk;


        Myadapter1(Context c, String Produk[]) {
            super(c, R.layout.bantu, R.id.produk, Produk);
            this.context = c;
            this.nproduk = Produk;

        }



        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View bantu = layoutInflater.inflate(R.layout.bantu, parent, false);
            TextView produk = bantu.findViewById(R.id.produk);
            produk.setText(nproduk[position]);

            return bantu;

        }
    }
}
