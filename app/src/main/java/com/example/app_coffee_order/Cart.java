package com.example.app_coffee_order;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    ImageButton btnimgprofile;
    static CheckBox cbxtotal;
    ListView lvgiohang;
    static TextView txttongtien;
    static ImageButton imgthungrac;
    static cartadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_main);

        btnimgprofile=(ImageButton) findViewById(R.id.person);
        txttongtien= (TextView) findViewById(R.id.txtmoneyken);
        imgthungrac=(ImageButton) findViewById(R.id.binken);
        cbxtotal=(CheckBox) findViewById(R.id.cbxall);
        btnimgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cart.this, Profile.class);
                startActivity(intent);
            }
        });
        cbxtotal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                boolean anyItemUnchecked = true;
                for (boolean itemChecked : adapter.checkedItems) {
                    if (!itemChecked) {
                        anyItemUnchecked = false;
                        break;
                    }
                }
                if(anyItemUnchecked){
                    if(cbxtotal.isChecked()==false)
                        for (int i = 0; i< Profile.mangsp.size(); i++){
                            adapter.checkedItems.set(i,false);
                        }
                }else if(cbxtotal.isChecked()==true){
                    for (int i = 0; i< Profile.mangsp.size(); i++){
                        adapter.checkedItems.set(i,true);
                    }
                }
                adapter.notifyDataSetChanged();
                EvenUtil();
            }
        });

        Anhxa();
        EvenUtil();
        CactchOnIteamListview();
    }

    private void Anhxa() {
        lvgiohang = (ListView) findViewById(R.id.listviewitem);
        Profile.mangsp=new ArrayList<>();

        Profile.mangsp.add(new item("Caffee muoi",20,R.drawable.anh2,1));
        Profile.mangsp.add(new item("Caffee sua",30,R.drawable.anh3,1));
        Profile.mangsp.add(new item("Caffee dac biet",24,R.drawable.anh4,1));
        Profile.mangsp.add(new item("Caffee muoi",20,R.drawable.anh2,1));
        Profile.mangsp.add(new item("Caffee sua dat",30,R.drawable.anh3,1));
        Profile.mangsp.add(new item("Caffee dac",24,R.drawable.anh4,1));
        Profile.mangsp.add(new item("Caffee phim",20,R.drawable.anh2,1));
        Profile.mangsp.add(new item("Caffee vip",30,R.drawable.anh3,1));
        Profile.mangsp.add(new item("Caffee dang",24,R.drawable.anh4,1));

        adapter = new cartadapter(Cart.this, Profile.mangsp);
        lvgiohang.setAdapter(adapter);
    }

    public static void EvenUtil() {
        int tongtien=0;
        //MainActivity.mangsp.check
        for (int i = 0; i< Profile.mangsp.size(); i++){
            if(adapter.checkedItems.get(i)){
                tongtien+= Profile.mangsp.get(i).getGiasp();
            }
        }
        txttongtien.setText(tongtien+"");
    }

    private void CactchOnIteamListview() {
        imgthungrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> itemsToDelete = new ArrayList<>();
                ArrayList<Boolean> tempCheckedItems = new ArrayList<>(adapter.checkedItems);

                for (int j = Profile.mangsp.size() - 1; j >= 0; j--) {
                    if (adapter.checkedItems.get(j)) {
                        itemsToDelete.add(j);
                    }
                }

                if (!itemsToDelete.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Cart.this);
                    builder.setTitle("Xác nhận xóa sản phẩm");
                    builder.setMessage("Bạn có chắc muốn xóa các sản phẩm đã chọn?");
                    builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            for (int position : itemsToDelete) {
                                Profile.mangsp.remove(position);
                                tempCheckedItems.remove(position);
                                adapter.checkedItems = new ArrayList<>(tempCheckedItems);
                            }
                            adapter.notifyDataSetChanged();
                            EvenUtil();
                        }
                    });

                    builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            adapter.notifyDataSetChanged();
                            EvenUtil();
                        }
                    });

                    builder.show();
                }
            }
        });
    }


}