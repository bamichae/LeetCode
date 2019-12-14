import ReverseInteger.ReverseInteger;
import org.junit.Test;

public class TestReverseInteger
{
    @Test
    public void testReverseInteger()
    {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseInteger(-2147483648));
    }
}
