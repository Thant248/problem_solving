import java.util.*;

class BuyTwoChocolates {

    public static void main(String[] args) {
        BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();
        int[] prices = {10, 4, 7};
        int money = 10;
        int result = buyTwoChocolates.buyChoco(prices, money);
        System.out.println(result);
    }
    public int buyChoco(int[] prices, int money) {
        
        Arrays.sort(prices);
        if(prices[0] + prices[1] <= money) {
            return (money  - (prices[0] + prices[1]));
        }else {
            return money;
        }
    }
}