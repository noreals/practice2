package osu.cse1223;
import java.util.Scanner;

public class practice2 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String input = keyboard.nextLine();
		String middleChar =findMiddle(input);
		System.out.println("The middle character(s) is/are: "+ middleChar);
		System.out.println("A variety of string values..." +middleChar+"X");
		}
		public static String findMiddle(String word) {
		String middle = "";
		int position = 0;
		if ((word.length()%2)==1) {
			position = ((word.length()/2)+(word.length()%2))-1;
			middle = middle+(word.charAt(position));
		}
		else {
			position = (word.length()/2);
			middle = word.substring(position-1,(position+1));
			System.out.println(middle);
			}
		System.out.println("First Change");
		return middle;
		}
}

