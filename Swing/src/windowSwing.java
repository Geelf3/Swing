import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class windowSwing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowSwing window = new windowSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Hola! Com et dius?");
		lblNewLabel.setBounds(80, 37, 147, 19);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(250, 37, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Fes click");
		btnNewButton.setBounds(162, 96, 117, 25);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog d = new JDialog(frame, "hello", true);
				d.setLocationRelativeTo(frame);
				d.setVisible(true);
			}
		});
		panel.add(btnNewButton);

	}
}
