import java.util.scanner;
	public class CarPool
{
	public static void main(String... args)
	{
	
	Scanner input = new Scanner(System.in);

	int totalmiles;
	int gasolinecost;
	int averagemiles;
	int parkingfees;
	int tolls;
	int costofdriving;

	System.out.println("Enter total miles driven per day: ");
	totalmiles = input.next();

	System.out.println("Enter cost per gallon: ");
	gasolinecost = input.next();

	System.out.println("Enter average miles per gallon: ");
	averagemiles = input.nextInt();

	System.out.println("Enter parking fees per day: ");
	parkingfees = input.nextInt();

	System.out.println("Enter tolls per day: ");
	tolls = input.nextInt();

	costofdriving = 