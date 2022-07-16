package com.example.orderflight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class TravelerData extends AppCompatActivity {
    TextView fName;
    TextView lName;
    TextView age;
    TextView destination;
    TextView travelers;
    TextView hasPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveler_data);
        findViews();
    }

    private void findViews() {
        fName = findViewById(R.id.tv_first_name);
        lName  =findViewById(R.id.tv_last_name);
        age  = findViewById(R.id.tv_age);
        destination = findViewById(R.id.tv_destination);
        travelers = findViewById(R.id.tv_travelers);
        hasPet = findViewById(R.id.has_pet);

        Intent intent = getIntent();

        Serializable x =  (Traveler)intent.getSerializableExtra("TRAVELER");
        Serializable y =  (Flight)intent.getSerializableExtra("FLIGHT");

            Traveler traveler  = (Traveler) x ;
         fName.setText(traveler.getfName());
         lName.setText(traveler.getlName());
         age.setText(String.valueOf(traveler.getAge()));

         Flight flight = (Flight) y;
         destination.setText(flight.getDestination());
        travelers.setText(String.valueOf(flight.getNumberOfTravelers()));
        if(flight.isHsPet()){
            hasPet.setText("has pet");
        }else if(!flight.isHsPet()){
            hasPet.setText("no pets");
        }else{
            hasPet.setText("what??");
        }




    }
}