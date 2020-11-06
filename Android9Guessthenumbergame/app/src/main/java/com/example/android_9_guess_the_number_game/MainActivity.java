package com.example.android_9_guess_the_number_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.bt1);
        button1.setOnClickListener(bt1);

        Button button2 = (Button)findViewById(R.id.bt2);
        button2.setOnClickListener(bt2);

        Button button3 = (Button)findViewById(R.id.bt3);
        button3.setOnClickListener(bt3);

        Button button4 = (Button)findViewById(R.id.bt4);
        button4.setOnClickListener(bt4);

        Button button5 = (Button)findViewById(R.id.bt5);
        button5.setOnClickListener(bt5);

        Button button6 = (Button)findViewById(R.id.bt6);
        button6.setOnClickListener(bt6);

        Button button7 = (Button)findViewById(R.id.bt7);
        button7.setOnClickListener(bt7);

        Button button8 = (Button)findViewById(R.id.bt8);
        button8.setOnClickListener(bt8);

        Button button9 = (Button)findViewById(R.id.bt9);
        button9.setOnClickListener(bt9);

        Button button10 = (Button)findViewById(R.id.bt10);
        button10.setOnClickListener(bt10);
    }
    private View.OnClickListener bt1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("1");
        }
    };
    private View.OnClickListener bt2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("2");
        }
    };
    private View.OnClickListener bt3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("3");
        }
    };
    private View.OnClickListener bt4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("4");
        }
    };
    private View.OnClickListener bt5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("5");
        }
    };
    private View.OnClickListener bt6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("6");
        }
    };
    private View.OnClickListener bt7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("7");
        }
    };
    private View.OnClickListener bt8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("8");
        }
    };
    private View.OnClickListener bt9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView)findViewById(R.id.tv2);
            nb.setText("9");
        }
    };
    private View.OnClickListener bt10 = new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            int count = 0;
        }
    };


    public void bt11(View v){

        TextView number = (TextView)findViewById(R.id.tv2);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUMBER", number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}