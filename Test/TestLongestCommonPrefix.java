import org.junit.Test;

public class TestLongestCommonPrefix {
    @Test
    public void testLongestCommonPrefix() {
        String[] testStr = {"","b"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(testStr));
    }
}
