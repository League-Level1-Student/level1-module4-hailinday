package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	
	public static void main(String[] args) {
		
		nasty nasty = new nasty();
		nasty.run();

	}
	
	public void run() {
		trick.addActionListener(this);
		trick.setText("trick");
		treat.addActionListener(this);
		treat.setText("treat");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (trick == arg0.getSource() ) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/MPV2METPeJU/maxresdefault.jpg");
		} else if (treat == arg0.getSource()) {
			showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/7/71/Black.png");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
}