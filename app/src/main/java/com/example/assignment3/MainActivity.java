package com.example.assignment3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText noteText;
    Button addNoteButton;
    ListView list;
    ArrayAdapter <String> adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noteText = (EditText) findViewById(R.id.noteText);
        addNoteButton = (Button) findViewById(R.id.addNoteButton);
        list = (ListView) findViewById(R.id.list);
        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);
        addNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(noteText.getText().toString());

                adapter.notifyDataSetChanged();




            }
        });

    }
}
