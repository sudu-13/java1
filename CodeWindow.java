import java.util.*;
import java.lang.*;
import java.io.*;

class CodeWindow
{
    static char returnDig(String n) {
        if(n.equals("zero")) return '0';
		else if(n.equals("one")) return '1';
		else if(n.equals("two")) return '2';
		else if(n.equals("three")) return '3';
		else if(n.equals("four")) return '4';
		else if(n.equals("five")) return '5';
		else if(n.equals("six")) return '6';
		else if(n.equals("seven")) return '7';
		else if(n.equals("eight")) return '8';
		return '9';
    }
	public static void main (String[] args) throws Exception
	{
        System.out.println("Enter the String :");
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		String number = "";
		boolean d = false, t = false;
		for(int i=0; i<str.length; i++) {
		    if(d == true) {
		        number += "" + returnDig(str[i]) + returnDig(str[i]);
		        d = false;
		    }
		    else if(t == true) {
		        number +=  "" + returnDig(str[i]) + returnDig(str[i]) + returnDig(str[i]);
		        t = false;
		    } else {
    		    if(str[i].equals("double")) d = true;
    		    else if(str[i].equals("triple")) t = true;
    		    else number += returnDig(str[i]);
		    }
		}
		System.out.println(number);
	}
}