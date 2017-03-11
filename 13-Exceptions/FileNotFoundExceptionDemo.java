import java.util.Scanner;
import java.io.*;

public class FileNotFoundExceptionDemo {
	public static void main(String [] args){
		Scanner inputFromConsole=new Scanner(System.in);
		System.out.println("enter a file name: ");
		String filename=inputFromConsole.nextLine();
		
		try{
			Scanner inputFromFile=new Scanner(new File(filename));   //在这个地方如果没有输入的文件名会默认抛出异常，不执行下句直接进入catch
			System.out.println("file "+ filename+" exits ");
		}
		catch(FileNotFoundException ex){
			System.out.println("exception: "+filename+ " not found");
		}
	}

}

