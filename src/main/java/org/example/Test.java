package org.example;

import org.example.enums.MarketDiscount;

public class Test {
    public static void main(String[] args) {

        int appleWeight = 3;
        int strawberryWeight = 2;
        int mangoWeight = 1;
        Double appleDiscount = 0.8;

        double one = Calculate.calculatePrice(appleWeight, strawberryWeight);
        System.out.println("无优惠，购买苹果和草莓。购买水果的总价为：" + one + " 元");

        double two = Calculate.calculatePrice(appleWeight, strawberryWeight, mangoWeight);
        System.out.println("无优惠，购买苹果、草莓和芒果。购买水果的总价为：" + two + " 元");

        double three = Calculate.calculatePrice(appleWeight, strawberryWeight, mangoWeight,
                appleDiscount, MarketDiscount.NO_DISCOUNT);
        System.out.println("草莓限时打8折，购买苹果、草莓和芒果。购买水果的总价为：" + three + " 元");

        // 使用满100减10的折扣规则
        double four = Calculate.calculatePrice(appleWeight, strawberryWeight, mangoWeight,
                appleDiscount, MarketDiscount.TEN_DISCOUNT);
        System.out.println("草莓限时打8折，使用满100减10折扣规则后，购买水果的总价为：" + four + " 元");

    }
}
