package com.example.appsinhvien;

public class Sinhvien {
    private int maso;
    private String ten;
    private String diachi;

    public Sinhvien() {
        this.maso = 0;
        this.ten = null;
        this.diachi = null;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Sinhvien(int maso, String ten, String diachi) {
        this.maso = maso;
        this.ten = ten;
        this.diachi = diachi;
    }
}
