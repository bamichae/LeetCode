import org.junit.Test;
import CountAndSay.CountAndSay;
public class TestCountAndSay
{
    @Test
    public void testCountAndSay()
    {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println("result: " + countAndSay.calculate("1211"));
    }
}
