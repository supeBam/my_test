package org.example.enums;


// 超市折扣活动
public enum  MarketDiscount {
    // 无折扣
    NO_DISCOUNT {
        @Override
        public double applyDiscount(double totalPrice) {
            return totalPrice;
        }
    },

    //    满100 - 10
    TEN_DISCOUNT {
        @Override
        public double applyDiscount(double totalPrice) {
            if (totalPrice > 100) {
                return totalPrice - (totalPrice / 100 * 10);
            }
           return totalPrice;
        }
    },

    //    满100 - 50
    FIFTY_DISCOUNT {
        @Override
        public double applyDiscount(double totalPrice) {
            if (totalPrice > 100) {
                return totalPrice - (totalPrice / 100 * 50);
            }
            return totalPrice;
        }
    };

    // 抽象方法，由每个枚举常量具体实现
    public abstract double applyDiscount(double totalPrice);

}
