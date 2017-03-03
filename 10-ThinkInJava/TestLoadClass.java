import java.util.Scanner;
public class TestLoadClass {
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter yearly interest rate, for example, 8.25: ");
		double annualInterestRate=input.nextDouble();
		
		System.out.println("enter number of years as an integer");
		int numberOfYears=input.nextInt();
		
		System.out.println("enter load amount, for example, 120000.95");
		double loadAmount=input.nextDouble();
		
		Load load=new Load(annualInterestRate, numberOfYears,loadAmount);
		
		
		System.out.printf("The load was created on %s\n"+"The mouthly payment is %.2f\n The total payment is %.2f\n",load.getLoadDate().toString(),load.getMonthlyPayment(),load.getTotalPayment());
		
	}

}
