package com.example.cowsbulls;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.content.Context;
import android.view.View;

import android.os.Bundle;

public class Start11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_start11);
        Button twop =(Button) findViewById(R.id.twop);
        twop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Start11.this, twoplayer.class);
                startActivity(intent);
            }
        });
        Button h1=(Button)findViewById(R.id.h1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Start11.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button yvsc=(Button)findViewById(R.id.yvsc);
        yvsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context ctx=v.getContext();
                Intent intent=new Intent(Start11.this, youvscreator.class);
                ctx.startActivity(intent);
            }
        });

    }



}