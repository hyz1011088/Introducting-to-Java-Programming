import javax.swing.JOptionPane;

public class SentineValueUsingConfirmationDialog {
	public static void main(String [] args)
	{
		int sum=0;
		int option=JOptionPane.YES_OPTION;
		while(option==JOptionPane.YES_OPTION){
			String dataString=JOptionPane.showInputDialog("enter a value:");
			int data=Integer.parseInt(dataString);
			sum+=data;
			option=JOptionPane.showConfirmDialog(null, "continue?");
		}
		JOptionPane.showMessageDialog(null, "the sum is "+sum);
	}
}
