package result;
import javax.swing.*;

import java.awt.*;


public class EndingPage extends JPanel{
	JPanel name_panel = new JPanel();
	JPanel result_panel = new JPanel();
	JLabel result = new JLabel("");
	JFrame f1 = new JFrame("Buzzer Smacking Game");
	StartingPage gg = new StartingPage();
	JLabel bb = new JLabel();
	public EndingPage(){

		
		name_panel.add(bb);
		result_panel.add(result);
		
		
		
		f1.setLayout(new GridLayout(2,1));
		f1.add(name_panel);
		f1.add(result_panel);
		f1.setSize(1200,800);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void failgame() {
		bb.setText(StartingPage.Nanny);
		result.setText("FAIL!");
		
	}
	public void wingame() {
		bb.setText(StartingPage.Nanny);
		result.setText("COMPLETE!");
	}
	
	

}

	


