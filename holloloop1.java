public class holloloop1 {

    public static void main(String aa[]){
      
        int n=4,m=5,i,j;
        
        for(i=1;i<=n;i++){
        
            for(j=1;j<=m;j++){

            if(i==1 || j==1 || i==n || j==m){
            System.out.print("*");
            } else{
                System.out.print(" ");
            }  
        }

            System.out.println();
        }
    }
    
}
