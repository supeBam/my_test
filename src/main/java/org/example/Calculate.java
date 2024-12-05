package org.example;

import org.example.entity.Fruit;
import org.example.enums.MarketDiscount;
import org.example.entity.Strawberry;
import org.example.factory.FruitFactory;

public class Calculate {


    // 题目一
    public static double calculatePrice(int appleWeight, int strawberryWeight) {
        Fruit apple = FruitFactory.createFruit("apple");
        Fruit strawberry = FruitFactory.createFruit("strawberry");
        double totalPrice = 0;
        if (apple != null) {
            totalPrice = apple.getPrice() * appleWeight + totalPrice;
        }
        if (strawberry != null) {
            totalPrice = strawberry.getPrice() * strawberryWeight + totalPrice;
        }
        return totalPrice;
    }

    // 题目二
    public static double calculatePrice(int appleWeight, int strawberryWeight, int mangoWeight) {
        Fruit apple = FruitFactory.createFruit("apple");
        Fruit strawberry = FruitFactory.createFruit("strawberry");
        Fruit mango = FruitFactory.createFruit("mango");

        double totalPrice = 0;
        if (apple != null) {
            totalPrice = apple.getPrice() * appleWeight + totalPrice;
        }
        if (strawberry != null) {
            totalPrice = strawberry.getPrice() * strawberryWeight + totalPrice;
        }
        if (mango != null) {
            totalPrice = mango.getPrice() * mangoWeight + totalPrice;
        }
        return totalPrice;
    }

    // 题目三、四
    public static double calculatePrice(int appleWeight, int strawberryWeight, int mangoWeight, Double strawberryDiscount,
                                 MarketDiscount discountRule) {
        Fruit apple = FruitFactory.createFruit("apple");
        Fruit strawberry = FruitFactory.createFruit("strawberry");
        Fruit mango = FruitFactory.createFruit("mango");

        // 草莓打8折
        if (strawberry instanceof Strawberry) {
            ((Strawberry) strawberry).setDiscount(strawberryDiscount);
        }

        double totalPrice = 0;
        if (apple != null) {
            totalPrice = apple.getPrice() * appleWeight + totalPrice;
        }
        if (strawberry != null) {
            totalPrice = strawberry.getPrice() * strawberryWeight + totalPrice;
        }
        if (mango != null) {
            totalPrice = mango.getPrice() * mangoWeight + totalPrice;
        }

        // 超市折扣
        return discountRule.applyDiscount(totalPrice);
    }


}
