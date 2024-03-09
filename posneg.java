import java.util.*;
public class posneg {
    public static void main(String aa[]){
        System.out.println("Enter a postive or negative no :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 0){
            System.out.println("x is greater than 0");
        } else{
            System.out.println("x is less than or equal to 0");
        }
    }
    
}
