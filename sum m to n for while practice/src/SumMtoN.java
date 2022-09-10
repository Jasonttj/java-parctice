import java.util.Scanner;
public class SumMtoN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This is a program to get sum from m to n,"
				+ "\nm and n are both integer,m<n.");
		System.out.print("Value of m:");
		long m = scanner.nextInt();
		System.out.print("Value of n:");
		long n = scanner.nextInt();
		long sum = 0;
		while (m <= n) {
			sum += m;
			m++;
		}
		System.out.printf("The sum from m to n is %d",sum);
	}
}
