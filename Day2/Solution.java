public class Solution{
    public static long sumCubes(long n)
    {
        long sum = 0;
        for (int x = 1; x <= n; x++)
            sum += x * x * x;
        System.out.print(sum);
        return sum;
    }
}
