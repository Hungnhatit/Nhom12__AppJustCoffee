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

public class ArrayAdapter2 extends ArrayAdapter<cf2> {          //1 Adapter co 3 thong so : ten activity, layout, bangdulieu
    Activity context;
    int idLayout;
    ArrayList<cf2> myList;

    //Tao Contructor để MAinActivity gọi đến và truyền các tham số vào
    public ArrayAdapter2( Activity context, int idLayout, ArrayList<cf2> myList) {
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
        cf2 mycoffee = myList.get(position);  //position : biến index của bảng dữ liệu, thay đổi từ 0 đến cuối của bảng

        // Khai báo, tham chiếu id và hiển thị ảnh lên ImageView
        ImageView img_coffee = convertView.findViewById(R.id.img_cf2);
        img_coffee.setImageResource(mycoffee.getImage2());

        //Khai báo. tham chiếu id và hiển thị tên coffe lên textview
        TextView txttencaphe2 = convertView.findViewById(R.id.tvtencf2);
        TextView txtsize2 = convertView.findViewById(R.id.tvsize2);
        TextView txtgia2 = convertView.findViewById(R.id.tvgia2);
        TextView txtthanhtoan2 = convertView.findViewById(R.id.tvthanhtoan2);


        txttencaphe2.setText(mycoffee.getTencaphe2());

        txtsize2.setText(mycoffee.getSize2());

        txtgia2.setText(mycoffee.getGia2());

        txtthanhtoan2.setText(mycoffee.getThanhtoan());


        return  convertView;


    }
}
