package com.example.consultation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 1001;
    ListView listView;
    ArrayAdapter<String> conAdapter;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.main_listView);
        textView = (TextView) findViewById(R.id.main_textView);
        String[] conArray = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10"
        };

        List<String> conList = new ArrayList<String>(Arrays.asList(conArray));
        conAdapter = new ArrayAdapter<String>(
                this,
                R.layout.activity_main,
                R.id.main_textView,
                conList
        );
        listView.setAdapter(conAdapter);
        listView.setOnItemClickListener(itemClickListener);
    }
    private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String selectedCon = (String)parent.getAdapter().getItem(position);
            Intent intent = new Intent(getBaseContext(),Info.class);
            intent.putExtra("conName", selectedCon);
            intent.putExtra("conInfo", position);
            startActivity(intent);
        }
    };
}

