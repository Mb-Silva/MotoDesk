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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class CadastrarProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;

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
	public CadastrarProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clientes.class.getResource("/images/icone.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 271);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastrar Produto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setBounds(522, 165, 91, 46);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(23, 55, 169, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(23, 36, 76, 14);
		panel.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(219, 55, 385, 20);
		panel.add(textField_3);
		
		JLabel lblEndereo = new JLabel("Descrição");
		lblEndereo.setBounds(220, 39, 46, 14);
		panel.add(lblEndereo);
		
		JLabel lblConfirmarSenha = new JLabel("Preço");
		lblConfirmarSenha.setBounds(26, 93, 84, 14);
		panel.add(lblConfirmarSenha);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(127, 94, 84, 14);
		panel.add(lblQuantidade);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(232, 93, 84, 14);
		panel.add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(230, 110, 161, 22);
		panel.add(comboBox);
		
		JLabel lblAtivo = new JLabel("Ativo");
		lblAtivo.setBounds(421, 90, 84, 14);
		panel.add(lblAtivo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setBounds(423, 108, 22, 23);
		panel.add(chckbxNewCheckBox);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(23, 113, 76, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 113, 76, 20);
		panel.add(textField_2);
	}
}
