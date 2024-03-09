public class firstOccurenceRecursion {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i ;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {7,3,4,2,9,5,4,10};
        System.out.println(firstOccurence(arr, 2, 0));
    }
    
}
