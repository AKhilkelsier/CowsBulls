package com.example.cowsbulls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class twoplayerg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youvscreator);
        getSupportActionBar().hide();
        //int A=(new Random().nextInt(9000))+999;
        TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
        creatorguess.setText("Player2 has 10 chances to guess Player1's secret number");
        Intent intent=getIntent();
        String sn=intent.getStringExtra("sn");
        int A=Integer.parseInt(sn);
        char[] a=sn.toCharArray();
        String[] num = {"1108"};
        ImageButton c2=(ImageButton) findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in2);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out2);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 8 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c1=(ImageButton) findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in1);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out1);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 9 chances to guess Player1's secret number");}
            }
        });
        ImageButton c3=(ImageButton) findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in3);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out3);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 7 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c4=(ImageButton) findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in4);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out4);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 6 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c5=(ImageButton) findViewById(R.id.c5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in5);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out5);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 5 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c6=(ImageButton) findViewById(R.id.c6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in6);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out6);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 4 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c7=(ImageButton) findViewById(R.id.c7);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in7);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out7);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 3 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c8=(ImageButton) findViewById(R.id.c8);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in8);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out8);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 has 2 chances to guess Player1's secret number");
                }
            }
        });
        ImageButton c9=(ImageButton) findViewById(R.id.c9);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in9);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out9);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else {
                    TextView creatorguess = (TextView) findViewById(R.id.creatorguess);
                    creatorguess.setText("Player2 this is your last chance.");
                }
            }
        });
        ImageButton c10=(ImageButton) findViewById(R.id.c10);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] a=Integer.toString(A).toCharArray();
                int c=0,b=0;
                EditText number=(EditText) findViewById(R.id.in10);
                num[0] =number.getText().toString();
                char[] n= num[0].toCharArray();
                for(int j=0;j<4;j++) {
                    if(n[j]==a[j]) {
                        b++;
                        n[j]=a[j]='#';
                    }
                }
                for(int k=0;k<4;k++) {
                    for(int r=0;r<4;r++) {
                        if(a[k]==n[r] && a[k]!='#') {
                            c++;
                            a[k]=n[r]='#';
                        }
                    }
                }
                TextView out=(TextView) findViewById(R.id.out10);
                out.setText(Integer.toString(b)+" Bulls,"+Integer.toString(c)+" Cows");
                number.setEnabled(false);
                if(b==4){
                    Guessed(A);
                }else{
                    TextView youlost2=(TextView) findViewById(R.id.youlost2);
                    youlost2.setText("The secret number is "+Integer.toString(A));
                    youlost2.setVisibility(1);
                    TextView creatorguess=(TextView)findViewById(R.id.creatorguess);
                    creatorguess.setText("Player1 Won");
                    creatorguess.setTextSize(50);
                    Button playagain1=(Button) findViewById(R.id.playagain2);
                    playagain1.setVisibility(1);
                    Button h3=(Button) findViewById(R.id.h3);
                    h3.setVisibility(1);
                    h3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent2=new Intent(twoplayerg.this,MainActivity.class);
                            startActivity(intent2);
                        }
                    });
                    playagain1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent1=new Intent(twoplayerg.this,twoplayer.class);
                            startActivity(intent1);
                        }
                    });
                }
            }
        });
        Button iquit=(Button) findViewById(R.id.iquit);
        iquit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView creatorguess=(TextView)findViewById(R.id.creatorguess);
                creatorguess.setText("Player1 Won");
                creatorguess.setTextSize(50);
                creatorguess.setEnabled(false);
                TextView youlost1=(TextView) findViewById(R.id.youlost2);
                youlost1.setText("The secret number is "+Integer.toString(A));
                youlost1.setVisibility(1);
                Button playagain1=(Button) findViewById(R.id.playagain2);
                playagain1.setVisibility(1);
                Button h3=(Button) findViewById(R.id.h3);
                h3.setVisibility(1);
                h3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2=new Intent(twoplayerg.this,MainActivity.class);
                        startActivity(intent2);
                    }
                });
                playagain1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(twoplayerg.this,twoplayer.class);
                        startActivity(intent1);
                    }
                });

            }
        });
    }
    private void Guessed(int A){
        Button iquit=(Button) findViewById(R.id.iquit);
        iquit.setVisibility(View.INVISIBLE);
        TextView guessed1=(TextView) findViewById(R.id.guessed1);
        guessed1.setText("Congratulations! you guessed it right.\n Secret number is "+Integer.toString(A));
        Button playagain2=(Button) findViewById(R.id.playagain2);
        playagain2.setVisibility(1);
        Button h3=(Button) findViewById(R.id.h3);
        h3.setVisibility(1);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(twoplayerg.this,MainActivity.class);
                startActivity(intent2);
            }
        });
        playagain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(twoplayerg.this,twoplayer.class);
                startActivity(intent1);
            }
        });
        TextView creatorguess=(TextView)findViewById(R.id.creatorguess);
        creatorguess.setText("Player2 Won");
        creatorguess.setTextSize(50);
        creatorguess.setEnabled(false);
    }
}