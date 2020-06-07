package TFG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Identificacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Identificacion frame = new Identificacion();
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
	public Identificacion() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int int1 = JOptionPane.showConfirmDialog(Identificacion.this, "¿Desea salir?");
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
				Inicio ident = new Inicio();
				ident.setVisible(true);
				Identificacion.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(233, 150, 122));
		btnNewButton.setBounds(10, 11, 172, 46);
		contentPane.add(btnNewButton);
		
		JButton btnCerrar_1 = new JButton("CERRAR");
		btnCerrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int int1 = JOptionPane.showConfirmDialog(Identificacion.this, "¿Desea salir?");
				if (int1 == JOptionPane.YES_OPTION) { System.exit(0); }
				if (int1 == JOptionPane.CANCEL_OPTION || int1 == JOptionPane.NO_OPTION) { System.out.println("Has cancelado la salida. La aplicación continua encendida."); }
			}
		});
		btnCerrar_1.setForeground(new Color(224, 255, 255));
		btnCerrar_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCerrar_1.setBackground(new Color(178, 34, 34));
		btnCerrar_1.setBounds(651, 10, 172, 46);
		contentPane.add(btnCerrar_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(116, 113, 575, 196);
		contentPane.add(panel_1);
		
		JLabel lblSkwm = new JLabel("SKWM");
		lblSkwm.setFont(new Font("Gabriola", Font.PLAIN, 151));
		lblSkwm.setBackground(Color.CYAN);
		lblSkwm.setBounds(105, 48, 348, 235);
		panel_1.add(lblSkwm);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(180, 341, 162, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(30, 8, 109, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setLayout(null);
		panel_2.setBounds(180, 403, 162, 40);
		contentPane.add(panel_2);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblContrasea.setBounds(7, 7, 144, 27);
		panel_2.add(lblContrasea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(413, 341, 240, 40);
		contentPane.add(panel_3);
		
		txtUser = new JTextField();
		txtUser.setBounds(10, 11, 220, 20);
		panel_3.add(txtUser);
		txtUser.setColumns(10);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(413, 403, 240, 40);
		contentPane.add(panel_3_1);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(10, 11, 220, 20);
		panel_3_1.add(txtPass);
		
		JButton btnNewButton_1 = new JButton("IDENTIFICARSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUser.getText();
				char[] pass = txtPass.getPassword();
				
				String PassWD = new String(pass);
				
				ventana1 login = new ventana1();
				Identificacion ident = new Identificacion();
				
				if (user.equals("Kala") && PassWD.contentEquals("123")) {
					System.out.println("USUARIO LOGEADO CORRECTAMENTE");
					JOptionPane.showMessageDialog(Identificacion.this, "Bienvenido a la aplicacion, " + user);
					login.setVisible(true);
					Identificacion.this.setVisible(false);
				} else {
					System.out.println("ERROR");
					JOptionPane.showMessageDialog(Identificacion.this, "Usuario y/o contrasenya erroneos");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(267, 481, 256, 63);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 557, 43, 13);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblKala = new JLabel("Kala 123");
		lblKala.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblKala.setBounds(0, 0, 41, 14);
		panel_4.add(lblKala);
	}
}
