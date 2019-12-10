import HammingDistance.HammingDistance;
import org.junit.Test;

public class TestHammingDistance
{
    @Test
    public void testHammingDistance()
    {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1, 7));
    }
}
