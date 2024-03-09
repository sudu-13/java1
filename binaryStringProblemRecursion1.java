public class binaryStringProblemRecursion1 {
     public static void binaryStringProblem(int n, int lastPlace, String str){
        // base case
     if(n == 0){
        System.out.println(str);
        return;
     }
// kaam
binaryStringProblem(n-1, 1, str+"1");
if(lastPlace == 1){
    binaryStringProblem(n-1, 0, str+"0");
}

     }
     public static void main(String args[]){
      
        binaryStringProblem(3,0,new String(""));
     }
    
}
