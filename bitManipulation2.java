// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class bitManipulation2 {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    
    public static int updateIthBit(int n, int i, int newBit){
       n=clearIthBit(n,i);
       int bitMask = newBit << i;
       return n | bitMask;
    } 
    
    public static int clearLastBit(int n, int i){
        int bitMask=(~0)<< i;
        return n & bitMask;
    }
    public static int clearRangeBit(int n, int i, int j){
        int a =(~0)<<(j+1);
        int b =(1<<i)-1;
        int bitMask = a | b ;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0 ;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){ // check our LSB
                count++;
            }
            n = n >>1;
        }
        return count ;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
         
        while(n>0){
            if((n & 1) != 0){ //check LSB
                 ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10,2,1));
         System.out.println(clearLastBit(15,2));
          System.out.println(clearRangeBit(10,2,4));
          System.out.println(isPowerOfTwo(32));
         System.out.println(countSetBits(10));  
         System.out.println(fastExpo(5, 3));
        
    }
}