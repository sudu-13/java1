import java.util.*;
public class break1 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter yours no :");
            int n=sc.nextInt();

            if(n % 10 ==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
