/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */
import java.util.Scanner;
public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(6, 3);
		ps3.fizzString("");
		ps3.squirrelPlay(94, true);
		ps3.fizzStringAgain(18);
		ps3.makeBricks(3, 2, 10);
		ps3.loneSum(3, 3, 3);
		
	}
		
	public void dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			System.out.println("You will not get a table");
		}
		else if (you >= 8 || date >= 8) {
			System.out.println("You will get a table");
		}
		else {
			System.out.println("You will maybe get a table");
		}
	}
	
	public void fizzString(String str) {
		char init = str.charAt(0);
		int length = str.length() - 1;
		char last = str.charAt(length);
		if (init == 'f' && last == 'b') {
			System.out.println("FIZZBUZZ");
		}
		else if (init == 'f') {
			System.out.println("FIZZ");
		}
		else if (last == 'b') {
			System.out.println("BUZZ");
		}
		else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true && temp <= 100) {
			System.out.println("YES");
		}
		else if (isSummer == false && temp > 90 ) {
			System.out.println("NO");
		}
		else if (temp < 60) {
			System.out.println("YES");
		}
	}
	
	public void fizzStringAgain(int n) {
		if (n % 5 == 0 && n % 3 == 0) {
			System.out.println("FIZZBUZZ!");
		}
		else if (n % 3 == 0) {
			System.out.println("FIZZ!");
		}
		else if (n % 5 == 0) {
			System.out.println("BUZZ!");
		}
		else {
			System.out.println(n + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		int bigCount = goal / 5;
		int smallCount = goal % 5;
		if (small >= goal) {
			System.out.println("Can be built");
		}
		else if (bigCount > big) {
			System.out.println("Cannot be built");
		}
		else if (smallCount > small) {
			System.out.println("Cannot be built");
		}
		
		else if (bigCount <= big && smallCount <= small) {
			System.out.println("Can be built");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		int sum;
		if (a != b && b != c && a != c) {
			sum = a + b + c;
			System.out.println(sum);
		}
		else if (a == b && b != c && a != c) {
			sum = a + c;
			System.out.println(sum);
		}
		else if (a == b && b == c && a == c) {
			sum = 0;
			System.out.println(sum);
		}
		else if (a != b && b != c && a == c) {
			sum = b + c;
			System.out.println(sum);
		}
	}
	
	public void luckySum(int a, int b, int c) {
		
	}
	
	public void factorialWithFor(int n) {
		
	}
	
	public void factorialWithWhile(int n) {
		
	}
	
	public void isPrime(int n) {
		
	}
}