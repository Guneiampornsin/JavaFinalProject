import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class OrderFlavor extends JFrame {

	private JPanel contentPane;
	public OrderFlavor(int x , int z) {
		
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
		
		JRadioButton rdbtnChocolate = new JRadioButton("Chocolate");
		rdbtnChocolate.setBounds(92, 159, 109, 23);
		contentPane.add(rdbtnChocolate);
		
		JRadioButton rdbtnVanilla = new JRadioButton("Vanilla");
		rdbtnVanilla.setBounds(92, 212, 109, 23);
		contentPane.add(rdbtnVanilla);
		
		JRadioButton rdbtnStrawberry = new JRadioButton("Strawberry");
		rdbtnStrawberry.setBounds(92, 258, 109, 23);
		contentPane.add(rdbtnStrawberry);
		
		JRadioButton rdbtnMatcha = new JRadioButton("Matcha");
		rdbtnMatcha.setBounds(267, 159, 109, 23);
		contentPane.add(rdbtnMatcha);
		
		JRadioButton rdbtnCoffee = new JRadioButton("Coffee");
		rdbtnCoffee.setBounds(267, 212, 109, 23);
		contentPane.add(rdbtnCoffee);
		
		JRadioButton rdbtnCokieCream = new JRadioButton("Cokie & Cream");
		rdbtnCokieCream.setBounds(267, 258, 109, 23);
		contentPane.add(rdbtnCokieCream);
		
		JRadioButton rdbtnCokieCream_1 = new JRadioButton("Cokie & Cream");
		rdbtnCokieCream_1.setBounds(417, 159, 109, 23);
		contentPane.add(rdbtnCokieCream_1);
		
		JRadioButton rdbtnLemon = new JRadioButton("Lemon");
		rdbtnLemon.setBounds(417, 212, 109, 23);
		contentPane.add(rdbtnLemon);
		
		JRadioButton rdbtnMintChoco = new JRadioButton("Mint Choco");
		rdbtnMintChoco.setBounds(417, 258, 109, 23);
		contentPane.add(rdbtnMintChoco);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(551, 414, 109, 36);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("FLAVOR");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(236, 22, 219, 64);
		contentPane.add(lblNewLabel);
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new OrderTopping(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(21, 414, 109, 36);
		contentPane.add(btnBack);
		
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new OrderGui(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
	}
}
	

	
