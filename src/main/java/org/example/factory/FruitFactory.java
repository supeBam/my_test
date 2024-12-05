package org.example.factory;

import org.example.entity.Apple;
import org.example.entity.Fruit;
import org.example.entity.Mango;
import org.example.entity.Strawberry;

// 水果工厂
public class FruitFactory {

    public static Fruit createFruit(String fruitType) {
        if ("apple".equalsIgnoreCase(fruitType)) {
            return new Apple();
        } else if ("strawberry".equalsIgnoreCase(fruitType)) {
            return new Strawberry();
        } else if ("mango".equalsIgnoreCase(fruitType)) {
            return new Mango();
        }
        return null;
    }
}
