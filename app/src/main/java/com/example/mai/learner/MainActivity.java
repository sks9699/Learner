package com.example.mai.learner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button c,java,phyton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button c=findViewById(R.id.cc);
        Button java=findViewById(R.id.java);
        Button phyton=findViewById(R.id.python);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("key",a);
                startActivity(intent);

            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b=2;
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
               i.putExtra("key",b);
                startActivity(i);
            }
        });
        phyton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=3;
                Intent j=new Intent(MainActivity.this,MainActivity2.class);
                j.putExtra("key",n);
                startActivity(j);
            }
        });
    }
}