package Urna;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1266655620934468481L;
	private JPanel contentPane;
	private JTextField txt_num;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_0;
	private JButton btn_confirma;
	private JButton btn_corrige;
	private JButton btn_nulo;
	private JPanel panel;
	JLabel lbl_num = new JLabel("Numero");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void buttons(){
		
		btn_1 = new JButton("1");
		btn_2 = new JButton("2");
		btn_3 = new JButton("3");
		btn_4 = new JButton("4");
		btn_5 = new JButton("5");
		btn_6 = new JButton("6");
		btn_7 = new JButton("7");
		btn_8 = new JButton("8");
		btn_9 = new JButton("9");
		btn_0 = new JButton("0");
		btn_confirma = new JButton("Confirma");
		btn_corrige = new JButton("Corrige");
		btn_nulo = new JButton("Nulo");
		
		txt_num = new JTextField();
		
		
	}
	
	private void panel(){
		panel = new JPanel();
		contentPane = new JPanel();
	}
	
	private void setButtons(){
		
		btn_1.setBounds(310, 30, 48, 45);		
		btn_2.setBounds(368, 30, 48, 45);		
		btn_3.setBounds(426, 30, 48, 45);		
		btn_4.setBounds(310, 86, 48, 45);		
		btn_5.setBounds(368, 86, 48, 45);		
		btn_6.setBounds(426, 86, 48, 45);		
		btn_7.setBounds(310, 142, 48, 45);		
		btn_8.setBounds(368, 142, 48, 45);		
		btn_9.setBounds(426, 142, 48, 45);		
		btn_0.setBounds(368, 198, 48, 45);		
		btn_confirma.setBounds(33, 198, 87, 45);		
		btn_corrige.setBounds(127, 198, 87, 45);		
		btn_nulo.setBounds(224, 198, 76, 45);
	}
	
	private void addContent(){
		
		contentPane.add(panel);
		contentPane.add(btn_1);		
		contentPane.add(btn_2);		
		contentPane.add(btn_3);		
		contentPane.add(btn_4);		
		contentPane.add(btn_5);		
		contentPane.add(btn_6);		
		contentPane.add(btn_7);		
		contentPane.add(btn_8);		
		contentPane.add(btn_9);		
		contentPane.add(btn_0);		
		contentPane.add(btn_confirma);		
		contentPane.add(btn_corrige);		
		contentPane.add(btn_nulo);	
		panel.add(lbl_num);
		panel.add(txt_num);
		
	}
	
	private void setContent(){
		
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(33, 30, 267, 159);
		panel.setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		
		lbl_num.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_num.setBounds(10, 70, 77, 25);
		
		txt_num.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_num.setEditable(false);
		txt_num.setBounds(121, 72, 136, 20);
		txt_num.setColumns(10);
		
	}
	
	private void addActions(){
		
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "1");
			}
		});
		
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "2");
			}
		});
		
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "3");
			}
		});
		
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "4");
			}
		});
		
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "5");
			}
		});
		
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "6");
			}
		});
		
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "7");
			}
		});
		
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "8");
			}
		});
		
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "9");
			}
		});
		
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txt_num.getText();
				txt_num.setText(text + "0");
			}
		});
		
		btn_corrige.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt_num.setText("");
			}
		});
		
	}

	public Tela() {
		
		panel();
		buttons();
		setButtons();
		addContent();
		setContent();
		addActions();
	}
}
