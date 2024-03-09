public class binnarysearch {
    public static int binary(int numbers[], int keys){
        int start= 0, end = numbers.length - 1 ;
        while(start <= end){
            int mid = (start + end)/2;

            //comparsions
            if(numbers[mid] == keys){
                return mid;
            }
            if(numbers[mid]< keys){ //right 
                start = mid + 1;
            } else {            //left
                end =mid - 1; 
            }
        }
        return -1;
        
    }
    public static void main (String args[]){
        int numbers[]={11, 7,10,2,4,};
        int keys=10;
        System.out.println(" key found is:" +binary(numbers, keys));
    }
    
}
