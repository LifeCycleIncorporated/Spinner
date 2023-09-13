package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinners;
    String[] countryName;
    String[] currencyName;

    int[] flags = {R.drawable.america, R.drawable.austria, R.drawable.azerbaijan,
            R.drawable.canada, R.drawable.georgia, R.drawable.nepal, R.drawable.netherlands,
            R.drawable.red_crse, R.drawable.suriname, R.drawable.turkey};

    private Button buttonss;

    private TextView setTextViewss;

    private boolean isFirstItemSelected = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.countryName);

        currencyName = getResources().getStringArray(R.array.currencyName);

        spinners = findViewById(R.id.spinnerId);
        buttonss = findViewById(R.id.buttonId);
        setTextViewss = findViewById(R.id.textViewId);



        CustomAdapter customAdapter = new CustomAdapter(this, flags, countryName, currencyName);
        spinners.setAdapter(customAdapter);

        spinners.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (isFirstItemSelected){
                    isFirstItemSelected = false;
                }
                else {
                    Toast.makeText(MainActivity.this, countryName[i]+" is Selected", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}