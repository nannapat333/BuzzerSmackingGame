package result;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import Nanny.SmackingGame;
public class StartingPage extends JPanel implements ActionListener{
	JPanel namepanel = new JPanel();
	JPanel startpanel = new JPanel();
	JLabel name = new JLabel("Name: ");
	JTextField entername = new JTextField(30);
	JFrame frame = new JFrame("Buzzer Smacking Game");
	JButton start = new JButton("START");
	protected static  String Nanny;
	
	public StartingPage() {
		namepanel.setLayout(new FlowLayout());
		namepanel.add(name);
		namepanel.add(entername);
		
		start.setPreferredSize(new Dimension(300,100));
		startpanel.setLayout(new FlowLayout());
		startpanel.add(start);
		
		
		frame.setLayout(new GridLayout(2,1));
		frame.add(namepanel);
		frame.add(startpanel);
		frame.setVisible(true);
		frame.setSize(1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		start.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Nanny = entername.getText();
		if(e.getSource()==start) {
			SmackingGame game = new SmackingGame();
			frame.dispose();
		}
	}
	

}
