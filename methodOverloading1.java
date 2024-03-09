public class methodOverloading1 {
    public static void main(String args[]){
        Culculator calc = new Culculator();
        System.out.println(calc.sum(3,5));
        System.out.println(calc.sum((float)3.5,(float)5.4));
        System.out.println(calc.sum(3,5,4));

    }
    
}
class Culculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
         return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
