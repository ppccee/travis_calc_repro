package com.example.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CentersList extends Activity implements View.OnClickListener {

    private ArrayList<CentersItem> data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* xml과 연결 */
        setContentView(R.layout.centers_list);

        ListView listView = (ListView) findViewById(R.id.centers_listview);

        /* 서버와 연동했닫면 값을 받아서 띄울 수 있지만,
         * 연동이 되어있지 않으므로
         * 하드코딩으로 값을 집어넣는다.
         * CentersItem에 정의 한 구조대로 값을 넣을 수 있다.
         */
        data = new ArrayList<>();
        // 아이템
        CentersItem centers1 = new CentersItem(R.drawable.map, "1 상담실", "055-0000-0000");
        CentersItem centers2 = new CentersItem(R.drawable.map2, "2 상담실", "055-0000-0001");
        CentersItem centers3 = new CentersItem(R.drawable.map2, "3 상담실", "055-0000-0002");
        CentersItem centers4 = new CentersItem(R.drawable.map2, "4 상담실", "055-0000-0003");
        CentersItem centers5 = new CentersItem(R.drawable.map2, "5 상담실", "055-0000-0004");
        CentersItem centers6 = new CentersItem(R.drawable.map2, "6 상담실", "055-0000-0005");
        CentersItem centers7 = new CentersItem(R.drawable.map2, "7 상담실", "055-0000-0006");
        CentersItem centers8 = new CentersItem(R.drawable.map2, "8 상담실", "055-0000-0007");
        CentersItem centers9 = new CentersItem(R.drawable.map2, "9 상담실", "055-0000-0008");
        CentersItem centers10 = new CentersItem(R.drawable.map2, "10 상담실", "055-0000-0009");
        CentersItem centers11 = new CentersItem(R.drawable.map2, "11 상담실", "055-0000-0010");

        //리스트에 추가
        data.add(centers1);
        data.add(centers2);
        data.add(centers3);
        data.add(centers4);
        data.add(centers5);
        data.add(centers6);
        data.add(centers7);
        data.add(centers8);
        data.add(centers9);
        data.add(centers10);
        data.add(centers11);


        /* 리스트 속의 아이템 연결 */
        CentersAdapter adapter = new CentersAdapter(this, R.layout.centers_item, data);
        listView.setAdapter(adapter);

        /* 아이템 클릭시 작동 */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), CentersClicked.class);
                /* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 */
                intent.putExtra("map", Integer.toString(data.get(position).getMap()));
                intent.putExtra("info", data.get(position).getInfo());
                intent.putExtra("phone", data.get(position).getPhone());
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
    }

}


