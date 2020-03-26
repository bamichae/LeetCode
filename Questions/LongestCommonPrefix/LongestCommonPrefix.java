package LongestCommonPrefix;
import java.util.HashSet;
import java.util.Set;

//#14
public class LongestCommonPrefix
{

    Set<String> prefixes = new HashSet<>();

    /**
     * start with strs[0] as prefix and remove characters as needed
     */
    public String longestCommonPrefix(String[] strs)
    {
        if (validate(strs) != null)
        {
            return validate(strs);
        }

        String finalPrefix = strs[0];
        for (int i = 1; i < strs.length; i++)
        {
            String sentinelWord = strs[i];
            String currWord = strs[i];
            if (currWord.length() == 0)
            {
                return "";
            }
            for (int j = 0; j < Math.min(sentinelWord.length(), finalPrefix.length()); j++)
            {

                if (sentinelWord.charAt(0) != finalPrefix.charAt(0))
                {
                    return "";
                } else if (sentinelWord.charAt(j) == finalPrefix.charAt(j))
                {
                    currWord = finalPrefix.substring(0, j + 1);
                }
            }
            finalPrefix = currWord;
        }
        return finalPrefix;
    }

    private String validate(String[] strs)
    {
        if (strs.length == 0)
        {
            return "";
        } else if (strs.length == 1)
        {
            return strs[0];
        } else if (strs[0].length() == 0)
        {
            return "";
        } else
        {
            return null;
        }
    }
}
