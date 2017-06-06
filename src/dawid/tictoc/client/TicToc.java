package dawid.tictoc.client;

import java.awt.Color;
import java.text.ParseException;

import javax.swing.JFrame;

public class TicToc extends JFrame {

	public TicToc() {
	//test
		ConnectPanel panel = new ConnectPanel();
		add(panel);
		getContentPane().setBackground(Color.orange);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		TicToc t = new TicToc();
	}

}
