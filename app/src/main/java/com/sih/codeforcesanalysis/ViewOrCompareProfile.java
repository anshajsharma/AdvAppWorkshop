package com.sih.codeforcesanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sih.codeforcesanalysis.Classes.User;
import com.squareup.picasso.Picasso;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ViewOrCompareProfile extends AppCompatActivity {

    LinearLayout user1,user2,user3;
    private static final String TAG = "ViewOrCompareProfile";
    private List<User> userList = new ArrayList<>();
    private ImageView  user1_propic,user2_propic;
    private TextView user1_name,user1_handle,user1_email,
            user1_country,user1_city,user1_Organisation,
            user1_contribution,user1_rank,user1_rating,user1_maxRating,
            user1_maxRank,user1_lastOnline,user1_registeredOn,user1_friendCount;
    private  TextView user2_name,user2_handle,user2_email,user2_country,user2_city,user2_Organisation,user2_contribution,user2_rating,user2_rank,user2_lastOnline
            ,user2_maxRating,user2_maxRank,user2_registeredOn,user2_friendCount;
    private TextView user3_name,user3_handle,user3_email,
            user3_country,user3_city,user3_Organisation,
            user3_contribution,user3_rank,user3_rating,user3_maxRating,
            user3_maxRank,user3_lastOnline,user3_registeredOn,user3_friendCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_user);
        // To retrieve object in second Activity
        Intent intent = getIntent();
        userList = new ArrayList<>();
//        Log.i(TAG, "onCreate124: " + userList.size());
        Bundle args = intent.getBundleExtra("BUNDLE");
         userList = (List<User>) args.getSerializable("ARRAYLIST");
