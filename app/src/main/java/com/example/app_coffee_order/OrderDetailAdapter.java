package com.example.app_coffee_order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderDetailAdapter extends RecyclerView.Adapter<OrderDetailAdapter.ViewHolder> {
    private Context context;
    private List<OrderItem> orderItems;

    public OrderDetailAdapter(Context context, List<OrderItem> orderItems) {
        this.context = context;
        this.orderItems = orderItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_order, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        OrderItem orderItem = orderItems.get(position);

        holder.productImage.setImageResource(orderItem.getImageResource());
        holder.productName.setText(orderItem.getProductName());
        holder.productPrice.setText(orderItem.getProductPrice());
        holder.productQuantity.setText("X" + orderItem.getProductQuantity());
        holder.productTotal.setText(orderItem.getProductTotal());
        holder.productDiscount.setText(orderItem.getProductDiscount());
        holder.productPromotion.setText(orderItem.getProductPromotion());
        holder.deliveryAddress.setText(orderItem.getDeliveryAddress());
        holder.deliveryPerson.setText(orderItem.getDeliveryPerson());
        holder.deliveryPhoneNumber.setText(orderItem.getDeliveryPhoneNumber());
        holder.deliveryCompany.setText(orderItem.getDeliveryCompany());
        holder.orderCode.setText(orderItem.getOrderCode());
        holder.orderStatus.setText(orderItem.getOrderStatus());
    }

    @Override
    public int getItemCount() {
        return orderItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName;
        TextView productPrice;
        TextView productQuantity;
        TextView productTotal;
        TextView productDiscount;
        TextView productPromotion;
        TextView deliveryAddress;
        TextView deliveryPerson;
        TextView deliveryPhoneNumber;
        TextView deliveryCompany;
        TextView orderCode;
        TextView orderStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
            productPrice = itemView.findViewById(R.id.productPrice);
            productQuantity = itemView.findViewById(R.id.productQuantity);
            productTotal = itemView.findViewById(R.id.productTotal);
            productDiscount = itemView.findViewById(R.id.productDiscount);
            productPromotion = itemView.findViewById(R.id.productPromotion);
            deliveryAddress = itemView.findViewById(R.id.deliveryAddress);
            deliveryPerson = itemView.findViewById(R.id.deliveryPerson);
            deliveryPhoneNumber = itemView.findViewById(R.id.deliveryPhoneNumber);
            deliveryCompany = itemView.findViewById(R.id.deliveryCompany);
            orderCode = itemView.findViewById(R.id.orderCode);
            orderStatus = itemView.findViewById(R.id.orderStatus);
        }
    }
}
