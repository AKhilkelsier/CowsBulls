package com.example.cowsbulls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
public class twoplayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer);
        getSupportActionBar().hide();
        Button gb=(Button) findViewById(R.id.gb);
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(twoplayer.this,Start11.class);
                startActivity(intent);
            }
        });
        Button player1submit=(Button) findViewById(R.id.player1submit);
        player1submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et=(EditText) findViewById(R.id.player1num);
                String secretnumber=et.getText().toString();
                Intent intent=new Intent(twoplayer.this,twoplayerg.class);
                intent.putExtra("sn",secretnumber);
                startActivity(intent);
            }
        });

    }
}