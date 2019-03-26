package com.example.win7x64.fragment_activity;

import java.io.Serializable;

public class Sinhvien implements Serializable {
    private String masv;
    private String tensv;
    private String diachi;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Sinhvien(String masv, String tensv, String diachi) {
        this.masv = masv;
        this.tensv = tensv;
        this.diachi = diachi;
    }
}
