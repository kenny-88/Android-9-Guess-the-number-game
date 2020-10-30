package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        answer();
    }

    public void bt12(View v){
        finish();
    }
    private void answer(){
        int number;

        Random nb = new Random();
        int answer = nb.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null){

            number = Integer.parseInt(bundle.getString("NUMBER"));
            TextView tf = (TextView)findViewById(R.id.tv3);
            TextView tv4 = (TextView)findViewById(R.id.tv4);

            if (number == answer){
                tv4.setText("答對了");
                tf.setText("○");

            }
            else if (number > answer){
                tv4.setText("猜小點");
                tf.setText("X");

            }
            else if (number < answer){
                tv4.setText("猜大點");
                tf.setText("X");
            }
        }
    }
}