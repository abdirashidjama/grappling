package com.example.abdirashidjama.grapplingjournal;

/**
 * Created by abdirashidjama on 2017-09-18.
 */
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class FileReadandWrite {
    public static List<String> read_file(Context context, String filename) {
        List<String> techniques= new ArrayList();
        try {
            FileInputStream fis = context.openFileInput(filename);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String line;
            String newline;
            while ((line = bufferedReader.readLine()) != null) {
                sb.setLength(0);
                if((newline = sb.append(line).toString())!="") {
                    techniques.add(newline);
                }

            }
            //techniques.add(sb.toString());
            return techniques; //sb.toString();
        } catch (FileNotFoundException e) {
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }
    public static void write_file(Context context, String filename, String data){



        FileOutputStream outputStream;
        try {
            outputStream = context.openFileOutput(filename, Context.MODE_APPEND);
            outputStream.write(("\n").getBytes());
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
