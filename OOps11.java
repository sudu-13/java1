class OOps1{
    static int a= 10;
    static int b;
    static void changeB(){
        b=a*3;
    }
}
class OOps11{
    public static void main(String args[]){
        OOps1 t = new OOps1();
        t.changeB();
        System.out.println(OOps1.a+OOps1.b);
    }
}
