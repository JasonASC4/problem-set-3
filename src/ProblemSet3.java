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
		ps3.dateFashion(5, 10);
		ps3.fizzString("abc");
		ps3.squirrelPlay(95, true);
		ps3.fizzStringAgain(15);
		ps3.makeBricks(3, 2, 10);
		ps3.loneSum(3, 3, 3);
		ps3.luckySum(1, 2, 3);
		ps3.factorialWithFor(4);
		ps3.factorialWithWhile(4);
		ps3.isPrime(144);
	}
		
	public void dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			System.out.println("NO");
		}
		else if (you >= 8 || date >= 8) {
			System.out.println("YES");
		}
		else {
			System.out.println("MAYBE");
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
		int sum;
		if (a != 13 && b != 13 && a != 13) {
			sum = a + b + c;
			System.out.println(sum);
		}
		else if (a == 13) {
			sum = 0;
			System.out.println(sum);
		}
		else if (a != 13 && b == 13) {
			sum = a;
			System.out.println(sum);
		}
		else if (a != 13 && b != 13 && c == 13) {
			sum = a + b;
		}
	}
	
	public void factorialWithFor(int n) {
       int result = 1;
       for (int i = 1; i <= n; i++) {
           result = result * i;
       }
       System.out.println(result);
	}
	
	public void factorialWithWhile(int n) {
	    int result = 1;;
        int i = 1;
        while(i <= n) {
            result *= i;
            i++;
        }
        System.out.println(result);
    }
	
	public void isPrime(int n) {
	    int temp;
	boolean isPrime=true;
	    for(int i=2;i<=n/2;i++) {
           temp=n%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println("PRIME");
	else
	   System.out.println("NOT PRIME");
   }
}
