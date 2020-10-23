package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	JFrame frame = new JFrame();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton multiply = new JButton("mul");
	JButton divide = new JButton("div");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	public void run() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(250,250);
		frame.setTitle("Calculator");
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(sub);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		frame.add(panel);
		
		
	}

}
