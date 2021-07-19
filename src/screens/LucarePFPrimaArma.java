package screens;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import utils.Service;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.BorderLayout;

public class LucarePFPrimaArma extends JPanel {
	

	public LucarePFPrimaArma() {

		setLayout(null);
		setBounds(0, 0, 1200, 800);
		
		GridLayout gridLayout = new GridLayout(2,1);
		JPanel bigPanel = new JPanel();
		bigPanel.setBounds(0, 10, 1200, 800);
		
		DatePersoanaPanel datePersoanaPanel = new DatePersoanaPanel();
		datePersoanaPanel.setBounds(0, 11, 1200, 485);
		datePersoanaPanel.setLayout(null);
		
		
		DateCererePF dateCererePF = new DateCererePF();
		dateCererePF.setBounds(0, 495, 1200, 305);
		dateCererePF.setLayout(null);
		bigPanel.setLayout(null);
		
		
		bigPanel.add(datePersoanaPanel);
		bigPanel.add(dateCererePF);
		
		add(bigPanel);
		

	}
}
