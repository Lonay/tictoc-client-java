package dawid.tictoc.client;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ConnectPanel extends JPanel {
	JTextField ip;
	JTextField nick;

	public ConnectPanel() {

		
		
		ip = new JTextField();
		nick = new JTextField();
		ip.setPreferredSize(new Dimension(100, 25));
		nick.setPreferredSize(new Dimension(100, 25));
		JLabel ipLabel = new JLabel("IP:");
		JLabel nickLabel = new JLabel("Nick:");
		JButton startButton = new JButton("Start");

		GridLayout gridLayout = new GridLayout(2, 2);

		JPanel panel = new JPanel(gridLayout);
		panel.add(nickLabel);
		panel.add(nick);
		panel.add(ipLabel);
		panel.add(ip);

		add(panel);
		add(startButton);
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ip.getText());
				
			}
		});

	}

}
