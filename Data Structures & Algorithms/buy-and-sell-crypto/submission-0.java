class Solution {
    public int maxProfit(int[] prices) {
        int min_price= Integer.MAX_VALUE;
        int profit_price=0;

        for(int price:prices){
            if(price < min_price){
                min_price=price;
            }else{
                profit_price=Math.max(profit_price, price - min_price);
            }
        }

        return profit_price;
        
    }
}
