public class FinonacciRecursion {
    public static int fib(int n){
       if(n==0 || n==1 ){
        return n;
       } 
       int fibm1=fib(n-1);
       int fibm2=fib(n-2);
       int fN = fib(n-1) + fib(n-2);
       return fN;
    }
    public static void main(String args[]){
        int n = 20;
        System.out.println(fib(n));
    }
    
}
