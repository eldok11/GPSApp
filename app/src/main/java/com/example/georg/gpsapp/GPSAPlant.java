package com.example.georg.gpsapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Toast;

public class GPSAPlant extends AppCompatActivity {

    public static final int CAMERA_REQUEST = 10;
    private AutoCompleteTextView actPlantName;
    private ImageView imgSpecimenPhoto;

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

    //photo buttoen geklickt
    public void btnTagePhotoClicked(View view) {
        Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Weenn der user ok gewählt hat un nicht abgebrochen hat.
        if(resultCode==RESULT_OK){
        if(requestCode==CAMERA_REQUEST){
            //We hören zurück von der Kamera
            Bitmap cameraImage = (Bitmap)data.getExtras().get("data");

            //get access to the image view.
            imgSpecimenPhoto = findViewById(R.id.imgSpecimenphoto);
            imgSpecimenPhoto.setImageBitmap(cameraImage);


        }
    }
}}
