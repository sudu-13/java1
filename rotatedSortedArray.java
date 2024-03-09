public class rotatedSortedArray {
    public static int search(int arr[], int target, int si, int ei){

        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei - si)/2; //(si+ei)/2

        //case Found
        if(arr[mid] == target){
            return mid;

        }
        // mid on L1
        if(arr[si] <= arr[mid]){
            //case 1 : left
            if(arr[si]<= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //case 2 : right
            else{
                return search(arr, target, mid+1, ei);
            }

        }
        //mid of L2
        else{
            //case 3:right
            if(arr[mid] <=target && target <=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //case 4: left
            else{
                 return search(arr, target, si, mid-1);
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target = 0; //--> output 4
       System.out.println(search(arr, target, 0, arr.length-1));  

    }
    
}
