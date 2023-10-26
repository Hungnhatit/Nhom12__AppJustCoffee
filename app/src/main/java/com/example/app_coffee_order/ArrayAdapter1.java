package com.example.app_coffee_order;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArrayAdapter1 extends ArrayAdapter<cf1> {          //1 Adapter co 3 thong so : ten activity, layout, bangdulieu
    Activity context;
    int idLayout;
    ArrayList<cf1> myList;

    //Tao Contructor để MAinActivity gọi đến và truyền các tham số vào
    public ArrayAdapter1( Activity context, int idLayout, ArrayList<cf1> myList) {
        super(context, idLayout, myList);
        this.context = context;
        this.idLayout = idLayout;
        this.myList = myList;
    }

    // Gọi hàm getView để tiến hành sắp xếp, hiển thị dữ liệu

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Tạo đế chứa Layout
        LayoutInflater myFlater = context.getLayoutInflater();

        // Đặt idLayout lên đế để tạo thành View
        convertView = myFlater.inflate(idLayout, null);

        // Lấy 1 phần tử trong mảng
        cf1 mycoffee = myList.get(position);  //position : biến index của bảng dữ liệu, thay đổi từ 0 đến cuối của bảng

        // Khai báo, tham chiếu id và hiển thị ảnh lên ImageView
        ImageView img_coffee = convertView.findViewById(R.id.img_cf1);
        img_coffee.setImageResource(mycoffee.getImage1());

        //Khai báo. tham chiếu id và hiển thị tên coffe lên textview
        TextView txttencaphe = convertView.findViewById(R.id.tvtencf1);
        TextView txtsize = convertView.findViewById(R.id.tvsize1);
        TextView txtgia = convertView.findViewById(R.id.tvgia1);
        TextView txtmr = convertView.findViewById(R.id.tvMr1);
        TextView txtadd = convertView.findViewById(R.id.tvAdd1);

        txttencaphe.setText(mycoffee.getTencaphe1());

        txtsize.setText(mycoffee.getSize1());

        txtgia.setText(mycoffee.getGia1());

        txtmr.setText(mycoffee.getMr());

        txtadd.setText(mycoffee.getAdd());
        return  convertView;


    }
}
