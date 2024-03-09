import java.util.*;
public class lagestNoInArray {
    public static int largest(int numbers[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(large < numbers[i]){
                large = numbers[i];
            }
            if(small > numbers[i]){
                small = numbers[i];
            }
        }
        System.out.println("smallest no is:" +small);
        return large;
    }
    public static void main(String args[]){
        int numbers[]={1, 5, 8, 12, 2, 9};
        System.out.println("largest no is:" +largest(numbers));
         
    }
}
