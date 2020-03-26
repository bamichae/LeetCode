package MinTimeVisitAllPoints;
public class MinTimeVisitAllPoints
{
    /**
     * #1266
     * looked at answer for help
     * Find the absolute value of y2 - y1 and x2-x1. The larger of the two is the
     * min time it takes to get to the next point since you can travel at most 1
     * unit from one point to another
     */
    public int minTimeToVisitAllPoints(int[][] points)
    {
        int result = 0;
        for (int i = 1; i < points.length; i++)
        {
            int[] current = points[i];
            int[] previous = points[i - 1];
            result += Math.max(Math.abs(current[0] - previous[0]), Math.abs(current[1] - previous[1]));
        }
        return result;
    }
}
