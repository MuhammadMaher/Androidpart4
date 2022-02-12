package com.example.androidpart4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

   // ArrayList<String> names= new ArrayList<>();
    ArrayList<String> names= new ArrayList<>();// ليس لها fixedSize

    RecyclerView recyclerViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNames();
        recyclerViewName=findViewById(R.id.rv_names);
        NamesAdapter namesAdapter=new NamesAdapter(names);
        recyclerViewName.setAdapter(namesAdapter);

    }

    private void addNames(){
        names.add("Mohamed Maheer");
        names.add("Amir");
        names.add("Barakat");
        names.add("Ali");
        names.add("Haidy");
        names.add("Ahmed");
        names.add("Mostafa");
        names.add("AbdelRahman");
        names.add("Tarek");
        names.add("Alaa");
        names.add("Eid");

        Log.i(TAG, "addNames: "+ names.size());// array كنت بستخدم .length();
        for (int i = 0; i < names.size(); i++) {
            Log.i(TAG, "addNames: "+names.get(i));//names[i]
            
        }
    }

    public void AlertDialog(View view) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Warning...")
                .setMessage("Do you need to CLose App")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() { //new
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel",null)
                .show();
    }
}