package com.ziterz.liga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] timLiga = new String[]{
            "Arema FC", "Bali United", "Barito Putra", "Bhayangkara FC", "Borneo FC", "Madura United",
            "Mitra Kutai Kartanegara", "Persegres Gresik United", "Persela Lamongan", "Persib Bandung",
            "Persiba Balikpapan", "Persija Jakarta", "Persipura Jayapura", "PS TNI", "PSM Makassar",
            "Semen Padang", "Sriwijaya FC"
    };

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, timLiga);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Item ini pada index ke : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
