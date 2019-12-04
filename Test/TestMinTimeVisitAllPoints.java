import org.junit.Test;

public class TestMinTimeVisitAllPoints
{
    @Test
    public void testMinTimeVisitAllPoints()
    {
        int[][] testPoints = {{0,1}, {1,1}, {3, 4}};
        MinTimeVisitAllPoints minTimeVisitAllPoints = new MinTimeVisitAllPoints();
        System.out.println(minTimeVisitAllPoints.minTimeToVisitAllPoints(testPoints));
    }
}
