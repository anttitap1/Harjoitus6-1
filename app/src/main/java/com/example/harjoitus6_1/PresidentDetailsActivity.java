package com.example.harjoitus6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PresidentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_details);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.EXTRA_MESSAGE, 0);

        ((TextView)findViewById(R.id.textViewNimi)).setText(PresidentList.getInstance().getPresident(i).getKokonimi());
        ((TextView)findViewById(R.id.textViewAloitti)).setText(Integer.toString(PresidentList.getInstance().getPresident(i).getAloitti()));
        ((TextView)findViewById(R.id.textViewLopetti)).setText(Integer.toString(PresidentList.getInstance().getPresident(i).getLopetti()));
        ((TextView)findViewById(R.id.textViewKuvaus)).setText(PresidentList.getInstance().getPresident(i).getKuvaus());

    }
}
