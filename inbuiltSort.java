import java.util.*;
public class inbuiltSort {
    public static void inbuilt(Integer arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev --;
            }
            // insertion 
            arr[prev + 1] = curr ;
        }
    }

        public static void printArr(Integer arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
    
            }
            System.out.println();
        
    }
    public static void main(String args[]){
        Integer arr[]={4,2,5,3,1};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);

    }

    
}
