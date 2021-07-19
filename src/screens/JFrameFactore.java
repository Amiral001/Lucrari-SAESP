package screens;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameFactore extends JPanel {

	private static JFrame frame = null;

	public static JFrame getFrame() {
		if (frame == null) {
			return new JFrame();
		} else {
			return frame;
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameFactore window = new JFrameFactore();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JFrameFactore() {
		initialize();
	}

	private void initialize() {
		frame = getFrame();
		frame.setSize(1200, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(new MainScreen());

	}
}
