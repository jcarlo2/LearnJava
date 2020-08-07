package box;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class ColorSquare extends JPanel implements KeyListener {

	int red = 0;
	int green = 0;
	int blue = 0;
	
	public ColorSquare() {
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 300, 500);
		
		g.setColor(new Color(red,green,blue));
		g.fillRect(50, 50, 200, 20);
		g.setColor(new Color(red+1,green+1,blue+1));
		g.fillRect(50, 70, 200, 20);
		g.setColor(new Color(red+2,green+2,blue+2));
		g.fillRect(50, 90, 200, 20);
		g.setColor(new Color(red+3,green+3,blue+3));
		g.fillRect(50, 110, 200, 20);
		g.setColor(new Color(red+4,green+4,blue+4));
		g.fillRect(50, 130, 200, 20);
		g.setColor(new Color(red+5,green+5,blue+5));
		g.fillRect(50, 150, 200, 20);
		g.setColor(new Color(red+6,green+6,blue+6));
		g.fillRect(50, 170, 200, 20);
		g.setColor(new Color(red+7,green+7,blue+7));
		g.fillRect(50, 190, 200, 20);
		g.setColor(new Color(red+8,green+8,blue+8));
		g.fillRect(50, 210, 200, 20);
		g.setColor(new Color(red+9,green+9,blue+9));
		g.fillRect(50, 230, 200, 20);
		g.setColor(new Color(red+10,green+10,blue+10));
		g.fillRect(50, 250, 200, 20);
		g.setColor(new Color(red+11,green+11,blue+11));
		g.fillRect(50, 270, 200, 20);
		g.setColor(new Color(red+12,green+12,blue+12));
		g.fillRect(50, 290, 200, 20);
		g.setColor(new Color(red+13,green+13,blue+13));
		g.fillRect(50, 310, 200, 20);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_Q) {
			red = (int)(Math.random()*241)+1;
			green = (int)(Math.random()*241)+1;
			blue = (int)(Math.random()*241)+1;
			System.out.println("@@");
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
