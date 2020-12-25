package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView sname = findViewById(R.id.sname);
        TextView snumber = findViewById(R.id.snumber);
        TextView semail = findViewById(R.id.semail);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bund = getIntent().getExtras();

        sname.setText( bund.getString("user"));
        snumber.setText( bund.getString("phon"));
        semail.setText( bund.getString("eml"));

        //the function that i should click her to send me to the phone
        snumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callint = new Intent(Intent.ACTION_DIAL);
                callint.setData(Uri.parse("tel:"+bund.getString("phon")));


            }
        });



    }
}