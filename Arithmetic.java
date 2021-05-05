import java.util.Scanner;
	public class Arithmetic
	{
		public static void main(String... args)
		{
			Scanner input = new Scanner(System.in);
			
			int a;
			int b;
			int sum;
			int product;
			int difference;
			int quotient;
			
			System.out.print("Enter 1st integer: ");
			a = input.nextInt();

			System.out.print("Enter 2nd integer: ");
			b = input.nextInt();
			
			sum = a + b;
			System.out.printf("sum is %d%n", sum);
			
			product = a * b;
			System.out.printf("product is %d%n", product);

			difference = a - b;
			System.out.printf("difference is %d%n", difference);
			
			quotient = a / b;
			System.out.printf("quotient is %d%n", quotient);
		}
}