public class inheritance1 {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breate();
        shark.swin();
    }
    
}
//base class or parent class
class Animal{
String color;

void eat(){
    System.out.println("Eats");
}
void breate(){
    System.out.println("Breates");
}
}
// derived class or child class
class Fish extends Animal{
    int fins;

    void swin(){
        System.out.println("Swins in water");
    
    }
}

