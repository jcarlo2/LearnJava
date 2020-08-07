package box;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	JSplitPane split;
	ColorBox cb;
	ColorSquare cs;

	public Frame() {
		cb = new ColorBox();
		cs = new ColorSquare();
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,cb,cs);
	}
	
	public void init() {
		cb.init();
		frameSet();
	}
	
	public void frameSet() {
		this.add(split);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
