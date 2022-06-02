package br.com.ecommercemotos.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/images/icone.png")));
		setTitle("EcommerceMotos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 1, 678, 330);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(9, 11, 659, 308);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 1, 144, 61);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 22, 30, 14);
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD, 14));
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel_3.setBounds(0, 0, 144, 309);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		Button btn_cadastroCliente = new Button("Cadastro Cliente");
		btn_cadastroCliente.setBounds(1, 61, 141, 29);
		panel_3.add(btn_cadastroCliente);
		
		Button btn_cadastroProduto = new Button("Cadastro Produto");
		btn_cadastroProduto.setBounds(1, 96, 141, 29);
		panel_3.add(btn_cadastroProduto);
		
		Button btn_sair = new Button("SAIR");
		btn_sair.setBounds(1, 280, 142, 29);
		panel_3.add(btn_sair);
	}
}
