import java.io.FileNotFoundException;

public class WriteData {
	public static void main(String [] args) throws FileNotFoundException{   //注意文件操作时需要throws exception
		java.io.File file=new java.io.File("score.txt");
		if(file.exists()){
			System.out.println("file already exits");
			System.exit(0);
		}
		java.io.PrintWriter output=new java.io.PrintWriter(file);
		output.print("john t smith ");
		output.println(90);
		output.print("eric k jones ");
		output.println(85);
		output.close();
	}
}
