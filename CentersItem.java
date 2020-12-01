package com.example.myapplication2;

public class CentersItem {
    private int map; // 프로필사진
    private String info; // 상담 센터 정보
    private String phone; // 연락처


    public int getMap() {
        return map;
    }

    public String getInfo() {
        return info;
    }

    public String getPhone() {
        return phone;
    }


    public CentersItem(int map, String info, String phone) {
        this.map = map;
        this.info = info;
        this.phone = phone;

    }
}

