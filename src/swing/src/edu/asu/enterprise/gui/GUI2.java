package edu.asu.enterprise.gui;

import java.awt.*;
import javax.swing.*;

class GUI2 {
	public static void main (String args[]) {
		JFrame container = new JFrame();
		container.setSize(300,200);

		Container pane = container.getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(new JButton("Click Me"));
		pane.add(new JTextField("Fill me in...", 15));

		container.setVisible(true);
	}
}
