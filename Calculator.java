import java.util.Scanner;

class Calculator {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number -");
		System.out.println("Enter second number -");
		System.out.println("Enter the operator -");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		char operator = scanner.next().charAt(0);

		System.out.println(first);
		System.out.println(second);
		System.out.println(operator);
		
		double result =0;
		switch (operator) {
			case '+':
				result = first+second;
				break;
			case '-':
				result = first-second;
				break;
			case '*':
				result = first*second;
				break;
			case '%':
				result = first%second;
				break;
		
			default:
				System.out.println("YOu entered the wrong operator");
				break;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

		// System.out.printf("Final result is "+first + operator +second +"= %.1f", result);
	}
}