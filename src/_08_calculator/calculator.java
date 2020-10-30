package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	JFrame frame = new JFrame();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
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
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		frame.add(panel);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int one = Integer.parseInt(field1.getText());
		int two = Integer.parseInt(field2.getText());
		if (arg0.getSource() == add) {
			JOptionPane.showMessageDialog(null, one + two);
		} else if (arg0.getSource() == sub) {
			JOptionPane.showMessageDialog(null, one - two);
		} else if (arg0.getSource() == mul) {
			JOptionPane.showMessageDialog(null, one * two);
		} else if (arg0.getSource() == div) {
			JOptionPane.showMessageDialog(null, one / two);
		}
	}
}
