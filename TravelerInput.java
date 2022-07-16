package com.example.orderflight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class TravelerInput extends AppCompatActivity {
    EditText travelerFirstName;
    EditText travelerLastName;
    EditText travelerAge;
    Button btnContinue2;
//    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveler_input);
        findViews();
        setListeners();

    }


    private void setListeners() {



    btnContinue2.setOnClickListener(view -> {
        String fName = travelerFirstName.getText().toString();
        String lName = travelerLastName.getText().toString();
        String age = travelerAge.getText().toString();

        Traveler traveler = new Traveler(fName,lName,Integer.parseInt(age));
        Intent intent = new Intent(this , TravelerData.class);
        intent.putExtra("TRAVELER" , traveler);
        pushSerializableExtra(intent);

        startActivity(intent);
    });
    }

    private void pushSerializableExtra(Intent intent) {
        Intent intentFlight = getIntent();
        Serializable y =  (Flight)intentFlight.getSerializableExtra("FLIGHT");
        Flight flight = (Flight) y;
        intent.putExtra("FLIGHT" , flight);
    }

    private void findViews() {
        travelerFirstName = findViewById(R.id.et_personal_name);
        travelerLastName = findViewById(R.id.et_sure_name);
        travelerAge = findViewById(R.id.et_age);
        btnContinue2 = findViewById(R.id.btn_continue2);

    }
}