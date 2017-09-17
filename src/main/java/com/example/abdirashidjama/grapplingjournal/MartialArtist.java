package com.example.abdirashidjama.grapplingjournal;

/**
 * Created by abdirashidjama on 2017-09-15.
 */

import java.util.ArrayList;
import java.util.List;

public class MartialArtist {
    String name;
    int weight;
    List<Technique> techniques = new ArrayList();

    public MartialArtist(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int w) {
        this.weight = w;
    }

    public void setTechniques(List techniques) {
        this.techniques.addAll(techniques);
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public List getTechniques() {
        return this.techniques;
    }

    public String toString() {
        String output = this.getName() + '\n' + "Techniques";

        for(int i = 0; i < this.techniques.size(); ++i) {
            output = output + '\n' + ((Technique)this.techniques.get(i)).getName();
        }

        return output;
    }
}
