package com.example.recipehub;

import android.content.Intent;
import android.os.Bundle;

import com.example.recipehub.ui.main.SectionsPagerAdapterd;
import com.example.recipehub.ui.main.SectionsPagerAdapterf;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.recipehub.ui.main.SectionsPagerAdapter;

public class fried extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fried);
        SectionsPagerAdapterf sectionsPagerAdapterf = new SectionsPagerAdapterf(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapterf);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fried.this, fvid.class));
            }
        });
    }
}