// array prices where prices[i] is the price of a given stock on i^th day , return max profit if not return 0

package Arrays2.practice_que;
public class que3 {
    public static int max_profit(int prices[]){
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buy_price < prices[i]){
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
            else{
                buy_price = prices[i];
            }
        }
    return max_profit;    

    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(max_profit(prices));
    }
}