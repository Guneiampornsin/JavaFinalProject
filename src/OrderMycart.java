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
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class OrderMycart extends JFrame {
	
	
	private JPanel contentPane;
	private String Cone, Flavor;
	private String Topping;
	public OrderMycart(final String Cone, final String Flavor ,final String Topping ) {
		this.Cone = Cone;
		this.Flavor = Flavor;
		this.Topping = Topping;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(700, 500);
		setTitle("GOMU ICE-SCREAM");//sets title of frame
		setResizable(false);//prevent frame from being resized
		ImageIcon image = new ImageIcon("ice-cream-icon.png"); //create an ImageIcon
		setIconImage(image.getImage());//change icon of frame

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnOrder = new JButton("ORDER");
		btnOrder.setBounds(356, 351, 109, 36);
		contentPane.add(btnOrder);
		
		JLabel lblNewLabel = new JLabel("YOUR ORDER");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(179, 11, 372, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Container");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 38));
		lblNewLabel_2.setBounds(155, 123, 154, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Flavor");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 38));
		lblNewLabel_2_1.setBounds(155, 187, 114, 51);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Topping");
		lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.BOLD, 38));
		lblNewLabel_2_1_1.setBounds(155, 262, 128, 38);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(202, 351, 109, 36);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel(Cone);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(367, 128, 225, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel(Flavor);
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(367, 192, 245, 45);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(Topping);
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(367, 257, 245, 53);
		contentPane.add(lblNewLabel_4);
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		
		btnOrder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				OrderBill OB = new OrderBill(Cone, Flavor, Topping);
				OB.setLocation(getLocation());
				OB.setVisible(true);
				dispose();//ล้างเมมเมอรี่
				
			}
		});
	}
}
