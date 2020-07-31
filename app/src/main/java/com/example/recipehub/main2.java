package com.example.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class main2 extends AppCompatActivity {

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openchilli();
            }
        });

        button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendimsum();
            }
        });

        button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfriedrice();
            }
        });

        button4 = (ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmanchurian();
            }
        });

        button5 = (ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openspringroll();
            }
        });
    }

    public void openchilli()
    {
        Intent intent = new Intent(this, chilli.class);
        startActivity(intent);
    }

    public void opendimsum()
    {
        Intent intent = new Intent(this, dim.class);
        startActivity(intent);
    }

    public void openfriedrice()
    {
        Intent intent = new Intent(this, fried.class);
        startActivity(intent);
    }

    public void openmanchurian()
    {
        Intent intent = new Intent(this, manch.class);
        startActivity(intent);
    }

    public void openspringroll()
    {
        Intent intent = new Intent(this, spring.class);
        startActivity(intent);
    }

}
