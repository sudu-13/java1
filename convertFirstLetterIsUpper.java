public class convertFirstLetterIsUpper {
    public static String toUpper(String str){
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); 

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' '  && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));// to convert uppercase
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "hi, i am sudarshan";

        System.out.println(toUpper(str));
    }
    
}
