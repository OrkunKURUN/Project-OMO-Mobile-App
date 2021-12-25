package com.omo.projectomo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CheckStolen extends AppCompatActivity {
    String idCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_stolen);

        EditText id = (EditText) findViewById(R.id.idToCheck);
        Button check = (Button) findViewById(R.id.buttonCheckStolen);

        /*check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idCheck = id.getText().toString();


            }
        });*/
    }
}
