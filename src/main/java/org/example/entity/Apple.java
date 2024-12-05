package org.example.entity;

import java.math.BigDecimal;

/**
 * 苹果类
 */
public class Apple extends Fruit {

    // 水果单价
    private double price = 8d;

    @Override
    public double getPrice() {
        return price;
    }


    // 设置折扣方法，用于调整苹果价格
    public void setDiscount(Double newDiscount) {
        if (newDiscount!= null && newDiscount >= 0 && newDiscount <= 1) {
            price = price * newDiscount;
        }
    }

}
