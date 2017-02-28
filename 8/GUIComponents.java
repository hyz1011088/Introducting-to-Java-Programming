import javax.swing.*;;
public class GUIComponents {
	
	public static void main(String [] args){
		JButton jbtOK=new JButton("OK");
		JButton jbtCancle=new JButton("cancle");
		JLabel jlbName=new JLabel("enter your name:");
		JTextField jtfName=new JTextField("type name here");
		JCheckBox jckBold=new JCheckBox("Bold");
		JCheckBox jckItalic=new JCheckBox("Italic");
		JRadioButton jrbRed=new JRadioButton("Red");
		JRadioButton jrbYellow=new JRadioButton("Yellow");
		JComboBox jcboColor=new JComboBox(new String[] {"Freshman","Sophomore","Junior","Senior"});
	
		JPanel panel=new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancle);
		panel.add(jlbName);
		panel.add(jtfName);
		panel.add(jckBold);
		panel.add(jckItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		
		JFrame frame=new JFrame();
		frame.add(panel);
		frame.setTitle("show GUI components");
		frame.setSize(450,100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
