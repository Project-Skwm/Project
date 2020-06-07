package TFG;
import javax.swing.table.*;
import java.sql.*;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class ventana1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int int1 = JOptionPane.showConfirmDialog(ventana1.this, "¿Desea salir?");
				if (int1 == JOptionPane.YES_OPTION) { System.exit(0); }
				if (int1 == JOptionPane.CANCEL_OPTION || int1 == JOptionPane.NO_OPTION) { System.out.println("Has cancelado la salida. La aplicación continua encendida."); }
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 849, 609);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VOLVER ATR\u00C1S");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Identificacion ident = new Identificacion();
					ident.setVisible(true);
					ventana1.this.setVisible(false);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(233, 150, 122));
		btnNewButton.setBounds(10, 11, 172, 46);
		contentPane.add(btnNewButton);
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.setForeground(new Color(224, 255, 255));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int int1 = JOptionPane.showConfirmDialog(ventana1.this, "¿Desea salir?");
				if (int1 == JOptionPane.YES_OPTION) { System.exit(0); }
				if (int1 == JOptionPane.CANCEL_OPTION || int1 == JOptionPane.NO_OPTION) { System.out.println("Has cancelado la salida. La aplicación continua encendida."); }
			}
		});
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnCerrar.setBackground(new Color(178, 34, 34));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCerrar.setBounds(651, 10, 172, 46);
		contentPane.add(btnCerrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(67, 109, 354, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblProductos.setBounds(17, 8, 88, 19);
		panel.add(lblProductos);
		
		JButton btnNewButton_2 = new JButton("LISTA PEDIDO");
		btnNewButton_2.setBackground(new Color(175, 238, 238));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaPedido listped = new ListaPedido();
				listped.setVisible(true);
				ventana1.this.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(503, 403, 240, 63);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("A\u00D1ADIR PRODUCTO");
		btnNewButton_2_1.setBackground(new Color(175, 238, 238));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto prod = new Producto();
				prod.setVisible(true);
				ventana1.this.setVisible(false);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(67, 403, 240, 63);
		contentPane.add(btnNewButton_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 142, 354, 204);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		table = new JTable(modelo);
		
		modelo.addColumn("Nombre");
		modelo.addColumn("Stock en tienda");
		modelo.addColumn("Rec  en tienda");
		
		scrollPane.setViewportView(table);
		
		String[] piezas = {"Tornillos", "Decks", "Lijas", "Ruedas", "Rodamientos", "Ejes"};
		JComboBox comboBox = new JComboBox(piezas);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(519, 116, 205, 56);
		contentPane.add(comboBox);
		
		JButton btnPiezas = new JButton("CARGAR");
		btnPiezas.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPiezas.setBackground(new Color(173, 216, 230));
		btnPiezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				modelo.setRowCount(0);
				String valor1 = null;
				
				String item = (String)comboBox.getSelectedItem();
				switch (item) {
				case "Tornillos": valor1 = "'T%'";
				break;
				case "Decks": valor1 = "'D%'";
				break;
				case "Lijas": valor1 = "'L%'";
				break;
				case "Ruedas": valor1 = "'Ru%'";
				break;
				case "Rodamientos": valor1 = "'Ro%'";
				break;
				case "Ejes": valor1 = "'E%'";
				break;
				}
				
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();
				
				Statement st;
				try {
					st = miConexion.createStatement();
					String s = "SELECT Nombre, Cant_Tienda, Cant_RecomTienda FROM piezas WHERE Nombre LIKE " + valor1;
					System.out.println(s);
					ResultSet rsPiezas = st.executeQuery(s);
					
					Object [] fila = new Object[3];
					
					while(rsPiezas.next()) {
						
						fila[0] = rsPiezas.getString("Nombre");
						fila[1] = rsPiezas.getInt("Cant_Tienda");
						fila[2] = rsPiezas.getInt("Cant_RecomTienda");
						modelo.addRow(fila);
					}
					
					rsPiezas.close();
					
				} catch (SQLException w) {
					w.printStackTrace();
				}
			}
		});
		btnPiezas.setBounds(525, 236, 192, 92);
		contentPane.add(btnPiezas);
		

	}
}
