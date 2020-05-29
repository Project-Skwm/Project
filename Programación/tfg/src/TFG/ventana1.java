package TFG;
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

public class ventana1 extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 931, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VOLVER ATR\u00C1S");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(10, 11, 172, 46);
		contentPane.add(btnNewButton);
		
		JButton btnCerrar = new JButton("CERRAR");
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
		btnCerrar.setBackground(Color.GRAY);
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCerrar.setBounds(733, 11, 172, 46);
		contentPane.add(btnCerrar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setForeground(Color.BLACK);
		scrollBar.setBackground(Color.BLACK);
		scrollBar.setBounds(403, 80, 17, 358);
		contentPane.add(scrollBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(50, 80, 354, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblProductos.setBounds(17, 8, 88, 19);
		panel.add(lblProductos);
		
		JButton btnNewButton_1 = new JButton("DECKS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(458, 127, 128, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("RUEDAS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(585, 127, 128, 40);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("EJES");
		btnNewButton_1_2.setBounds(712, 127, 128, 40);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("TORNILLOS");
		btnNewButton_1_3.setBounds(458, 166, 128, 40);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("RODAMIENTOS");
		btnNewButton_1_4.setBounds(585, 166, 128, 40);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("LIJAS");
		btnNewButton_1_5.setBounds(712, 166, 128, 40);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_2 = new JButton("LISTA PEDIDO");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(570, 455, 240, 63);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("A\u00D1ADIR PRODUCTO");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(570, 339, 240, 63);
		contentPane.add(btnNewButton_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(50, 112, 354, 326);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 163, 34);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 143, 14);
		panel_2.add(lblNombre);
	}
}
