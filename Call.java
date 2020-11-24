package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class callActivity extends AppCompatActivity {
    Button b;Button b2;Button b3;EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        e=findViewById(R.id.editTextPhone);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XaaZjDFEtKw"));
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=e.getText().toString();

                Intent i2=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:"+a));
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-0000-0000"));
                startActivity(i3);

            }
        });



    }
}
