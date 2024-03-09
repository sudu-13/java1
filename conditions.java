import java.util.*;
public class conditions
{
    public static void main(String aa[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("equal to");
        }else{
            if(a>b)
            {
                System.out.println("a is greater");
            }else
        {
            System.out.println("a is loser");
        }
        }
    }
}