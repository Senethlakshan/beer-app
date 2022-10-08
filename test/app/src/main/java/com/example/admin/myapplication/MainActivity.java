package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void findBeer(View view){

        TextView txt = findViewById(R.id.textView);
        Spinner spinnerlist = findViewById(R.id.spinner);
        String beerType = String.valueOf(spinnerlist.getSelectedItem());

        Findbeer getbeer = new Findbeer();
        List<String> selectedbeer = getbeer.getBrnds(beerType);

        StringBuilder finalBrands = new StringBuilder();

        for(String brands: selectedbeer){

            finalBrands.append(brands).append("\n");

        }

        txt.setText(finalBrands);
    }
}
