import java.util.Scanner;
public class ComparingIntegers
{
	public static void main(String... args)
	{
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.print("Enter firt integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		if (number1 == number2)
		System.out.printf("%d == %d These numbers are equal%n", number1, number2);
		
		if (number1 > number2)
		System.out.printf("%d > %d The first integer is larger%n", number1, number2);

		if (number1 < number2)
		System.out.printf("%d < %d The second integer is larger%n", number1, number2);
	}
}