package com.example.abdirashidjama.grapplingjournal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdirashidjama on 2017-09-15.
 */

import java.util.ArrayList;
import java.util.List;

    public class Technique {
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
        public Technique(String name){}

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
    }


