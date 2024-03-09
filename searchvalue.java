import java.util.Scanner;

public class searchvalue {

    public static boolean search(int martix[][], int keys){
        for(int i=0; i<martix.length; i++){
            for(int j=0; j<martix[0].length; j++){
                if(martix[i][j] == keys){
                    System.out.print("found the value ("+ i + ","+ j +")");
                    return true;
                }
            }
        }
        System.out.print("not found the value");
        return false;
    }

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

        search(martix, 5 );

    }
    
}
