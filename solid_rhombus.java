public class solid_rhombus {
    public static void solid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            // space 
            for(int j= 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
    public static void main(String args[]){
        solid(5);
    }
    
}
