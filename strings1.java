public class strings1 {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Ajay";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName ;
        printLetters(fullName);
    }
    
}
