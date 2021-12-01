public class FindDivisor {

    public long numberOfDivisors(int n) {

        long count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.print(count);
        return count;
    }
}
