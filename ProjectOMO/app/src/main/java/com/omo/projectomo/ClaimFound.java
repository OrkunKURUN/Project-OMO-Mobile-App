package com.omo.projectomo;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClaimFound extends AppCompatActivity {
    private String idClaim;
    private StolenBikeDatabase dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.claim_found);

        EditText id = (EditText) findViewById(R.id.idToDelete);
        Button claim = (Button) findViewById(R.id.deleteButton);
        dbManager = new StolenBikeDatabase(this);

        claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idClaim = id.getText().toString();
                deleteRecord(idClaim);
            }
        });

    }

    public void deleteRecord(String id){
        SQLiteDatabase db = dbManager.getReadableDatabase();
        db.execSQL("DELETE FROM stolenBikes WHERE bike_id = '"+id+"'");
        Toast.makeText(getApplicationContext(),"Record deleted!",Toast.LENGTH_LONG).show();
    }
}
