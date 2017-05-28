package com.ziterz.liga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] timLiga = new String[]{
            "Arema FC", "Bali United", "Barito Putra", "Bhayangkara FC", "Borneo FC", "Madura United",
            "Mitra Kutai Kartanegara", "Persegres Gresik United", "Persela Lamongan", "Persib Bandung",
            "Persiba Balikpapan", "Persija Jakarta", "Persipura Jayapura", "PS TNI", "PSM Makassar",
            "Semen Padang", "Sriwijaya FC"
    };

    private ListView listView;
    ArrayList<Tim> timArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(getBaseContext(),
//                android.R.layout.simple_list_item_1, android.R.id.text1, timLiga);
//
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getBaseContext(), "Item ini pada index ke : " + position, Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
//                intent.putExtra("nama",timLiga[position]);
//                startActivity(intent);
//            }
//        });

        timArrayList = new ArrayList<>();
        timArrayList.add(new Tim("Liquid","Team Liquid","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROrAE5xw-JoF9OgljM5Yi7FpRbg3noAqN4NYDtWG5UjOwGPqyklA"));
        timArrayList.add(new Tim("Newbee","Newbee","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR21Fm0LB7f6roYFuqZgcZ_u2jfTdVN_ROYY-MUITL8wU6I137P"));
        timArrayList.add(new Tim("Secret","Team Secret","http://virtualverbal.com/wp-content/uploads/2017/05/Team-Dota-2-yang-Diatas-Angin-Pasca-Kiev-Major-2017-01.png"));
        timArrayList.add(new Tim("OG","OG","https://hydra-media.cursecdn.com/dota2.gamepedia.com/thumb/f/fd/Team_icon_OG.png/256px-Team_icon_OG.png?version=ce87c9d9e363628a6a78c0cd8321af4b"));
        timArrayList.add(new Tim("Na`Vi","Natus Vincere","https://2.bp.blogspot.com/-h8n1yRlrjV4/V4c2D7QPdtI/AAAAAAAAAJM/cAqynELBQn8pPOnUQ7D83x5FZt5od-cZwCLcB/s1600/Navi_logo.png"));
        timArrayList.add(new Tim("Alliance","Alliance","http://3.bp.blogspot.com/-HpRol0DZO3o/U55UZ8X-CUI/AAAAAAAADt8/BBBhrzJgYKA/s1600/Alliance.png"));

        TimAdapter adapter = new TimAdapter(getBaseContext(), timArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent (getBaseContext(),DetailActivity.class);
                intent.putExtra("TIM",timArrayList.get(position));
                startActivity(intent);
            }
        });
    }
}
