public class dectobinconv {
    public static void decToBin(int numDec){
        int myNum = numDec;   
        int pow = 0;
           int binNum=0;
           while(numDec > 0){
            int rem = numDec % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            numDec=numDec/2;
           }
           System.out.println("binary form is :" +myNum+ " = "+ binNum);
    }
    public static void main(String args[]){
        decToBin(6);
    }
    
}
