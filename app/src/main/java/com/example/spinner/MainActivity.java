package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    String[] countryName;
    String[] currencyName;

    int[] flags = {R.drawable.america, R.drawable.austria, R.drawable.azerbaijan,
            R.drawable.canada, R.drawable.georgia, R.drawable.nepal, R.drawable.netherlands,
            R.drawable.red_crse, R.drawable.suriname, R.drawable.turkey};

    private Button button;

    private TextView setTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.countryName);

        currencyName = getResources().getStringArray(R.array.currencyName);

        spinner = findViewById(R.id.spinnerId);
        button = findViewById(R.id.buttonId);
        setTextView = findViewById(R.id.textViewId);



        CustomAdapter customAdapter = new CustomAdapter(this, flags, countryName, currencyName);
        spinner.setAdapter(customAdapter);
    }

}