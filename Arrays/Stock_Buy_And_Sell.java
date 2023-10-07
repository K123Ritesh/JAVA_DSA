package Arrays;

public class Stock_Buy_And_Sell {

     // Naive Solution
     public static int maxProfit(int price[], int start, int end) {
          if (end <= start) {
               return 0;
          }
          int profit = 0;
          for (int i = start; i < end; i++) {
               for (int j = i + 1; j <= end; j++) {
                    if (price[j] > price[i]) {
                         int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1)
                                   + maxProfit(price, j + 1, end);
                         profit=Math.max(profit,curr_profit);
                    }
               }
          }
          return profit;
     }

     // Efficient Solution
     // Time :- O(n)
     public static int maxProfit_Efficiently(int price[], int n) {
          int profit = 0;
          for (int i = 0; i < n; i++) {
               if (price[i] > price[i - 1]) {
                    profit += (price[i] - price[i - 1]);
               }
          }
          return profit;
     }
}
