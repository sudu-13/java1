public class arrayLinearSearch {
    public static int linearSearch(int numbers[], int keys){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == keys){
                return i ;
            }
        }

        return -1;
    }
    
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16};
        int keys = 13;
        int index = linearSearch(numbers, keys);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("number found is:" + index);
        }
    }
}
