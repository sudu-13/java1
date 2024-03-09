public class functionoverloading1 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println("sum :"+sum(4,5));
        System.out.println("sum :"+sum(4,5,6));
    }
}
