package com.example.abdirashidjama.grapplingjournal;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.app.ListActivity;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import java.util.List;
import java.util.StringTokenizer;

public class ListofMovesScreen extends AppCompatActivity {

    ListView listView;
    List<String> techniques= new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        loadData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_moves_screen);
        listView = (ListView)findViewById(R.id.list);

        String[] tech= new String[techniques.size()];
        tech = techniques.toArray(tech);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,tech);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void loadData() {
        File file= getApplicationContext().getFileStreamPath("techniques.txt");
        String lineFromFile;
        if(file.exists()){
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(openFileInput("techniques.txt")));
                while((lineFromFile = reader.readLine()) !=null) {
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream is = new ObjectInputStream(fis);
                    Technique simpleClass = (Technique) is.readObject();
                    techniques.add(simpleClass.toString());
                    is.close();
                    fis.close();
                }
            }
            catch (IOException e) {
            e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        }
    }
}
