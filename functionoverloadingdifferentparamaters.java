public class functionoverloadingdifferentparamaters{
    public static int sum( int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println("sum:"+sum(2,5));
         System.out.println("sum:"+sum(2.7f,5.5f));
    }
}