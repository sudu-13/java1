public class binomialcoefficient {
    public static int binomialco(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_rn = factorial(n-r);

        int binomialco = fact_n / (fact_r * fact_rn);
        return binomialco;
       
    }
    public static void main(String args[]){
        System.out.println("Enter the value of 6:"+binomialco(6,3));
    }
    
}
