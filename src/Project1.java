import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Project1 extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project1 frame = new Project1();
					frame.setSize(700, 500);
					frame.setVisible(true);
					frame.setTitle("GOMU ICE-SCREAM");//sets title of frame
					frame.setResizable(false);//prevent frame from being resized
					centeredFrame(frame);//ล็อกเฟรมไว้ตรงกลาง
					ImageIcon image = new ImageIcon("ice-cream-icon3.png"); //create an ImageIcon
					frame.setIconImage(image.getImage());//change icon of frame
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void centeredFrame(JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
	

	/**
	 * Create the frame.
	 */
	public Project1() {
		
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOrder = new JButton("");
		btnOrder.setBackground(new Color(255, 255, 255));
		btnOrder.setForeground(new Color(0, 0, 0));
		btnOrder.setFont(new Font("Arial Black", Font.BOLD, 35));
		btnOrder.setOpaque(false);
		btnOrder.setContentAreaFilled(false);
		btnOrder.setBorderPainted(false);
		btnOrder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				OrderGui OG = new OrderGui();
				setVisible(false);
				OG.setLocation(getLocation());
				dispose();
				OG.setVisible(true);
			}
		});
		btnOrder.setBounds(109, 248, 202, 77);
		contentPane.add(btnOrder);
		
		JButton btnExit = new JButton("");
		btnExit.setOpaque(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 35));
		btnExit.setBounds(398, 248, 153, 77);
		contentPane.add(btnExit);
		
		JLabel lbl50baht = new JLabel("Everything 50 Baht");
		lbl50baht.setFont(new Font("Calibri Light", Font.BOLD, 27));
		lbl50baht.setBounds(231, 178, 283, 38);
		contentPane.add(lbl50baht);
		
		JLabel btniconOrder = new JLabel("");
		btniconOrder.setIcon(new ImageIcon(Project1.class.getResource("/image/order_1.png")));
		btniconOrder.setBounds(112, 239, 85, 94);
		contentPane.add(btniconOrder);
		
		JLabel btnIconExit = new JLabel("New label");
		btnIconExit.setIcon(new ImageIcon(Project1.class.getResource("/image/exit (1).png")));
		btnIconExit.setBounds(398, 247, 68, 77);
		contentPane.add(btnIconExit);
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setFont(new Font("Calibri", Font.BOLD, 40));
		lblOrder.setBounds(190, 269, 153, 48);
		contentPane.add(lblOrder);
		
		JLabel lblExit = new JLabel("EXIT");
		lblExit.setFont(new Font("Calibri", Font.BOLD, 40));
		lblExit.setBounds(463, 269, 98, 48);
		contentPane.add(lblExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Project1.class.getResource("/image/ice (2).png")));
		lblNewLabel.setBounds(239, 33, 205, 186);
		contentPane.add(lblNewLabel);
		
	}
}
