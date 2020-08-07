package box;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ColorBox extends JPanel {

	JButton red;
	JButton green;
	JButton blue;
	
	JTextField redField;
	JTextField greenField;
	JTextField blueField;
	
	public ColorBox() {
		red = new JButton("RED");
		green = new JButton("GREEN");
		blue = new JButton("BLUE");
		
		redField = new JTextField();
		greenField = new JTextField();
		blueField = new JTextField();
		
	}
	
	public void init() {
		panel();
	}
	
	public void panel() {
		this.setLayout(new GridLayout(2,3));
		
		this.add(red);
		this.add(green);
		this.add(blue);
		
		this.add(redField);
		this.add(greenField);
		this.add(blueField);
	}
}
