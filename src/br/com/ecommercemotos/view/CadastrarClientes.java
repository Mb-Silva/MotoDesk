package br.com.ecommercemotos.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class CadastrarClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produtos frame = new Produtos();
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
	public CadastrarClientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clientes.class.getResource("/images/icone.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 344);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastrar Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setBounds(568, 239, 91, 46);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(23, 55, 169, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setBounds(23, 36, 76, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 55, 124, 20);
		panel.add(textField_1);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(217, 36, 46, 14);
		panel.add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(368, 55, 80, 20);
		panel.add(textField_2);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(368, 36, 46, 14);
		panel.add(lblCep);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(470, 55, 181, 20);
		panel.add(textField_3);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(470, 36, 46, 14);
		panel.add(lblEndereo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(23, 105, 46, 20);
		panel.add(textField_4);
		
		JLabel lblNumero = new JLabel("Número");
		lblNumero.setBounds(23, 86, 46, 14);
		panel.add(lblNumero);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(89, 106, 154, 20);
		panel.add(textField_5);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(89, 87, 65, 14);
		panel.add(lblComplemento);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(261, 105, 124, 20);
		panel.add(textField_6);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(261, 86, 46, 14);
		panel.add(lblLogin);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(406, 105, 246, 20);
		panel.add(textField_7);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(406, 86, 46, 14);
		panel.add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(23, 159, 155, 20);
		panel.add(textField_8);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(23, 140, 46, 14);
		panel.add(lblTelefone);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(202, 139, 46, 14);
		panel.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setBounds(393, 139, 84, 14);
		panel.add(lblConfirmarSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 158, 166, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(393, 159, 167, 20);
		panel.add(passwordField_1);
	}
}
