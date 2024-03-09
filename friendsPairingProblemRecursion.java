public class friendsPairingProblemRecursion {
    public static int friendPair(int n){

        if(n == 1 || n == 2){
            return n ;
        }
        //choice
        //single
        /* 
        int fnm1 = friendPair(n-1);

        // pair
        int fnm2 = friendPair(n-2);
        int pairWays = (n-1) * fnm2;

        // totways
        int totways = fnm1 + pairWays;

        return totways;
        */

         return friendPair (n -1) + (n-1) * friendPair(n-2);

    }
    public static void main ( String args[]){
        int n = 3;
        System.out.println(friendPair(n));
    }
    
}
