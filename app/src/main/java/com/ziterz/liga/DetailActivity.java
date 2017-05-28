package com.ziterz.liga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView nama_lengkap,nama_singkat;
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Tim tim = getIntent().getParcelableExtra("TIM");


        nama_lengkap = (TextView) findViewById(R.id.nama_lengkap);
        nama_singkat = (TextView) findViewById(R.id.nama_singkat);
        logo = (ImageView) findViewById(R.id.logo);

        nama_lengkap.setText(tim.getNamaLengkap());
        nama_singkat.setText(tim.getNamaSingkat());
        Picasso.with(getBaseContext()).load(tim.getUrlLogo()).into(logo);

    }
}
