package com.ziterz.liga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namaLiga = getIntent().getStringExtra("nama");
        nama = (TextView) findViewById(R.id.nama);

        nama.setText(namaLiga+"");
    }
}
