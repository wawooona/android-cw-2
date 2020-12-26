package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     final  EditText phn = findViewById(R.id.Phone);
     final   EditText username = findViewById(R.id.Username);
     final   EditText password = findViewById(R.id.Password);
     final   EditText emailAddress = findViewById(R.id.EmailAddress);
           Button enter = findViewById(R.id.button);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"hello i'm working", Toast.LENGTH_LONG).show();
                Intent go = new Intent(MainActivity.this , SecondActivity.class );


               go.putExtra("user", username.getText().toString());
               go.putExtra("phon", phn.getText().toString());
               go.putExtra("eml", emailAddress.getText().toString());

                startActivity(go);
            }
        });


//        enter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//         //Toast.makeText(context, text, duration).show();
//                Toast.makeText(MainActivity.this,"hello i'm working", Toast.LENGTH_LONG).show();
//               Intent go = new Intent(MainActivity.this , SecondActivity.class );
//               go.putExtra("user", String.valueOf(username));
//               go.putExtra("phon", String.valueOf(phn));
//               go.putExtra("eml", String.valueOf(emailAddress));
//
//               startActivity(go);
//            }
//        });




    }
}