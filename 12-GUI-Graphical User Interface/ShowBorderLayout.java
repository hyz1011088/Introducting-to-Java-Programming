import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		setLayout(new BorderLayout(5,10));
		add(new JButton("East"));
		add(new JButton("South"));
		add(new JButton("West"));
		add(new JButton("North"));
		add(new JButton("Center"));
	}
	
	public static void main(String [] args){
		ShowBorderLayout frame=new ShowBorderLayout();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
