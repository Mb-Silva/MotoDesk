package br.com.ecommercemotos.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import java.awt.Panel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		setResizable(false);
		setForeground(Color.WHITE);
		setOpacity(1.5f);
		setFont(new Font("MV Boli", Font.PLAIN, 12));
		setTitle("EcommerceMotos");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\INTEL\\Pictures\\Saved Pictures\\icone.png"));
		setBackground(SystemColor.text);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 336);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 322, 37);
		panel.setBackground(SystemColor.text);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("LOGIN");
		lblTitle.setBounds(153, 4, 53, 27);
		lblTitle.setFont(new Font("Serif", Font.BOLD, 16));
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 37, 322, 260);
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUser = new JLabel("Usuário:");
		lblUser.setBounds(32, 92, 42, 19);
		lblUser.setFont(new Font("MV Boli", Font.PLAIN, 11));
		panel_1.add(lblUser);
		
		JLabel lblPassword = new JLabel("Senha:");
		lblPassword.setBounds(42, 122, 33, 19);
		lblPassword.setFont(new Font("MV Boli", Font.PLAIN, 11));
		panel_1.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(84, 91, 195, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(85, 121, 194, 20);
		panel_1.add(passwordField);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		splitPane.setForeground(Color.BLACK);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setBackground(Color.WHITE);
		splitPane.setBounds(95, 151, 179, 58);
		panel_1.add(splitPane);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.WHITE);
		splitPane.setLeftComponent(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CADASTRAR-SE");
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.WHITE);
		splitPane.setRightComponent(btnNewButton_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(141, 10, 75, 72);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
	}
}
