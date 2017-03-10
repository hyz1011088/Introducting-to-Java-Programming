import javax.swing.JFrame;
public class MyFrame {
	public static void main(String [] args){
		JFrame frame=new JFrame("myframe");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
