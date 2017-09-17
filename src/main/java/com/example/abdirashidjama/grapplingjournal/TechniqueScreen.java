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



public class TechniqueScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique_screen);

    }

    public void OnSaveTechnique(View view) {

        //Intent Main = getIntent();
        //String name = Main.getStringExtra().getString();
        finish();
        setResult(MainActivity.RESULT_OK, getIntent());


    }
}
