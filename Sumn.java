import java.util.Scanner;

class Sumn {
	public static void main(String args[]){
		//Scanner object for capturing the user input
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter one number");
		int n = scanner.nextInt();
		int sum = sumnnatural(n);
		System.out.println(sum);
	}
	static int sumnnatural(int n){
		if(n==0) return 0;
		return sumnnatural(n-1)+n;
	}
}


