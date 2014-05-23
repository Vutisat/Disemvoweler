import java.util.Scanner;

public class Disemvoweler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Reads in user input
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter what your string to be disemvowel");
		String input = in.nextLine();
		in.close();
		
		input = input.replace(" ", "");
		System.out.println("Result: ");
		System.out.println(input.replaceAll("[a e i o u]", ""));
		System.out.println("Vowels: ");
		System.out.println(input.replaceAll("[b c d f g h j k l m n p q r s t v w x y z]", ""));
	}

}
