package com.example.app_coffee_order;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_detail);

        // Lấy thông tin đơn hàng và danh sách sản phẩm từ intent hoặc từ nguồn dữ liệu.
        // Lấy danh sách sản phẩm đồ từ nguồn dữ liệu hoặc intent.
        List<OrderItem> orderItems = new ArrayList<>();

        // Khai báo giá trị productOriginalPrice và productDiscountPrice
        double productOriginalPrice = 10.00;
        double productDiscountPrice = 2.00;

        // Thêm các sản phẩm vào danh sách
        orderItems.add(new OrderItem(
                R.drawable.product_image1,
                "Kopi Kudda",
                "$10.00",
                2,
                "$20.00",
                "$2.00",
                "$0.00",
                "123 Main Street",
                "Nguyễn Văn A",
                "0987654321",
                "Giao Hàng Express",
                "ORD123456",
                "Đã giao hàng",
                calculateTotalPayment(productOriginalPrice, productDiscountPrice)
        ));


        // Khởi tạo RecyclerView và thiết lập Adapter.
        RecyclerView orderRecyclerView = findViewById(R.id.orderRecyclerView);
        OrderDetailAdapter adapter = new OrderDetailAdapter(this, orderItems);
        orderRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        orderRecyclerView.setAdapter(adapter);
    }

    // Hàm tính tổng thanh toán
    private double calculateTotalPayment(double originalPrice, double discountPrice) {
        return originalPrice - discountPrice;
    }
}
