public class optimizedPowerRecursion {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        // for even
        int halfPowerSq = power(x, n/2) * power(x, n/2);

        // for odd
        if(n % 2 !=0){
            halfPowerSq = x* halfPowerSq;
        }
        return halfPowerSq;

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println(power(x, n));
    }
    
}
