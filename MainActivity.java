package com.example.orderflight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button btnContinue;
    EditText editDestination;
    EditText editNumOfTravelers;
    Switch hasPetSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews() {
        btnContinue = findViewById(R.id.btn_continue1);
        editDestination = findViewById(R.id.et_destination);
        editNumOfTravelers = findViewById(R.id.et_number_of_pass);
        hasPetSwitch = findViewById(R.id.switch1);
    }

    private  void setListeners(){

        btnContinue.setOnClickListener(view -> {


            String des = editDestination.getText().toString();
            String num = editNumOfTravelers.getText().toString();

            Boolean hasPet = hasPetSwitch.isChecked();

            Flight flight  = new Flight(des ,Integer.parseInt(num) , hasPet);
            Intent intent = new Intent(this , TravelerInput.class);

           intent.putExtra("FLIGHT" , flight);

            startActivity(intent);

        });
    }
}