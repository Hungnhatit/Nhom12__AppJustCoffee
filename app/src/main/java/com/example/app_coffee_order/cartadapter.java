package com.example.app_coffee_order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

public class cartadapter extends BaseAdapter {

    Context context;
    ArrayList<item> itemArrayList;
    //private int layout;
    ArrayList<Boolean> checkedItems;

    public cartadapter(Context context, ArrayList<item> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;
        this.checkedItems = new ArrayList<>(Collections.nCopies(itemArrayList.size(), false));
    }

    @Override
    public int getCount() {
        return itemArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class ViewHoler{
        public TextView txttensp,txtgiasp;
        public ImageView imgsp;
        public Button btnminus,btnvalues,btnplus;
        public CheckBox cbitem;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHoler viewHoler=null;
        if(view ==null){
            viewHoler = new ViewHoler();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.dongitem,null);
            viewHoler.txttensp= view.findViewById(R.id.txtnamespken);
            viewHoler.txtgiasp=view.findViewById(R.id.txtpricespken);
            viewHoler.imgsp=view.findViewById(R.id.imgspken);
            viewHoler.btnminus=view.findViewById(R.id.btnminusken);
            viewHoler.btnplus=view.findViewById(R.id.btnplusken);
            viewHoler.btnvalues=view.findViewById(R.id.numner);
            viewHoler.cbitem=view.findViewById(R.id.CBitemken);
            view.setTag(viewHoler);
        }
        else {
            viewHoler=(ViewHoler)view.getTag();
        }

        item Item = (item) getItem(i);
        viewHoler.txttensp.setText(Item.getTensp());
        viewHoler.txtgiasp.setText(Item.getGiasp()+"");
        viewHoler.imgsp.setImageResource(Item.getHinhsp());
        viewHoler.btnvalues.setText(Item.getSoluongsp()+"");

        int sl= Integer.parseInt(viewHoler.btnvalues.getText().toString());
        if(sl<=1){
            viewHoler.btnminus.setVisibility(view.INVISIBLE);
        }else{
            viewHoler.btnminus.setVisibility(view.VISIBLE);
        }
        ViewHoler finalViewHoler = viewHoler;
        viewHoler.btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slmoinhat = Integer.parseInt(finalViewHoler.btnvalues.getText().toString())+1;
                int slht= Profile.mangsp.get(i).getSoluongsp();
                int giaht= Profile.mangsp.get(i).getGiasp();
                Profile.mangsp.get(i).setSoluongsp(slmoinhat);
                int giamoinhat=(giaht*slmoinhat)/slht;
                Profile.mangsp.get(i).setGiasp(giamoinhat);

                finalViewHoler.txtgiasp.setText(giamoinhat+"");
                Cart.EvenUtil();
                if(slmoinhat>1){
                    finalViewHoler.btnminus.setVisibility(View.VISIBLE);
                    finalViewHoler.btnvalues.setText(String.valueOf(slmoinhat));
                }
            }
        });

        ViewHoler finalViewHoler1 = viewHoler;
        viewHoler.btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slmoinhat = Integer.parseInt(finalViewHoler1.btnvalues.getText().toString())-1;
                int slht= Profile.mangsp.get(i).getSoluongsp();
                int giaht= Profile.mangsp.get(i).getGiasp();
                Profile.mangsp.get(i).setSoluongsp(slmoinhat);
                int giamoinhat=(giaht*slmoinhat)/slht;
                Profile.mangsp.get(i).setGiasp(giamoinhat);

                finalViewHoler1.txtgiasp.setText(giamoinhat+"");
                Cart.EvenUtil();
                if(slmoinhat<2){
                    finalViewHoler1.btnminus.setVisibility(View.INVISIBLE);
                    finalViewHoler1.btnvalues.setText(String.valueOf(slmoinhat));
                }else {
                    finalViewHoler1.btnminus.setVisibility(View.VISIBLE);
                    finalViewHoler1.btnvalues.setText(String.valueOf(slmoinhat));
                }
            }
        });

        viewHoler.cbitem.setOnCheckedChangeListener(null); // Remove previous listener to avoid callback while setting the checkbox state
        viewHoler.cbitem.setChecked(checkedItems.get(i));



        viewHoler.cbitem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                checkedItems.set(i,b);
                boolean anyItemUnchecked = false;
                for (boolean itemChecked : checkedItems) {
                    if (!itemChecked) {
                        anyItemUnchecked = true;
                        break;
                    }
                }

                // Cập nhật trạng thái của checkbox "total" dựa trên giá trị của allItemsChecked
                Cart.cbxtotal.setChecked(!anyItemUnchecked);
                Cart.EvenUtil();
            }
        });
        return view;
    }
}
