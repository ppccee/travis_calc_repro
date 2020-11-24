package com.example.consultation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;

public class Info extends Activity{
    TextView info_conName, info_conInfo;
    Button returnBtn;
    Toast toast;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        info_conName = (TextView) findViewById(R.id.info_conName);
        info_conInfo = (TextView) findViewById(R.id.info_conInfo);
        returnBtn = (Button) findViewById(R.id.info_returnBtn);
        Intent intent = getIntent();
        String conName = intent.getStringExtra("conName");
        int conInfo = intent.getExtras().getInt("conInfo");
        switch (conInfo) {
            case 0:
                info_conName.setText("선택하신 게임다.");
                info_conInfo.setText("발매일 : 2004년 11월 23일" );
                break;
            case 1:
                info_conName.setText("선택하신 게임니다.");
                info_conInfo.setText("발매일 : 2013년 9월 17일" );
                 break;
            case 2:
                info_conName.setText("선택하신 게임다.");
                info_conInfo.setText("발매일 : 2014년 1월 24일" );
                  break;
            case 3:
                info_conName.setText("선택하신 게임다.");
                info_conInfo.setText("발매일 : 2010년 7월 27일" );
                break;
            case 4:
                info_conName.setText("선택하신 게임니다.");
                info_conInfo.setText("발매일 : 2009년 10월 27일" );
                break;
            case 5:
                info_conName.setText("선택하신 게다.");
                info_conInfo.setText("발매일 : 2015년 9월 17일" );
                break;
            case 6:
                info_conName.setText("선택하신 니다.");
                info_conInfo.setText("발매일 : 2012년 5월 15일" );
                break;
            case 7:
                info_conName.setText("선택하신 게니다.");
                info_conInfo.setText("발매일 : 2015년 12월 17일" );
                break;
            case 8:
                info_conName.setText("선택하신 게니다.");
                info_conInfo.setText("발매일 : 2003년 11월 8일" );
                break;
            case 9:
                info_conName.setText("선택하신 게니다.");
                info_conInfo.setText("발매일 : 2014년 7월 29일" );
                break;
        }

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}


