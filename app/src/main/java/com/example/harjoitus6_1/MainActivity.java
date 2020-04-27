package com.example.harjoitus6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.harjoitus61.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lv = findViewById(R.id.presidentsListView);

        lv.setAdapter(new ArrayAdapter<President>(
                this,
                android.R.layout.simple_list_item_1,
                PresidentList.getInstance().getPresidents()
        ));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nextActivity = new Intent(MainActivity.this, PresidentDetailsActivity.class);
                nextActivity.putExtra(EXTRA_MESSAGE, position);
                startActivity(nextActivity);
            }
        });
    }
}
