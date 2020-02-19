package com.sih.codeforcesanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayThrough extends AppCompatActivity {


    Button proceed,cf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_through);
        // add any number of RadioButton resource IDs here

        cf=findViewById(R.id.cf);
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PayThrough.this,MainActivity.class));
            }
        });


    }
}
