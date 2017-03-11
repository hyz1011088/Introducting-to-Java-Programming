import java.util.*;
public class InputMismatchExceptionDemo {
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		boolean continueInput=true;
		
		do{
			try{
				System.out.print("enter an integer: ");
				int number=input.nextInt();
				System.out.println("the number entered is "+number);
				continueInput=false;
			}
			catch(InputMismatchException ex){
				System.out.println("try again. ("+"incorrect input: an integer is required");
				input.nextInt();
			}
		}while(continueInput);
	}

}
