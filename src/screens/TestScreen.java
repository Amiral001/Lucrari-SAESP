package screens;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TestScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public TestScreen() {

		setLayout(null);
		setBounds(0, 0, 1200, 800);
		

		JLabel lblNewLabel = new JLabel("TEST SCREEN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(575, 384, 79, 14);
		add(lblNewLabel);


	}

}
