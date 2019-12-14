package ReverseInteger;

public class ReverseInteger
{
    public int reverseInteger(int integer)
    {
        boolean isNegative = false;
        if(integer < 0)
        {
            isNegative = true;
        }

        StringBuilder reverse = new StringBuilder(Integer.toString(integer));
        if(isNegative)
        {
           reverse.deleteCharAt(0);
        }
        reverse.reverse();

        long reverseLong = Long.parseLong(reverse.toString());
        if(isNegative)
        {
            reverseLong *= -1;
        }
        if (reverseLong > Integer.MAX_VALUE || reverseLong < Integer.MIN_VALUE)
        {
            return 0;
        }
        else
        {
            return Integer.parseInt(String.valueOf(reverseLong));
        }
    }
}
