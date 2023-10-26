package com.example.app_coffee_order;

public class cf2 {
    private  int image2;
    private String tencaphe2, size2, gia2, thanhtoan;

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image) {
        this.image2 = image2;
    }

    public String getTencaphe2() {
        return tencaphe2;
    }

    public void setTencaphe2(String tencaphe2) {
        this.tencaphe2 = tencaphe2;
    }

    public String getSize2() {
        return size2;
    }

    public void setSize2(String size2) {
        this.size2 = size2;
    }

    public String getGia2() {
        return gia2;
    }

    public void setGia2(String gia2) {
        this.gia2 = gia2;
    }

    public String getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(String thanhtoan) {
        this.thanhtoan = thanhtoan;
    }


    // Tao Constructor : truyen thong so

    public cf2(int image2, String tencaphe2, String size2, String gia2, String thanhtoan) {
        this.image2 = image2;
        this.tencaphe2 = tencaphe2;
        this.size2 = size2;
        this.gia2 = gia2;
        this.thanhtoan = thanhtoan;

    }
}
