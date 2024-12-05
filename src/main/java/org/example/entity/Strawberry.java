package org.example.entity;

import java.math.BigDecimal;

// 草莓
public class Strawberry extends Fruit{
    // 水果单价
    private double price = 13d;

    @Override
    public double getPrice() {
        return price;
    }

    // 设置折扣方法
    public void setDiscount(Double newDiscount) {
        if (newDiscount!= null && newDiscount >= 0 && newDiscount <= 1) {
            price = price * newDiscount;
        }
    }
}
