public class swapp1
{
public static void main(String aa[])
{
int a=10, b=40;
System.out.println("before swapping:" +a+"  "+b);

/*int v=a;
a=b;
b=v;*/

/*a=a+b;
b=a-b;
a=a-b;*/

b=a+b-(a=b);

System.out.println("after swapping:" +a+"  "+b);




}
}
