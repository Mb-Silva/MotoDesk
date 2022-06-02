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

public class Categorias extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
	public Categorias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Produtos.class.getResource("/images/icone.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 410);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Categorias", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pesquisar: ");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel.setBounds(419, 27, 66, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(484, 25, 190, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 52, 687, 273);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JList list = new JList();
		list.setBounds(1, 272, 683, -240);
		panel_1.add(list);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(25, 11, 36, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("DESCRIÇÃO");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1_1.setBounds(242, 11, 74, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("****************************");
		lblNewLabel_3.setBounds(26, 44, 213, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("**************************");
		lblNewLabel_2_1_1.setBounds(242, 43, 435, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("****************************");
		lblNewLabel_3_1.setBounds(25, 79, 213, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("**************************");
		lblNewLabel_2_1_1_1.setBounds(242, 78, 434, 14);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JButton btnBuscar = new JButton("...");
		btnBuscar.setBounds(676, 24, 21, 23);
		panel.add(btnBuscar);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(422, 327, 91, 23);
		panel.add(btnNewButton);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setForeground(Color.ORANGE);
		btnEditar.setBounds(520, 327, 74, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setForeground(Color.RED);
		btnExcluir.setBounds(600, 327, 74, 23);
		panel.add(btnExcluir);
	}
}
