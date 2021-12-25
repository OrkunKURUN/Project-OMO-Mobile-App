package com.omo.projectomo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ClaimStolen extends AppCompatActivity {
    String idClaim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.claim_stolen);

        EditText id = (EditText) findViewById(R.id.idToClaim);
        Button claim = (Button) findViewById(R.id.buttonClaimStolen);

        /*claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idClaim = id.getText().toString();


            }
        });*/
    }
}