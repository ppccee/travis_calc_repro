package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> list;
    private ListView listView;
    private EditText editSearch;
    private SearchAdapter adapter;
    private ArrayList<String> arraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editSearch = (EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.listView);


        list = new ArrayList<String>();

        settingList();

        arraylist = new ArrayList<String>();
        arraylist.addAll(list);

        adapter = new SearchAdapter(list, this);

        listView.setAdapter(adapter);


        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i0, int i1) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i0, int i1) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = editSearch.getText().toString();
                search(text);
            }
        });
    }

    public void search(String charText) {
        list.clear();
        if (charText.length() == 0) {
            list.addAll(arraylist);
        } else
          {
              for(int i = 0;i < arraylist.size(); i++)
            {
                if (arraylist.get(i).toLowerCase().contains(charText))
                {
                    list.add(arraylist.get(i));
                }
            }
           }
        adapter.notifyDataSetChanged();
    }

    private void settingList(){
        list.add("1 상담실");
        list.add("2 상담실");
        list.add("3 상담실");
        list.add("4 상담실");
        list.add("5 상담실");
        list.add("6 상담실");
        list.add("7 상담실");
        list.add("8 상담실");
        list.add("9 상담실");
        list.add("10 상담실");
    }
}
