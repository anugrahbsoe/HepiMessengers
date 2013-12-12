package HepiMessengers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JTextField portTextField;
	private JTextField serverTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Hepii Messengers!");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Server");
		label_2.setBounds(-63, 118, 35, 17);
		contentPane.add(label_2);
		
		usernameTextField = new JTextField();
		usernameTextField.setText("");
		usernameTextField.setBounds(89, 221, 141, 21);
		contentPane.add(usernameTextField);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel4.setText("Username :");
		jLabel4.setBounds(12, 223, 81, 17);
		contentPane.add(jLabel4);
		
		JButton masukButton = new JButton();
		masukButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		masukButton.setText("Masuk");
		masukButton.setBounds(89, 319, 101, 23);
		contentPane.add(masukButton);
		
		portTextField = new JTextField();
		portTextField.setEditable(false);
		portTextField.setText("9999");
		portTextField.setBounds(89, 254, 46, 21);
		contentPane.add(portTextField);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setText("Port :");
		jLabel3.setBounds(12, 256, 41, 17);
		contentPane.add(jLabel3);
		
		serverTextField = new JTextField();
		serverTextField.setText("127.0.0.1");
		serverTextField.setBounds(89, 287, 101, 21);
		contentPane.add(serverTextField);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel2.setText("Server :");
		jLabel2.setBounds(12, 287, 81, 17);
		contentPane.add(jLabel2);
	}
}
