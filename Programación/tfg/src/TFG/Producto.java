package TFG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Producto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreP;
	private JTextField txtStockP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto frame = new Producto();
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
	public Producto() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
		int int1 = JOptionPane.showConfirmDialog(Producto.this, "¿Desea salir?");
		if (int1 == JOptionPane.YES_OPTION) { System.exit(0); }
		if (int1 == JOptionPane.CANCEL_OPTION || int1 == JOptionPane.NO_OPTION) { System.out.println("Has cancelado la salida. La aplicación continua encendida."); }
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 441, 308);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String[] piezas = {"Tornillos", "Decks", "Lijas", "Ruedas", "Rodamientos", "Ejes"};
		JComboBox comboBox = new JComboBox(piezas);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(188, 11, 165, 48);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Tipo de producto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(26, 19, 137, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombre.setBounds(26, 95, 82, 21);
		contentPane.add(lblNombre);
		
		txtNombreP = new JTextField();
		txtNombreP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombreP.setBounds(118, 91, 180, 31);
		contentPane.add(txtNombreP);
		txtNombreP.setColumns(10);
		
		txtStockP = new JTextField();
		txtStockP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStockP.setColumns(10);
		txtStockP.setBounds(118, 147, 103, 31);
		contentPane.add(txtStockP);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblStock.setBounds(26, 151, 82, 21);
		contentPane.add(lblStock);
		
		JButton btnNewButton = new JButton("VOLVER ATR\u00C1S");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana1 v1 = new ventana1();
					v1.setVisible(true);
					Producto.this.setVisible(false);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(233, 150, 122));
		btnNewButton.setBounds(10, 212, 184, 46);
		contentPane.add(btnNewButton);
		
		JButton btnAadirProducto = new JButton("A\u00D1ADIR PRODUCTO");
		btnAadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAadirProducto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAadirProducto.setBackground(new Color(144, 238, 144));
		btnAadirProducto.setBounds(221, 212, 194, 46);
		contentPane.add(btnAadirProducto);
		
		
	}
}
