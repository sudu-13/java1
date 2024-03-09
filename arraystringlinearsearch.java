public class arraystringlinearsearch {
    public static int linearSearch(String names[], String keys){
        for(int i=0; i<names.length; i++){
            if(names[i]== keys){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
     String names[]={"ram","ajay","ram","amit"};
     String keys = "amit";
     System.out.println(keys+" "+"names found"+ "  "+linearSearch(names, keys));
      
    }
}
