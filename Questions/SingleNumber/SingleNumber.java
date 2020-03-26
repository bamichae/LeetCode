package SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber
{
    private Set<Integer> numSet = new HashSet<>();
    public int singleNumber(int[] nums)
    {
        scanList(nums);
        return numSet.stream().findFirst().get();
    }

    private void scanList(int[] nums)
    {
        for(int number : nums)
        {
            evaluateNumber(number);
        }
    }

    private void evaluateNumber(int number)
    {
        if(!numSet.remove(number))
        {
            numSet.add(number);
        }
    }
}
