public class methodOverriding {
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }
}
class Animal1 {
    void eat() {
        System.out.println("Eats anything");
    }
}
class Deer extends Animal1{
    void eat() {
        System.out.println("Eats grass");
    }
}