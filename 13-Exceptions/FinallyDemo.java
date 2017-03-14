
public class FinallyDemo {
	public static void main(String [] args){
		java.io.PrintWriter output=null;
		try{
			output=new java.io.PrintWriter("text.txt");
			output.println("welcome to java");
		}
		catch(java.io.IOException ex){
			ex.printStackTrace();
		}
		finally{
			if(output!=null)
				output.close();
		}
		System.out.println("end of program");
		
	}

}
