package com.example.app_coffee_order;

public class OrderItem {
    private int imageResource; // Tài nguyên hình ảnh sản phẩm
    private String productName; // Tên sản phẩm
    private String productPrice; // Giá sản phẩm
    private int productQuantity; // Số lượng sản phẩm
    private String productTotal; // Tổng tiền
    private String productDiscount; // Khuyến mãi
    private String productPromotion; // Chiết khấu
    private String deliveryAddress; // Địa chỉ giao hàng
    private String deliveryPerson; // Tên người giao hàng
    private String deliveryPhoneNumber; // Số điện thoại người giao hàng
    private String deliveryCompany; // Đơn vị giao hàng
    private String orderCode; // Mã đơn hàng
    private String orderStatus; // Tình trạng đơn hàng
    private double productOriginalPrice; // Giá ban đầu
    private double productDiscountPrice;// Giảm giá (khuyến mãi)
    private double totalPayment;
        public OrderItem(int imageResource, String productName, String productPrice, int productQuantity, String productTotal, String productDiscount, String productPromotion,
                         String deliveryAddress, String deliveryPerson, String deliveryPhoneNumber, String deliveryCompany, String orderCode, String orderStatus, double productOriginalPrice) {
            this.imageResource = imageResource;
            this.productName = productName;
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;
            this.productTotal = productTotal;
            this.productDiscount = productDiscount;
            this.productPromotion = productPromotion;
            this.deliveryAddress = deliveryAddress;
            this.deliveryPerson = deliveryPerson;
            this.deliveryPhoneNumber = deliveryPhoneNumber;
            this.deliveryCompany = deliveryCompany;
            this.orderCode = orderCode;
            this.orderStatus = orderStatus;
            this.productOriginalPrice = productOriginalPrice;
            this.productDiscountPrice = productDiscountPrice;
            this.totalPayment = totalPayment;
        }

        // Các phương thức getter
        public int getImageResource() {
            return imageResource;
        }

        public String getProductName() {
            return productName;
        }

        public String getProductPrice() {
            return productPrice;
        }

        public int getProductQuantity() {
            return productQuantity;
        }

        public String getProductTotal() {
            return productTotal;
        }

        public String getProductDiscount() {
            return productDiscount;
        }

        public String getProductPromotion() {
            return productPromotion;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public String getDeliveryPerson() {
            return deliveryPerson;
        }

        public String getDeliveryPhoneNumber() {
            return deliveryPhoneNumber;
        }

        public String getDeliveryCompany() {
            return deliveryCompany;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public String getOrderStatus() {
            return orderStatus;
        }
        public double getTotalPayment() {
            return totalPayment;
        }

        // Các phương thức setter
        public void setImageResource(int imageResource) {
            this.imageResource = imageResource;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setProductPrice(String productPrice) {
            this.productPrice = productPrice;
        }

        public void setProductQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
        }

        public void setProductTotal(String productTotal) {
            this.productTotal = productTotal;
        }

        public void setProductDiscount(String productDiscount) {
            this.productDiscount = productDiscount;
        }

        public void setProductPromotion(String productPromotion) {
            this.productPromotion = productPromotion;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public void setDeliveryPerson(String deliveryPerson) {
            this.deliveryPerson = deliveryPerson;
        }

        public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
            this.deliveryPhoneNumber = deliveryPhoneNumber;
        }

        public void setDeliveryCompany(String deliveryCompany) {
            this.deliveryCompany = deliveryCompany;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public void setTotalPayment(double totalPayment) {
            this.totalPayment = totalPayment;
        }

}

