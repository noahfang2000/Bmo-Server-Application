package org.eclipse.wb.swt;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.Hashtable;
import java.awt.event.ActionEvent;

public class GUI {
	

	private JFrame frame;
	private JTextField pn_text;
	private JTextField env_text;
	private JTextField app_text;
	private JTextField host_text;
	private JTextField ip_text;
	private JTextField url_text;
	private JTextField cpu_text;
	private JTextField ram_text;
	private JTextField interactive;
	Dictionary<String,Server> Servers = new Hashtable<String,Server>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1293, 755);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Project Name");
		lblNewLabel.setBounds(15, 16, 171, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Environment");
		lblNewLabel_1.setBounds(15, 99, 158, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Application");
		lblNewLabel_2.setBounds(15, 177, 95, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Host");
		lblNewLabel_3.setBounds(15, 256, 69, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ip");
		lblNewLabel_4.setBounds(15, 341, 69, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Url");
		lblNewLabel_5.setBounds(15, 415, 69, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cpu Core");
		lblNewLabel_6.setBounds(15, 498, 69, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ram - GB");
		lblNewLabel_7.setBounds(15, 580, 69, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		pn_text = new JTextField();
		pn_text.setBounds(15, 52, 146, 26);
		frame.getContentPane().add(pn_text);
		pn_text.setColumns(10);
		
		env_text = new JTextField();
		env_text.setBounds(15, 135, 146, 26);
		frame.getContentPane().add(env_text);
		env_text.setColumns(10);
		
		app_text = new JTextField();
		app_text.setBounds(15, 225, 146, 26);
		frame.getContentPane().add(app_text);
		app_text.setColumns(10);
		
		host_text = new JTextField();
		host_text.setBounds(15, 299, 146, 26);
		frame.getContentPane().add(host_text);
		host_text.setColumns(10);
		
		ip_text = new JTextField();
		ip_text.setBounds(15, 383, 146, 26);
		frame.getContentPane().add(ip_text);
		ip_text.setColumns(10);
		
		url_text = new JTextField();
		url_text.setBounds(15, 463, 146, 26);
		frame.getContentPane().add(url_text);
		url_text.setColumns(10);
		
		cpu_text = new JTextField();
		cpu_text.setBounds(15, 538, 146, 26);
		frame.getContentPane().add(cpu_text);
		cpu_text.setColumns(10);
		
		ram_text = new JTextField();
		ram_text.setBounds(15, 624, 146, 26);
		frame.getContentPane().add(ram_text);
		ram_text.setColumns(10);
		
		interactive = new JTextField();
		interactive.setBounds(217, 355, 1039, 295);
		frame.getContentPane().add(interactive);
		interactive.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
						Server placeholder = new Server(pn_text.getText(),env_text.getText(),app_text.getText(), host_text.getText(), ip_text.getText(),url_text.getText(),Integer.parseInt(cpu_text.getText()), Integer.parseInt(ram_text.getText()));
						Servers.put(pn_text.getText(),placeholder);
						interactive.setText("The server has been added with the key of " + pn_text.getText());
						
				
					}
						catch (Exception e) {
							interactive.setText("Please input valid entries");					
						 }
				pn_text.removeAll();
				env_text.removeAll();
				app_text.removeAll();
				host_text.removeAll();
				ip_text.removeAll();
				url_text.removeAll();
				cpu_text.removeAll();
				ram_text.removeAll();
			
				
				}
					
				
			
		});
		btnNewButton.setBounds(293, 168, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Servers.remove(pn_text.getText());
				interactive.setText("The server with key "+pn_text.getText()+" has been removed");
				}
				catch (NullPointerException e ){
					interactive.setText("The server does not exist");
					
				}
			}
		});
		btnNewButton_1.setBounds(524, 168, 115, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { 
					Servers.get(pn_text.getText());
					if (env_text.getText() != null)  {
						Servers.get(pn_text.getText()).setEnvironment(env_text.getText());
					}
					if (app_text.getText() != null) {
						Servers.get(pn_text.getText()).setApplication(app_text.getText());
					}
					if (host_text.getText() != null) {
						Servers.get(pn_text.getText()).setHost(host_text.getText());
					}
					if (ip_text.getText()!= null ) {
						Servers.get(pn_text.getText()).setIp(ip_text.getText());
					}
					if (url_text.getText() != null ) {
						Servers.get(pn_text.getText()).setURL(url_text.getText());
					}
					if (cpu_text.getText() != null) {
						Servers.get(pn_text.getText()).setCpuCore(Integer.parseInt(cpu_text.getText()));
					}
					if (ram_text.getText() != null ) {
						Servers.get(pn_text.getText()).setRam(Integer.parseInt(ram_text.getText()));
					}
					System.out.println("The server has been edited to : "+"\n"+Servers.get(pn_text.getText()).toString());
				}
				catch (NullPointerException e) {
					interactive.setText("The server does not exist");
				}
			}
		});
		btnNewButton_2.setBounds(774, 168, 115, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					interactive.setText((Servers.get(pn_text.getText()).toString()));
					
				}
					catch (Exception e1) {
						interactive.setText("Please input a valid entry");
					
				}
			}
		});
		btnNewButton_3.setBounds(1034, 168, 115, 29);
		frame.getContentPane().add(btnNewButton_3);
	}
}
