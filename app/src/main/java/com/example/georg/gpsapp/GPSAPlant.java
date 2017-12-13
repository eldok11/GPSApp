package com.example.georg.gpsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class GPSAPlant extends AppCompatActivity {

    private AutoCompleteTextView actPlantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpsaplant);

        actPlantName =findViewById(R.id.actPlantName);
    }

    public void btnPausedGPSClicked(View view) {
        Toast.makeText(this,"Buttton Clicked",Toast.LENGTH_LONG).show();
    }

    /**
     * Ausgelöst, wenn ShowSaved geklickt wurde
     * @param view
     */
    public void btnShowSavedClicked(View view) {
        String plantName = actPlantName.getText().toString();
        Toast.makeText(this,plantName,Toast.LENGTH_LONG).show();

    }
}
