import java.util.Scanner;
	public class ArithmeticSmallestAndLargest
	{
		public static void main(String... args)
		{
			Scanner input = new Scanner(System.in);
			
			int a;
			int b;
			int c;
			int sum;
			int average;
			int product;
			int smallest;
			int largest;
			
			System.out.print("Enter 1st integer: ");
			a = input.nextInt();

			System.out.print("Enter 2nd integer: ");
			b = input.nextInt();
			
			System.out.print("Enter 3rd integer: ");
			c = input.nextInt();

			sum = a + b + c;
			System.out.printf("sum is %d%n", sum);

			average = sum / 3;
			System.out.printf("average is %d%n", average);
			
			product = a * b * c;
			System.out.printf("product is %d%n", product);
			
			if (a > b && a < c

			

		}
}