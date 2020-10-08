package visao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import modelo.BST;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private BST arv;

	private Color verde = new Color(77, 182, 172);

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
		arv = new BST();

		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 460, 338);
		contentPane.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);

		JLabel labelClose = new JLabel("");
		labelClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		labelClose.setIcon(new ImageIcon(Menu.class.getResource("/img/quit.png")));
		labelClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelClose.setForeground(Color.WHITE);
		labelClose.setHorizontalTextPosition(SwingConstants.CENTER);
		labelClose.setHorizontalAlignment(SwingConstants.CENTER);
		labelClose.setBounds(416, 11, 24, 24);
		panel.add(labelClose);

		// remove

		JPanel panelRemove = new JPanel();
		panelRemove.setBounds(100, 39, 333, 262);
		panel.add(panelRemove);
		panelRemove.setLayout(null);
		panelRemove.setVisible(false);
		
		JTextField tfDell = new JTextField();
		tfDell.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfDell.setBounds(10, 105, 313, 40);
		panelRemove.add(tfDell);
		tfDell.setColumns(10);

		JLabel lblDell = new JLabel("Remover");
		lblDell.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arv.remover(tfDell.getText());
				JOptionPane.showMessageDialog(panel, "Aluno removido!");
				tfDell.setText("");
			}
		});
		lblDell.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDell.setForeground(Color.WHITE);
		lblDell.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDell.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDell.setHorizontalAlignment(SwingConstants.CENTER);
		lblDell.setBounds(10, 156, 313, 40);
		lblDell.setOpaque(true);
		lblDell.setBackground(verde);
		panelRemove.add(lblDell);

		JLabel lblDellTitle = new JLabel("Remover Aluno");
		lblDellTitle.setForeground(verde);
		lblDellTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDellTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDellTitle.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		lblDellTitle.setBounds(10, 38, 313, 31);
		panelRemove.add(lblDellTitle);

		// busca

		JPanel panelBusca = new JPanel();
		panelBusca.setBounds(100, 39, 333, 262);
		panel.add(panelBusca);
		panelBusca.setLayout(null);
		panelBusca.setVisible(false);

		JTextArea textAreaBusca = new JTextArea();
		textAreaBusca.setEditable(false);
		textAreaBusca.setBounds(10, 131, 313, 120);
		panelBusca.add(textAreaBusca);
		
		JTextField tfBusca = new JTextField();
		tfBusca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfBusca.setBounds(10, 80, 266, 40);
		panelBusca.add(tfBusca);
		tfBusca.setColumns(10);

		JLabel lblBusca = new JLabel("");
		lblBusca.setIcon(new ImageIcon(Menu.class.getResource("/img/busca32.png")));
		lblBusca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaBusca.setText(arv.busca(tfBusca.getText()).toString());
			}
		});
		lblBusca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBusca.setForeground(Color.WHITE);
		lblBusca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBusca.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(280, 80, 43, 40);
		lblBusca.setOpaque(true);
		lblBusca.setBackground(verde);
		panelBusca.add(lblBusca);

		JLabel lblBuscaTitle = new JLabel("Buscar Aluno");
		lblBuscaTitle.setForeground(verde);
		lblBuscaTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuscaTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscaTitle.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		lblBuscaTitle.setBounds(10, 38, 313, 31);
		panelBusca.add(lblBuscaTitle);

		// lista
		JPanel panelLista = new JPanel();
		panelLista.setBounds(100, 39, 333, 262);
		panel.add(panelLista);
		panelLista.setLayout(null);
		panelLista.setVisible(false);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 131, 313, 120);
		panelLista.add(textArea);

		JLabel lblLista = new JLabel("Listar");
		lblLista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String aux = arv.inOrdem();
				String ord = aux.replace(" ", "\n"); 
				textArea.setText(ord);
			}
		});
		lblLista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLista.setForeground(Color.WHITE);
		lblLista.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLista.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblLista.setBounds(10, 80, 313, 40);
		lblLista.setOpaque(true);
		lblLista.setBackground(verde);
		panelLista.add(lblLista);

		JLabel lblListaTitle = new JLabel("Listar Alunos");
		lblListaTitle.setForeground(verde);
		lblListaTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblListaTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaTitle.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		lblListaTitle.setBounds(10, 38, 313, 31);
		panelLista.add(lblListaTitle);

		// add
		JPanel panelAdd = new JPanel();
		panelAdd.setBounds(100, 39, 333, 262);
		panel.add(panelAdd);
		panelAdd.setLayout(null);

		JTextField tfAdd = new JTextField();
		tfAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAdd.setBounds(10, 105, 313, 40);
		panelAdd.add(tfAdd);
		tfAdd.setColumns(10);

		JLabel lblAdd = new JLabel("Adicionar");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arv.inserir(tfAdd.getText());
				JOptionPane.showMessageDialog(panel, "Aluno cadastrado!");
				tfAdd.setText("");
			}
		});
		lblAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdd.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setBounds(10, 156, 313, 40);
		lblAdd.setOpaque(true);
		lblAdd.setBackground(verde);
		panelAdd.add(lblAdd);

		JLabel lblNewLabel_2 = new JLabel("Adicionar Aluno");
		lblNewLabel_2.setForeground(verde);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 38, 313, 31);
		panelAdd.add(lblNewLabel_2);

		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 90, 338);
		panel.add(panelMenu);
		panelMenu.setLayout(null);

		JLabel lblAddButton = new JLabel("");
		lblAddButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelAdd.setVisible(true);
				panelLista.setVisible(false);
				panelBusca.setVisible(false);
				panelRemove.setVisible(false);
			}
		});
		lblAddButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAddButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddButton.setBounds(10, 10, 70, 70);
		panelMenu.add(lblAddButton);
		lblAddButton.setIcon(new ImageIcon(Menu.class.getResource("/img/add.png")));

		JLabel lblBuscaButton = new JLabel("");
		lblBuscaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelAdd.setVisible(false);
				panelLista.setVisible(false);
				panelBusca.setVisible(true);
				panelRemove.setVisible(false);
			}
		});
		lblBuscaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBuscaButton.setIcon(new ImageIcon(Menu.class.getResource("/img/busca.png")));
		lblBuscaButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscaButton.setBounds(10, 91, 70, 70);
		panelMenu.add(lblBuscaButton);

		JLabel lblListaButton = new JLabel("");
		lblListaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelAdd.setVisible(false);
				panelLista.setVisible(true);
				panelBusca.setVisible(false);
				panelRemove.setVisible(false);
			}
		});
		lblListaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblListaButton.setIcon(new ImageIcon(Menu.class.getResource("/img/lisrta.png")));
		lblListaButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaButton.setBounds(10, 172, 70, 70);
		panelMenu.add(lblListaButton);

		JLabel lblDeletaButton = new JLabel("");
		lblDeletaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelAdd.setVisible(false);
				panelLista.setVisible(false);
				panelBusca.setVisible(false);
				panelRemove.setVisible(true);
			}
		});
		lblDeletaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDeletaButton.setIcon(new ImageIcon(Menu.class.getResource("/img/deleta.png")));
		lblDeletaButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeletaButton.setBounds(10, 253, 70, 70);
		panelMenu.add(lblDeletaButton);

	}
}
