package arrays;

public class buy_and_sell_stock {
    public static int maxProfit(int[] prices){
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            //find min buying price
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            //calculate current profit
            int profit=prices[i]-minprice;
            //updata max profit
             if(profit>maxprofit){
                maxprofit=profit;
             }
        }
        return maxprofit;
    }
     public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit = " + result);
    }
}
