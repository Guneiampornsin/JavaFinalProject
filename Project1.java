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
					centeredFrame(frame);
					ImageIcon image = new ImageIcon("ice-cream-icon.png"); //create an ImageIcon
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
		contentPane.setBackground(new Color(218, 217, 211));
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
				new OrderGui(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
		btnOrder.setBounds(228, 217, 230, 77);
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
		btnExit.setBounds(241, 311, 186, 77);
		contentPane.add(btnExit);
		
		JLabel btniconOrder = new JLabel("");
		btniconOrder.setIcon(new ImageIcon("D:\\java-2022-12\\ICON\\order_1.png"));
		btniconOrder.setBounds(228, 208, 85, 94);
		contentPane.add(btniconOrder);
		
		JLabel btnIconExit = new JLabel("New label");
		btnIconExit.setIcon(new ImageIcon("D:\\java-2022-12\\ICON\\exit (1).png"));
		btnIconExit.setBounds(244, 310, 68, 77);
		contentPane.add(btnIconExit);
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setFont(new Font("Arial Black", Font.BOLD, 33));
		lblOrder.setBounds(316, 234, 153, 48);
		contentPane.add(lblOrder);
		
		JLabel lblExit = new JLabel("EXIT");
		lblExit.setFont(new Font("Arial Black", Font.BOLD, 33));
		lblExit.setBounds(335, 323, 98, 48);
		contentPane.add(lblExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java-2022-12\\ICON\\LogoNoBackNew_1.png"));
		lblNewLabel.setBounds(189, 30, 291, 176);
		contentPane.add(lblNewLabel);
	}
}
