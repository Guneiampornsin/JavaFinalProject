import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;

public class OrderTopping extends JFrame {

	private JPanel contentPane;

	public OrderTopping(int x , int z) {
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
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JRadioButton rdbtnOreos = new JRadioButton("Oreos");
		rdbtnOreos.setBounds(126, 95, 109, 23);
		contentPane.add(rdbtnOreos);
		
		JRadioButton rdbtnNuts = new JRadioButton("nuts");
		rdbtnNuts.setBounds(126, 163, 109, 23);
		contentPane.add(rdbtnNuts);
		
		JRadioButton rdbtnWhippedCream = new JRadioButton("Whipped cream");
		rdbtnWhippedCream.setBounds(126, 234, 109, 23);
		contentPane.add(rdbtnWhippedCream);
		
		JRadioButton rdbtnCaramel = new JRadioButton("Caramel Sauce");
		rdbtnCaramel.setBounds(289, 95, 109, 23);
		contentPane.add(rdbtnCaramel);
		
		JRadioButton rdbtnChocolateSauce = new JRadioButton("Chocolate Sauce");
		rdbtnChocolateSauce.setBounds(289, 163, 109, 23);
		contentPane.add(rdbtnChocolateSauce);
		
		JRadioButton rdbtnStrawberrySauce = new JRadioButton("Strawberry Sauce");
		rdbtnStrawberrySauce.setBounds(289, 234, 128, 23);
		contentPane.add(rdbtnStrawberrySauce);
		
		JRadioButton rdbtnJelly = new JRadioButton("Jelly");
		rdbtnJelly.setBounds(460, 95, 98, 23);
		contentPane.add(rdbtnJelly);
		
		JRadioButton rdbtnCandy = new JRadioButton("Candy");
		rdbtnCandy.setBounds(460, 163, 98, 23);
		contentPane.add(rdbtnCandy);
		
		JRadioButton rdbtnCandy_1 = new JRadioButton("Candy");
		rdbtnCandy_1.setBounds(460, 234, 98, 23);
		contentPane.add(rdbtnCandy_1);
		
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(551, 414, 109, 36);
		contentPane.add(btnNext);
		
		JLabel lblTopping = new JLabel("TOPPING");
		lblTopping.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblTopping.setBounds(223, 11, 246, 64);
		contentPane.add(lblTopping);
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new OrderMycart(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(21, 414, 109, 36);
		contentPane.add(btnBack);
		
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new OrderFlavor(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
	}

}
