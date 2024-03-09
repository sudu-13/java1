public class factorialusingvoidmain {
    public static void factorialno(int n){
        int fact = 1;
        for ( int i=1; i<= n;i++){
            fact *= i;
            System.out.println("factorial of 6 is :"+fact);
            
        }
    }
    public static void main(String args[]){
        factorialno(6);
    }
    
}
