package TFG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int int1 = JOptionPane.showConfirmDialog(Inicio.this, "¿Desea salir?");
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 544, 150, 26);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Proyecto Integrado Grupo1");
		lblNewLabel.setBounds(4, 6, 255, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBackground(Color.CYAN);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(115, 62, 575, 196);
		contentPane.add(panel_1);
		
		JLabel lblBienvenidosASkwm = new JLabel("Bienvenidos a SKWM");
		lblBienvenidosASkwm.setFont(new Font("Gabriola", Font.BOLD, 72));
		lblBienvenidosASkwm.setBackground(Color.CYAN);
		lblBienvenidosASkwm.setBounds(16, 56, 548, 153);
		panel_1.add(lblBienvenidosASkwm);
		
		JButton btnNewButton = new JButton("IDENTIFICARSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Identificacion ident = new Identificacion();
				ident.setVisible(true);
				Inicio.this.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(115, 270, 160, 49);
		contentPane.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(629, 485, 204, 85);
		contentPane.add(panel_2);
		
		JLabel lblSergiPastorLlopis = new JLabel("Sergi Pastor Llopis");
		lblSergiPastorLlopis.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSergiPastorLlopis.setBackground(Color.CYAN);
		lblSergiPastorLlopis.setBounds(6, 5, 170, 22);
		panel_2.add(lblSergiPastorLlopis);
		
		JLabel lblManelSebastin = new JLabel("Manel Sebasti\u00E1n \u00C1lvarez");
		lblManelSebastin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblManelSebastin.setBackground(Color.CYAN);
		lblManelSebastin.setBounds(6, 32, 194, 22);
		panel_2.add(lblManelSebastin);
		
		JLabel lblJavierAlamarEsparza = new JLabel("Javier Alamar Esparza");
		lblJavierAlamarEsparza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJavierAlamarEsparza.setBackground(Color.CYAN);
		lblJavierAlamarEsparza.setBounds(6, 58, 170, 22);
		panel_2.add(lblJavierAlamarEsparza);
		
		JButton btnCerrar_1 = new JButton("CERRAR");
		btnCerrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int int1 = JOptionPane.showConfirmDialog(Inicio.this, "¿Desea salir?");
				if (int1 == JOptionPane.YES_OPTION) { System.exit(0); }
				if (int1 == JOptionPane.CANCEL_OPTION || int1 == JOptionPane.NO_OPTION) { System.out.println("Has cancelado la salida. La aplicación continua encendida."); }
			}
		});
		btnCerrar_1.setForeground(new Color(224, 255, 255));
		btnCerrar_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnCerrar_1.setBackground(new Color(178, 34, 34));
		btnCerrar_1.setBounds(538, 270, 151, 48);
		contentPane.add(btnCerrar_1);
	}
}
