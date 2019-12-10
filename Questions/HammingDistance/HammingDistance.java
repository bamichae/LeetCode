package HammingDistance;

public class HammingDistance
{
    /**
     * Solution shows that bitwise XOR is best, return Integer.bitCount(x ^ y) one liner solves it
     */
    public int hammingDistance(int x, int y)
    {
        String xBinary = Integer.toBinaryString(x), yBinary = Integer.toBinaryString(y);
        String largerBin = getLarger(xBinary, yBinary);

        String addZeros = "";
        for (int i = 0; i < Math.abs(xBinary.length() - yBinary.length()); i++)
        {
            addZeros += '0';
        }

        if ("xBinary".equals(largerBin))
        {
            yBinary = addZeros + yBinary;
        } else if ("yBinary".equals(largerBin))
        {
            xBinary = addZeros + xBinary;
        }

        int countDiff = 0;
        for (int i = 0; i < yBinary.length(); i++)
        {
            if (yBinary.charAt(i) != xBinary.charAt(i))
            {
                countDiff++;
            }
        }
        return countDiff;
    }

    public String getLarger(String xBinary, String yBinary)
    {
        int xBinLen = xBinary.length(), yBinLen = yBinary.length();
        return xBinLen > yBinLen ? "xBinary" : xBinLen < yBinLen ? "yBinary" : "None";

    }
}
