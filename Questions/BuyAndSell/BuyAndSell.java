package BuyAndSell;

/**
 * #121 Determines the maximum profit you can get from buying and selling stocks
 * ie. 5, 1, 6, 10, 4 = max profit = 10 - 1 = 9
 */
public class BuyAndSell
{
    int maxProfit = 0;

    public int maxProfit(int[] prices)
    {
        buyScan(prices);
        return maxProfit;
    }

    private void buyScan(int[] prices)
    {
        for (int buyIndex = 0; buyIndex < prices.length; buyIndex++)
        {
            sellScan(prices, buyIndex);
        }
    }

    private void sellScan(int[] prices, int buyIndex)
    {
        for (int sellIndex = buyIndex + 1; sellIndex < prices.length; sellIndex++)
        {
            int profit = calculateProfit(prices[buyIndex], prices[sellIndex]);
            updateMaxProfit(profit);
        }
    }

    private int calculateProfit(int buy, int sell)
    {
        return sell - buy;
    }

    private void updateMaxProfit(int profit)
    {
        maxProfit = Math.max(profit, maxProfit);
    }
}
