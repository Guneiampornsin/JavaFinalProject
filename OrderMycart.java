import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class OrderMycart extends JFrame {

	private JPanel contentPane;

	public OrderMycart(int x , int z) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 217, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(700, 500);
		setTitle("GOMU ICE-SCREAM");//sets title of frame
		setResizable(false);//prevent frame from being resized
		ImageIcon image = new ImageIcon("ice-cream-icon.png"); //create an ImageIcon
		setIconImage(image.getImage());//change icon of frame

		setLocation(x,z);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnOrder = new JButton("ORDER");
		btnOrder.setBounds(356, 351, 109, 36);
		contentPane.add(btnOrder);
		
		JLabel lblNewLabel = new JLabel("YOUR ORDER");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(157, 44, 371, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cup x 1");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(89, 262, 94, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chocolate x 1");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(244, 262, 165, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Oreos x 1");
		lblNewLabel_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(467, 262, 165, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Container");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(64, 187, 139, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Flavor");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(270, 187, 139, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Topping");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(465, 187, 139, 33);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.setBounds(196, 351, 109, 36);
		contentPane.add(btnCancle);
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		
		btnOrder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new OrderQRcode(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
	}

}
