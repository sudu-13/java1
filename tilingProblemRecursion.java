public class tilingProblemRecursion {
    public static int tilingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        // for vertical
        int fmn1 = tilingProblem(n-1);

        //for horizontal
        int fmn2 = tilingProblem(n-2);

        int totWays = fmn1 + fmn2;
        return totWays ;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(7));
    }
    
}
