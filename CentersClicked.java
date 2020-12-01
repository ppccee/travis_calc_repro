package com.example.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CentersClicked extends Activity {

    private int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* xml과 연결 */
        setContentView(R.layout.item_clicked);

        Intent intent = getIntent();

        ImageView map = (ImageView) findViewById(R.id.img_prof);
        TextView info=(TextView) findViewById(R.id.tv_info);
        TextView phone=(TextView) findViewById(R.id.tv_pn);

        img=Integer.parseInt(intent.getStringExtra("map"));
        map.setImageResource(img);
        info.setText(intent.getStringExtra("info"));
        phone.setText(intent.getStringExtra("phone"));
    }
}



