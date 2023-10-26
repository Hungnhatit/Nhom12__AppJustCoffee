package com.example.app_coffee_order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button back,list_bar,change_address,plus,minus,size_l,size_m,size_s,buy,home,love,cart,user,save;
    TextView address_detail,name_product,number_buy,price,ship,total_cost;
    ImageView image_product;
    EditText address;
    Boolean size_s_click,size_m_click,size_l_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //edittext
        address = findViewById(R.id.edtaddress);
        //get button
        back = findViewById(R.id.btnback);
        list_bar = findViewById(R.id.btnlistbar);
        change_address = findViewById(R.id.btnchangeaddress);
        plus = findViewById(R.id.btnplus);
        minus = findViewById(R.id.btnminus);
        size_l= findViewById(R.id.btnsizel);
        size_m = findViewById(R.id.btnsizem);
        size_s = findViewById(R.id.btnsizes);
        buy = findViewById(R.id.btnbuy);
        home = findViewById(R.id.btnhome);
        cart = findViewById(R.id.btncart);
        love = findViewById(R.id.btnlove);
        user = findViewById(R.id.btnuser);
        save = findViewById(R.id.btnsave);
        //text view
        address_detail = findViewById(R.id.txtaddress_detail);
        name_product = findViewById(R.id.txtnameproduct);
        number_buy = findViewById(R.id.txtnumberbuy);
        price = findViewById(R.id.txtprice);
        ship = findViewById(R.id.txtship);
        total_cost = findViewById(R.id.txttotalcost);
        //image
        image_product = findViewById(R.id.imgproduct);
        //intent buy
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                count = Integer.parseInt(number_buy.getText().toString());
                count =  count + 1;
                number_buy.setText(count+"");
                double gia=0,phiship=0;
                phiship= Double.parseDouble(ship.getText().toString());
                //gia = count*Double.parseDouble(price.getText().toString());
                gia = count*4.53;
                price.setText(gia+"");
                double total = gia +phiship;
                total_cost.setText(total+"");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                count = Integer.parseInt(number_buy.getText().toString());
                if(count == 1)
                {
                    count=1;
                    number_buy.setText(count+"");
                    double gia=0,phiship=0;
                    phiship= Double.parseDouble(ship.getText().toString());
                    //gia = count*Double.parseDouble(price.getText().toString());
                    gia = count*4.53;
                    price.setText(gia+"");
                    double total = gia +phiship;
                    total_cost.setText(total+"");
                }
                else{
                    count =count-1;
                    number_buy.setText(count+"");
                    double gia=0,phiship=0;
                    phiship= Double.parseDouble(ship.getText().toString());
                    //gia = count*Double.parseDouble(price.getText().toString());
                    gia = count*4.53;
                    price.setText(gia+"");
                    double total = gia +phiship;
                    total_cost.setText(total+"");
                }
            }
        });
        //css size click
        size_s_click=false;
        size_l_click= false;
        size_m_click=false;
        size_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!size_s_click) {
                    // Button chưa được click
                    size_s_click=true;
                    size_s.setBackgroundColor(getResources().getColor(R.color.colorsize));
                    size_l.setBackgroundColor(getResources().getColor(R.color.returncolor));
                    size_m.setBackgroundColor(getResources().getColor(R.color.returncolor));

                } else {
                    size_s.setBackgroundColor(getResources().getColor(R.color.returncolor));
                    size_s_click=false;
                }
            }
        });
        size_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!size_m_click) {
                    // Button chưa được click
                    size_m_click=true;
                    size_m.setBackgroundColor(getResources().getColor(R.color.colorsize));
                    size_s.setBackgroundColor(getResources().getColor(R.color.returncolor));
                    size_l.setBackgroundColor(getResources().getColor(R.color.returncolor));

                } else {
                    size_m.setBackgroundColor(getResources().getColor(R.color.returncolor));
                    size_m_click=false;
                }
            }
        });
        size_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!size_l_click) {
                    // Button chưa được click
                    size_l_click=true;
                    size_l.setBackgroundColor(getResources().getColor(R.color.colorsize));
                    size_s.setBackgroundColor(getResources().getColor(R.color.returncolor));
                    size_m.setBackgroundColor(getResources().getColor(R.color.returncolor));
                } else {
                    size_l.setBackgroundColor(getResources().getColor(R.color.returncolor));
                    size_l_click=false;
                }
            }
        });
        change_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (address_detail.getVisibility() == View.VISIBLE) {
                    //ẩn textview
                    address_detail.setVisibility(View.GONE);
                    //hiện edittext đê sửa
                    address.setVisibility(View.VISIBLE);
                    address.setText(address_detail.getText().toString());
                    //hiển thị button save
                    save.setVisibility(View.VISIBLE);
                }
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (address.getVisibility() == View.VISIBLE) {
                    //ẩn edittext
                    address.setVisibility(View.GONE);
                    //hiện textview
                    address_detail.setText(address.getText().toString());
                    address_detail.setVisibility(View.VISIBLE);
                    //ẩn  button save
                    save.setVisibility(View.GONE);
                }
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gohomehuy = new Intent(MainActivity.this,home.class);
                startActivity(gohomehuy);
            }
        });

    }


}