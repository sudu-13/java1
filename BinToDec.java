public class BinToDec {
    public static void bintodec(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastNum = binNum % 10;
            decNum = decNum + (lastNum * (int)Math.pow(2, pow));

            pow++;
            binNum=binNum/10;
        }

        System.out.println("Decimal is "+ myNum + " = " + decNum);
    }

    public static void main(String args[]){
        bintodec(101);
    }
    
}
