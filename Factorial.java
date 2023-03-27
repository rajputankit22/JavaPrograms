import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int fact = factorial(n);
		System.out.println("factorila is = " + fact);
	}

	public static int factorial(int n) {
		if (n <= 0)
			return 1;
		return factorial(n - 1) * n;
	}
}