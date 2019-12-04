package ToLowerCase;

//709
public class ToLowerCase
{
    public String toLowerCase(String str)
    {
        char[] tempCharArray = str.toCharArray();
        String finalString = "";
        for (char character : tempCharArray)
        {
            if (character > 64 && character < 91)
            {
                finalString += (char) (character + 32);
            } else
            {
                finalString += character;
            }
        }
        return finalString;
    }
}