//        Log.i(TAG, "onCreate125: " + userList.size());


        user2_propic = findViewById(R.id.user2_propic);


        user2_handle = findViewById(R.id.user2_handle);
        user2_name = findViewById(R.id.user2_name);
        user2_email = findViewById(R.id.user2_email);
        user2_country = findViewById(R.id.user2_country);
        user2_city = findViewById(R.id.user2_city);
        user2_Organisation = findViewById(R.id.user2_Organisation);

        user2_contribution = findViewById(R.id.user2_contribution);
        user2_rank = findViewById(R.id.user2_rank);
        user2_rating = findViewById(R.id.user2_rating);
        user2_maxRating = findViewById(R.id.user2_maxRating);
        user2_maxRank = findViewById(R.id.user2_maxRank);

        user2_lastOnline = findViewById(R.id.user2_lastOnline);
        user2_registeredOn = findViewById(R.id.user2_registeredOn);
        user2_friendCount = findViewById(R.id.user2_friendCount);

        User firstUser,secondUser;
        firstUser = userList.get(0);


        // User1 workings
        user1_propic = findViewById(R.id.user1_propic);
        user1 = findViewById(R.id.user1);
        user2 = findViewById(R.id.user2);

        user3 = findViewById(R.id.user3);

        user1_handle = findViewById(R.id.user1_handle);
        user1_name = findViewById(R.id.user1_name);
        user1_email = findViewById(R.id.user1_email);
        user1_country = findViewById(R.id.user1_country);
        user1_city = findViewById(R.id.user1_city);
        user1_Organisation = findViewById(R.id.user1_Organisation);

        user1_contribution = findViewById(R.id.user1_contribution);
        user1_rank = findViewById(R.id.user1_rank);
        user1_rating = findViewById(R.id.user1_rating);
        user1_maxRating = findViewById(R.id.user1_maxRating);
        user1_maxRank = findViewById(R.id.user1_maxRank);

        user1_lastOnline = findViewById(R.id.user1_lastOnline);
        user1_registeredOn = findViewById(R.id.user1_registeredOn);
        user1_friendCount = findViewById(R.id.user1_friendCount);

        Picasso.with(ViewOrCompareProfile.this)
                .load(firstUser.getAvatar())
                .placeholder(R.drawable.codeforces)
                .into(user1_propic);

        user1_handle.setText(firstUser.getHandle());
        user1_name.setText(firstUser.getFirstName() + " " + firstUser.getLastName());
        user1_email.setText(firstUser.getEmail());
        user1_country.setText(firstUser.getCountry());
        user1_city.setText(firstUser.getCity());
        user1_Organisation.setText(firstUser.getOrganization());

        user1_contribution.setText(firstUser.getContribution());
        user1_rank.setText(firstUser.getRank());
        user1_rating.setText(String.valueOf(firstUser.getRating()));
        user1_maxRating.setText(String.valueOf(firstUser.getMaxRating()));
        user1_maxRank.setText(String.valueOf(firstUser.getMaxRank()));

        user1_lastOnline.setText(getDateAndTime(firstUser.getLastOnlineTimeSeconds()));
        user1_registeredOn.setText(getDateAndTime(firstUser.getRegistrationTimeSeconds()));
        user1_friendCount.setText(String.valueOf(firstUser.getFriendOfCount()));
        user2.setVisibility(View.GONE);
        user3.setVisibility(View.GONE);

        if(userList.size()>1)
        {
            user2.setVisibility(View.VISIBLE);

            secondUser = userList.get(1);
            Picasso.with(ViewOrCompareProfile.this)
                    .load(secondUser.getTitlePhoto())
                    .placeholder(R.drawable.codeforces)
                    .into(user2_propic);

            user2_handle.setText(secondUser.getHandle());
            user2_name.setText(secondUser.getFirstName() + " " + secondUser.getLastName());
            user2_email.setText(secondUser.getEmail());
            user2_country.setText(secondUser.getCountry());
            user2_city.setText(secondUser.getCity());
            user2_Organisation.setText(secondUser.getOrganization());

            user2_contribution.setText(secondUser.getContribution());
            user2_rank.setText(secondUser.getRank());
            user2_rating.setText(String.valueOf(secondUser.getRating()));
            user2_maxRating.setText(String.valueOf(secondUser.getMaxRating()));
            user2_maxRank.setText(String.valueOf(secondUser.getMaxRank()));

            user2_lastOnline.setText(getDateAndTime(secondUser.getLastOnlineTimeSeconds()));
            user2_registeredOn.setText(getDateAndTime(secondUser.getRegistrationTimeSeconds()));
            user2_friendCount.setText(String.valueOf(secondUser.getFriendOfCount()));

        }

        if(userList.size()>2)
        {
            ImageView user3_propic;

            // user3 workings
            user3_propic = findViewById(R.id.user3_propic);

            User thirdUser = userList.get(2);

            user3.setVisibility(View.VISIBLE);

            user3_handle = findViewById(R.id.user3_handle);
            user3_name = findViewById(R.id.user3_name);
            user3_email = findViewById(R.id.user3_email);
            user3_country = findViewById(R.id.user3_country);
            user3_city = findViewById(R.id.user3_city);
            user3_Organisation = findViewById(R.id.user3_Organisation);

            user3_contribution = findViewById(R.id.user3_contribution);
            user3_rank = findViewById(R.id.user3_rank);
            user3_rating = findViewById(R.id.user3_rating);
            user3_maxRating = findViewById(R.id.user3_maxRating);
            user3_maxRank = findViewById(R.id.user3_maxRank);

            user3_lastOnline = findViewById(R.id.user3_lastOnline);
            user3_registeredOn = findViewById(R.id.user3_registeredOn);
            user3_friendCount = findViewById(R.id.user3_friendCount);

            Picasso.with(ViewOrCompareProfile .this)
                    .load(thirdUser.getAvatar())
                    .placeholder(R.drawable.codeforces)
                    .into(user3_propic);

            user3_handle.setText(thirdUser.getHandle());
            user3_name.setText(thirdUser.getFirstName() + " " + thirdUser.getLastName());
            user3_email.setText(thirdUser.getEmail());
            user3_country.setText(thirdUser.getCountry());
            user3_city.setText(thirdUser.getCity());
            user3_Organisation.setText(thirdUser.getOrganization());

            user3_contribution.setText(thirdUser.getContribution());
            user3_rank.setText(thirdUser.getRank());
            user3_rating.setText(String.valueOf(thirdUser.getRating()));
            user3_maxRating.setText(String.valueOf(thirdUser.getMaxRating()));
            user3_maxRank.setText(String.valueOf(thirdUser.getMaxRank()));

            user3_lastOnline.setText(getDateAndTime(thirdUser.getLastOnlineTimeSeconds()));
            user3_registeredOn.setText(getDateAndTime(thirdUser.getRegistrationTimeSeconds()));
            user3_friendCount.setText(String.valueOf(thirdUser.getFriendOfCount()));

//            Log.i(TAG, "onCreate: " + System.currentTimeMillis() + " " + firstUser.getRegistrationTimeSeconds() + " "  );

        }




    }
    public String getDateAndTime(int time)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm aa",Locale.getDefault());
        Timestamp timestamp = new Timestamp(time);
//        Date date = new Date(timestamp.getTime());
        long ttime = (long)time*1000;
//        Log.i(TAG, "getDateAndTime12: " + System.currentTimeMillis() +" " + ttime);
        return sdf.format(new Timestamp(ttime));
    }
}
