package com.sih.codeforcesanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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


        String GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
        int GOOGLE_PAY_REQUEST_CODE = 123;

        Uri uri =
                new Uri.Builder()
                        .scheme("upi")
                        .authority("pay")
                        .appendQueryParameter("pa", "your-merchant-vpa@xxx")
                        .appendQueryParameter("pn", "your-merchant-name")
                        .appendQueryParameter("mc", "your-merchant-code")
                        .appendQueryParameter("tr", "your-transaction-ref-id")
                        .appendQueryParameter("tn", "your-transaction-note")
                        .appendQueryParameter("am", "your-order-amount")
                        .appendQueryParameter("cu", "INR")
                        .appendQueryParameter("url", "your-transaction-url")
                        .build();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        intent.setPackage(GOOGLE_PAY_PACKAGE_NAME);
        startActivityForResult(intent, GOOGLE_PAY_REQUEST_CODE);



    }
}
