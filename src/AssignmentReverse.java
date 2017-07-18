/**
 *  Assignment 07/17/2017
 */
import java.util.Scanner;
import java.util.ArrayList;
public class AssignmentReverse {

	public static void main(String[] args){
		String userInput;
		Scanner in  =  new Scanner(System.in);
		
		System.out.println("Input a word/phrase: ");
		userInput = in.nextLine();
		
		reverse(userInput);
	}
	
	public static void reverse(String str){
		String[] strArr = str.split("");
		ArrayList<String> rev = new ArrayList<String>();
		
			for(int x=str.length()-1;x>=0;x--){
				rev.add(strArr[x]);
			}
			String output = String.join("",rev);
			System.out.println("Reverse Output: \n" + output);
	}
		
}

