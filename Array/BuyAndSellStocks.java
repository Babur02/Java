public class BuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 };
        System.out.println(buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks(int prices[]) {
        // Profit = SP - BP, SP = prices[i]
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // Today's profit
                profit = prices[i] - buyPrice;
                // Global profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // to keep track of Min buyPrice
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
