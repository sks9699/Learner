package com.example.mai.learner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    EditText edit;
    String[] py = {
            "Python Intro", "Python Get Started", "Python Syntax", "Python Comments", "Python Variables", "Python Data Types", "Python Numbers", "Python Casting", "Python Strings", "Python Booleans", "Python Operators", "Python Lists", "Python Tuples", "Python Sets", "Python Dictionaries", "Python If...Else", "Python While Loops", "Python For Loops", "Python Functions", "Python Lambda", "Python Arrays", "Python Classes/Objects", "Python Inhe,itance", "Python Iterators", "Python Scope", "Python Modules", "Python Dates", "Python Math", "Python JSON", "Python RegEx", "Python PIP", "Python Try...Except", "Python User Input", "Python Formatting"};
    String[] java = {"Java Intro", "Java Get Started", "Java Syntax", "Java Output", "Java Comments", "Java Variables", "Java Data Types", "Java Type Casting", "Java Operators", "Java Strings", "Java Math", "Java Booleans", "Java If...Else", "Java Switch", "Java While Loop", "Java For Loop", "Java Break/Continue", "Java Arrays",};
    String[] c = {"C GET STARTED", "C Synatx", "C Output", "C Comments", "C Variables", "C Data Types", "C Constants", "C Operators", "C if...Else", "C Switch", "C While Loop", "C For Loop", "C Break/Continue", "C Arrays", "C Strings", "C User Input", "C Memory Address", "C Pointers"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = findViewById(R.id.list);
        EditText edit = findViewById(R.id.heading);
       int m = getIntent().getIntExtra("key",0);
        if (m == 1) {
            edit.setText("C Tutorials");
            ArrayAdapter<String> arr = new ArrayAdapter<String>(MainActivity2.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, c);
            listView.setAdapter(arr);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=arr.getItem(i);
                Intent n=new Intent(MainActivity2.this,MainActivity3.class);
                n.putExtra("kit",value);
                startActivity(n);
            }
        });
        } else if (m == 2) {
            edit.setText("Java Tutorials");
            ArrayAdapter<String> mrr = new ArrayAdapter<String>(MainActivity2.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, java);
            listView.setAdapter(mrr);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String value=mrr.getItem(i);
                    Intent n=new Intent(MainActivity2.this,MainActivity3.class);
                    n.putExtra("kit",value);
                    startActivity(n);
                }
            });
        } else {
            edit.setText("Pyhton Tutorials");
            ArrayAdapter<String> crr = new ArrayAdapter<String>(MainActivity2.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, py);
            listView.setAdapter(crr);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String value=crr.getItem(i);
                    Intent n=new Intent(MainActivity2.this,MainActivity3.class);
                    n.putExtra("kit",value);
                    startActivity(n);
                }
            });
        }
    }
}