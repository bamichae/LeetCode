import DefangIP.DefangIP;
import org.junit.Test;

public class TestDefangIP
{
    @Test
    public void testDefangIP()
    {
        DefangIP defangIP = new DefangIP();
        System.out.println(defangIP.defang("255.100.50.0"));
    }
}
