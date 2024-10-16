package org.example.day11.review;

/*
https://www.coupang.com/vp/products/6440243339?vendorItemId=81186204527&sourceType=HOME_GW_PROMOTION&searchId=feed-765f6f2843604f769dd45b83ae38a481-gw_promotion&isAddedCart=
 */

public class 물건 {
    private String name; // 상품명
    private String seller; // 판매자
    private int price; // 가격
    private String arrivalTime; // 도착일
    private double discount;

    public 물건(String name, String seller, int price, String arrivalTime, double discount) {
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.arrivalTime = arrivalTime;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getSeller() {
        return seller;
    }

    public int getPrice() {
        return price;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getDiscount() {
        return discount;
    }

    public int getDiscountPrice(){
        return price - (int)(price * discount);
    }


    @Override
    public String toString() {
        return "물건{" +
                "name='" + name + '\'' +
                ", seller='" + seller + '\'' +
                ", price=" + price +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", discount=" + discount +
                '}';
    }
}
