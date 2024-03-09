import java.util.Scanner;

public class fever {
    public static void main(String aa[]){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp > 100){
            System.out.println("you have a fever");
        }else{
            System.out.println("you don't have a fever");
        }
    }
    
}
