package com.example.abdirashidjama.grapplingjournal;

/**
 * Created by abdirashidjama on 2017-09-15.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Techclass {
    Date currentdate;
    String instructor;
    List<Technique> techniques = new ArrayList();

    public Techclass(String instructor, Date currentdate) {
    }

    public void setTechniques(List<Technique> techniques) {
        this.techniques.addAll(techniques);
    }

    public List<Technique> getTechniques() {
        return this.techniques;
    }
}
