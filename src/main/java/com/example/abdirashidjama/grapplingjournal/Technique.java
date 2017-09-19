package com.example.abdirashidjama.grapplingjournal;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdirashidjama on 2017-09-15.
 */

import java.util.ArrayList;
import java.util.List;

    public class Technique implements Serializable{
        String name;
        String position;
        String type;
        int drilled;
        List transitions = new ArrayList();
        List notes = new ArrayList();

        public Technique(String name, String position, String type) {
            this.name = name;
            this.position = position;
            this.type = type;
        }
        public Technique(String name){
            this.name = name;
        }
        public Technique(String name, String position){
            this.name = name;
            this.position = position;
        }

        public void setDrilled(int drilled) {
            this.drilled = drilled;
        }

        public void setTransitions(List transitions) {
            this.transitions.addAll(transitions);
        }

        public void setNotes(List notes) {
            this.notes.addAll(notes);
        }

        public String getName() {
            return this.name;
        }


        public String toString() {
            return this.name + " " + this.position;
        }

        public static Technique load(Context context){
            ObjectInputStream input;
            Technique obj=null;
            String fileName = "technique.srl";
            try{
                FileInputStream fis = context.openFileInput(fileName);
                ObjectInputStream is = new ObjectInputStream(fis);
                Technique simpleClass = (Technique) is.readObject();
                obj=simpleClass;
                is.close();
                fis.close();
                return simpleClass;
                //techniques.add(simpleClass.toString());

            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if(obj!=null){
            return obj;}
            return new Technique("no moves add some");


        }

        public void save(Context context){

            ObjectOutput out = null;
            try {
                String fileName= "technique.srl";
                FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
                ObjectOutputStream os = new ObjectOutputStream(fos);
                os.writeObject(this);
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


