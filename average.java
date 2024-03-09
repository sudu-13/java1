import java.util.*;
public class average{
    public static void main(String aa[]){
        System.out.println("Enter the three no:");
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int avg=(A+B+C)/3;
        System.out.println("average of no:"+ avg);
    }
}