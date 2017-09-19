package com.example.abdirashidjama.grapplingjournal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class TechniqueScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique_screen);

    }

    public void OnSaveTechnique(View view){

        TextView nameofmove= (TextView) findViewById(R.id.nameofmove);
        String filename = "myfile";
        String name = nameofmove.getText().toString();
        TextView positionofmove = (TextView) findViewById(R.id.positionofmove);
        String position = positionofmove.getText().toString();
        FileReadandWrite.write_file(this, filename, new Technique(name, position).toString());
        finish();
        setResult(MainActivity.RESULT_OK, getIntent());
        }

}
