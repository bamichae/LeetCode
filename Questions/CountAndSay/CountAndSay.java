package CountAndSay;

public class CountAndSay
{


    public String countAndSay(int n)
    {
        if (n == 1)
        {
            return "1";
        }
        String finalString = "1";
        for (int i = 2; i <= n; i++)
        {
            finalString = calculate(finalString);
        }
        return finalString;
    }

    public String calculate(String inString)
    {
        String nthNum = "";
        for (int i = 0; i < inString.length(); i++)
        {
            int peekNum = i + 1;
            if (peekNum >= inString.length())
            {
                nthNum += decodeNum(inString.substring(i, i + 1));
            } else
            {
                if (!"invalid".equals(decodeNums(inString.substring(i, i + 1), inString.substring(peekNum, peekNum + 1))))
                {
                    nthNum += decodeNums(inString.substring(i, i + 1), inString.substring(peekNum, peekNum + 1));
                    i++;
                } else
                {
                    nthNum += decodeNum(inString.substring(i, i + 1));
                }
            }
        }
        return nthNum;
    }

    private String decodeNums(String first, String second)
    {
        return decodeNum(first + second);
    }

    private String decodeNum(String n)
    {
        if ("1".equals(n))
        {
            return "11";
        } else if ("11".equals(n))
        {
            return "21";
        } else if ("2".equals(n))
        {
            return "12";
        } else
        {
            return "invalid";
        }
    }

}
