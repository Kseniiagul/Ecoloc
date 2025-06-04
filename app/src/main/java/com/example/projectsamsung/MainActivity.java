package com.example.projectsamsung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button mapbut, manualbut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        mapbut = findViewById(R.id.map_btn);
        mapbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Map = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(Map);
            }
        });
        manualbut = findViewById(R.id.manual_btn);
        manualbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Manual = new Intent(MainActivity.this, ManualActivity.class);
                startActivity(Manual);
            }
        });
    }
}