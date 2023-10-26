package com.example.app_coffee_order;

public class cf1 {
    private  int image1;
    private String tencaphe1, size1, gia1, mr, add;

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image) {
        this.image1 = image1;
    }

    public String getTencaphe1() {
        return tencaphe1;
    }

    public void setTencaphe1(String tencaphe1) {
        this.tencaphe1 = tencaphe1;
    }

    public String getSize1() {
        return size1;
    }

    public void setSize1(String size1) {
        this.size1 = size1;
    }

    public String getGia1() {
        return gia1;
    }

    public void setGia1(String gia1) {
        this.gia1 = gia1;
    }

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    // Tao Constructor : truyen thong so

    public cf1(int image1, String tencaphe1, String size1, String gia1, String mr, String add) {
        this.image1 = image1;
        this.tencaphe1 = tencaphe1;
        this.size1 = size1;
        this.gia1 = gia1;
        this.mr = mr;
        this.add = add;
    }
}