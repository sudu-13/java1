import java.util.*;
public class martix2DArray {
    public static void main(String[] args) {
        System.out.print("Enter the values :");
        int martix[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<martix.length; i++){
            for(int j=0; j<martix[0].length; j++){
                martix[i][j] =sc.nextInt();
            }
        }

        // output
        for(int i=0; i<martix.length; i++){
            for(int j=0; j<martix[0].length; j++){
                System.out.print( martix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
