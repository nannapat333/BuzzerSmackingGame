package Game;
import Nanny.SmackingGame;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class TheGame extends JPanel implements ActionListener{
	public int score = 0;
	public JComponent paintComponent;
	public int second = 30;
	Timer timer;
	Color color = Color.RED;
	int arrow1=300;
	int arrow2=400;
	int arrow3=500;
	int arrow4=400;
	boolean change = false;
	
	public TheGame(){
		super();
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
		
		this.addMouseListener(new Click());
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(change) {
			color=Color.green;
			arrow1=350;
    	 	arrow2=450;
    	 	arrow3=550;
    	 	arrow4=450;
		}
		else {
			color=Color.red;
			arrow1=300;
    	 	arrow2=400;
    	 	arrow3=500;
    	 	arrow4=400;
		}
		g.setColor(color);
		g.fillOval(500, 650, 200, 100);
		g.setColor(color);
		g.fillRect(500, 600, 200, 100);
		g.setColor(color);
		g.fillOval(500, 550, 200, 100);
		g.setColor(Color.ORANGE);
		g.fillRect(550, arrow1, 100, 100);
		int[]xrect = {500, 600, 700};
		int[]yrect = {arrow2, arrow3, arrow4};
		g.fillPolygon(xrect,yrect,3);
		Font myFont = new Font("SanSerif", Font.BOLD, 40);
		g.setFont(myFont);
		g.setColor(Color.GREEN);
		g.drawString("Your score : "+score, 100, 200);
		g.drawString("Timer : "+second, 100, 100);
		
		
	}
		
	public void changebg(Color color) {
		setBackground(color);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		}
		
		
	
	class Click implements MouseListener{
		

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 int x = e.getX();
	     int y = e.getY();
	     

	     if (x >= 500 && x <= 700
	            && y >= 550 && y <= 750) {
	    	 	score++;
	    	 	change=true;
	            repaint();
	     }
	     else {
	    	 score+=0;
	     }
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		change=false;
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	}	
	
	
	
	public class TimerListener implements ActionListener{
		TimerListener(){
			
		}
		public void actionPerformed(ActionEvent e) {
			
			if (second > 0) {
	            second--;
	            repaint(); 
	        } 
			if(second==0) {
				//timer.stop(); 
				
	        }
			
			
				
		
				
				
			}
		}
		}
	


		
		 
	
