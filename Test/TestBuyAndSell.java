import BuyAndSell.BuyAndSell;
import org.junit.Test;

public class TestBuyAndSell
{
    @Test
    public void testBuyAndSell()
    {
        int[] maxProfit = {7, 1, 5, 3, 6, 4};
        BuyAndSell buyAndSell = new BuyAndSell();
        int max = buyAndSell.maxProfit(maxProfit);
        System.out.println(max);
    }
}
