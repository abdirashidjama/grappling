package com.example.abdirashidjama.grapplingjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onGetTechnique(View view) {
        Intent getTechniqueScreenIntent = new Intent(this, TechniqueScreen.class);
        startActivity(getTechniqueScreenIntent);
    }

    public void onGetListofMoves(View view){
        Intent getListofMovesIntent= new Intent(this, ListofMovesScreen.class);
        startActivity(getListofMovesIntent);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Handle the logic for the requestCode, resultCode and data returned...

        String name = data.getStringExtra("nameofmove");
        Technique obj= new Technique(name);
        try {
            String FILENAME= "techniques.txt";
            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(obj);
            os.close();
            fos.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
