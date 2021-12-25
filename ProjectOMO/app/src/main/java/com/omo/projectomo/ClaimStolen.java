package com.omo.projectomo;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClaimStolen extends AppCompatActivity {
    private String idClaim;
    private StolenBikeDatabase dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.claim_stolen);

        EditText id = (EditText) findViewById(R.id.idToClaim);
        Button claim = (Button) findViewById(R.id.claimButton);
        dbManager = new StolenBikeDatabase(this);


        claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idClaim = id.getText().toString();
                newRecord(idClaim);

            }
        });
    }
    public void newRecord(String id){
        SQLiteDatabase db = dbManager.getReadableDatabase();
        db.execSQL("INSERT INTO stolenBikes VALUES('"+id+"')");
        Toast.makeText(getApplicationContext(),"Record added!",Toast.LENGTH_LONG).show();
    }

}