package com.example.tranconghieu_lttd_grabsuaxe;



public class Quan   {
    private String Ten,MoTa;
    private int Hinh;

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public Quan(int hinh, String ten, String moTa) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
    }

}

