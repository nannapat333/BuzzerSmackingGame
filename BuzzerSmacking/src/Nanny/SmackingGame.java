package Nanny;

import Game.TheGame;
import java.awt.event.*;
import Game.TheGame;
import javax.swing.*;
import java.awt.*;
import result.EndingPage;
public class SmackingGame extends JPanel implements ActionListener {
	JPanel panel1 = new JPanel();
	JButton hidebt = new JButton("");
	Timer timer = new Timer(1000, this);
	JLabel level = new JLabel("Choose game level");
	private JRadioButton easy = new JRadioButton("Easy");
	private JRadioButton hard = new JRadioButton("Hard");
	JLabel bg = new JLabel("Background color");
	public JRadioButton bgcolor1 = new JRadioButton("Black");
	public JRadioButton bgcolor2 = new JRadioButton("Blue");
	public JRadioButton bgcolor3 = new JRadioButton("White");
	int second = 30;
	EndingPage end = new EndingPage();
	JFrame frame = new JFrame("Buzzer Smacking Game");
	JPanel aa = new TheGame();

	public SmackingGame() {
		
		frame.setLayout(new BorderLayout());
		frame.add(aa, BorderLayout.CENTER);
		frame.add(panel1, BorderLayout.EAST);
		timer.start();

		panel1.setLayout(new GridLayout(7, 1));
		panel1.add(level);
		panel1.add(easy);
		panel1.add(hard);
		panel1.add(bg);
		panel1.add(bgcolor1);
		panel1.add(bgcolor2);
		panel1.add(bgcolor3);

		frame.setVisible(true);
		frame.setSize(1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor1.addActionListener(this);
		bgcolor2.addActionListener(this);
		bgcolor3.addActionListener(this);
		easy.addActionListener(this);
		hard.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		second--;
		//System.out.println(second);
		if (e.getSource() == bgcolor1) {
			// setBackground(Color.BLACK);
			((TheGame) aa).changebg(Color.BLACK);
			bgcolor2.setSelected(false);
			bgcolor3.setSelected(false);
			aa.repaint();
		} else if (e.getSource() == bgcolor2) {
			// setBackground(Color.BLUE);
			((TheGame) aa).changebg(Color.BLUE);
			bgcolor1.setSelected(false);
			bgcolor3.setSelected(false);
			aa.repaint();
		} else if (e.getSource() == bgcolor3) {
			// setBackground(Color.WHITE);
			((TheGame) aa).changebg(Color.WHITE);
			bgcolor1.setSelected(false);
			bgcolor2.setSelected(false);
			aa.repaint();
		}
		if (e.getSource() == easy) {
			hard.setSelected(false);
			
		}
		if (e.getSource() == hard) {
			easy.setSelected(false);
			
		}
		if (second == 0) {

			if (easy.isSelected()) {

				if (((TheGame) aa).score >= 30) {
					EndingPage end1 = new EndingPage();
					end1.wingame();
					frame.dispose();
					//System.out.println("EasyComplete");
				}
				else {
					end.failgame();
					frame.dispose();
				}
			} if (hard.isSelected()){
				if (((TheGame) aa).score >= 45) {
					end.wingame();
					frame.dispose();
					//System.out.println("HardComplete");
				}else {
					end.failgame();
					frame.dispose();
				}

			}
		}

	}

}
