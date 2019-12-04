import ToLowerCase.ToLowerCase;
import org.junit.Test;

public class TestToLowerCase
{
    @Test
    public void testToLowerCase()
    {
        //test without .toLowerCase
        ToLowerCase toLowerCase = new ToLowerCase();
        System.out.println(toLowerCase.toLowerCase("MAKE DIS LOWER CASE"));
    }
}
