package com.sih.codeforcesanalysis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sih.codeforcesanalysis.Classes.User;
import com.sih.codeforcesanalysis.Classes.getUserHelperClass;
import com.sih.codeforcesanalysis.Retrofit.GetDatas;
import com.sih.codeforcesanalysis.Retrofit.RetrofitClientInstance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView recyclerView;
    ProgressDialog progressDoalog;
    EditText UserHandle;
    Button show;
    TextView userDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserHandle = findViewById(R.id.userHandle);
        show = findViewById(R.id.show);




        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDoalog = new ProgressDialog(MainActivity.this);
                progressDoalog.setMessage("Loading....");
                progressDoalog.setCanceledOnTouchOutside(false);
                progressDoalog.show();

//                Toast.makeText(MainActivity.this, userHandle.getText().toString(), Toast.LENGTH_SHORT).show();
//
//                Log.i(TAG, "onClick: " + userHandle.getText().toString());
                String userHandle = UserHandle.getText().toString();


                /*Create handle for the RetrofitInstance interface*/
                GetDatas service = RetrofitClientInstance.getRetrofitInstance().create(GetDatas.class);
                Call<getUserHelperClass> call = service.getUserHelperClass(userHandle);
                call.enqueue(new Callback<getUserHelperClass>() {
                    @Override
                    public void onResponse(Call<getUserHelperClass> call, Response<getUserHelperClass> response) {
                        progressDoalog.dismiss();
                        if(response.isSuccessful())
                        {
                            generateDataList(response.body());
                        }else{
                            Toast.makeText(MainActivity.this, "No Matches Found", Toast.LENGTH_SHORT).show();
                        }

//                        Log.i(TAG, "onResponse12: " + response.raw() + response.isSuccessful() );
                    }

                    @Override
                    public void onFailure(Call<getUserHelperClass> call, Throwable t) {
                        progressDoalog.dismiss();
                        Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });







    }
    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(getUserHelperClass currgetUserHelperClass) {
        List<User> userList = currgetUserHelperClass.getResult();

   //     Toast.makeText(this, currgetUserHelperClass.getStatus(), Toast.LENGTH_SHORT).show();
        if(currgetUserHelperClass.getStatus().equals("OK"))
        {
            if(userList.size()>0){
                //Intent intent = new Intent(MainActivity.this, ViewOrCompareProfile.class);
                //intent.putExtra("sampleObject",new User());
//                Log.i(TAG, "onCreate123: " + userList.size());
             Intent intent = new Intent(MainActivity.this, ViewOrCompareProfile.class);
                Bundle args = new Bundle();
                args.putSerializable("ARRAYLIST",(Serializable)userList);
                intent.putExtra("BUNDLE",args);
                startActivity(intent);




            }
        }



    }

}
