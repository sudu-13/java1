public class invertedpattern {
     public static void main(String aa[]){
        int n=4, i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
     }
    
}
