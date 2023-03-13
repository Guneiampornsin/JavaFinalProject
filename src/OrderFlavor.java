import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class OrderFlavor extends JFrame {

	private JPanel contentPane;
	private String Cone;
	private String Flavor;

	private JRadioButton rdbtnChocolate;
	private JRadioButton rdbtnVanilla;
	private JRadioButton rdbtnStrawberry;
	private JRadioButton rdbtnMatcha;
	private JRadioButton rdbtnCoffee;
	private JRadioButton rdbtnCookieCream;
	private JRadioButton rdbtnDarkChoco;
	private JRadioButton rdbtnLemon;
	private JRadioButton rdbtnMintChoco;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

	public OrderFlavor(String Cone) {

		this.Cone = Cone;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(700, 500);
		setTitle("GOMU ICE-SCREAM");// sets title of frame
		setResizable(false);// prevent frame from being resized
		ImageIcon image = new ImageIcon("ice-cream-icon.png"); // create an ImageIcon
		setIconImage(image.getImage());// change icon of frame

		setContentPane(contentPane);
		contentPane.setLayout(null);

		rdbtnChocolate = new JRadioButton("Chocolate");
		rdbtnChocolate.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnChocolate.setBounds(92, 156, 126, 23);
		rdbtnChocolate.setOpaque(false);
		contentPane.add(rdbtnChocolate);

		rdbtnVanilla = new JRadioButton("Vanilla");
		rdbtnVanilla.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnVanilla.setBounds(92, 255, 109, 23);
		rdbtnVanilla.setOpaque(false);
		contentPane.add(rdbtnVanilla);

		rdbtnStrawberry = new JRadioButton("Strawberry");
		rdbtnStrawberry.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnStrawberry.setBounds(92, 358, 126, 23);
		rdbtnStrawberry.setOpaque(false);
		contentPane.add(rdbtnStrawberry);

		rdbtnMatcha = new JRadioButton("Matcha");
		rdbtnMatcha.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnMatcha.setBounds(286, 156, 109, 23);
		rdbtnMatcha.setOpaque(false);
		contentPane.add(rdbtnMatcha);

		rdbtnCoffee = new JRadioButton("Coffee");
		rdbtnCoffee.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnCoffee.setBounds(286, 255, 109, 23);
		rdbtnCoffee.setOpaque(false);
		contentPane.add(rdbtnCoffee);

		rdbtnCookieCream = new JRadioButton("Cookie & Cream");
		rdbtnCookieCream.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnCookieCream.setBounds(286, 358, 167, 23);
		rdbtnCookieCream.setOpaque(false);
		contentPane.add(rdbtnCookieCream);

		rdbtnDarkChoco = new JRadioButton("Darkchocolate");
		rdbtnDarkChoco.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnDarkChoco.setBounds(457, 156, 191, 23);
		rdbtnDarkChoco.setOpaque(false);
		contentPane.add(rdbtnDarkChoco);

		rdbtnLemon = new JRadioButton("Lemon");
		rdbtnLemon.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnLemon.setBounds(457, 255, 109, 23);
		rdbtnLemon.setOpaque(false);
		contentPane.add(rdbtnLemon);

		rdbtnMintChoco = new JRadioButton("Mint Choco");
		rdbtnMintChoco.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnMintChoco.setBounds(457, 358, 126, 23);
		rdbtnMintChoco.setOpaque(false);
		contentPane.add(rdbtnMintChoco);

		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(551, 414, 109, 36);
		contentPane.add(btnNext);

		JLabel lblNewLabel = new JLabel("FLAVOR");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(235, 11, 219, 64);
		contentPane.add(lblNewLabel);

		final ButtonGroup group = new ButtonGroup();
		group.add(rdbtnChocolate);
		group.add(rdbtnVanilla);
		group.add(rdbtnStrawberry);
		group.add(rdbtnMatcha);
		group.add(rdbtnCoffee);
		group.add(rdbtnCookieCream);
		group.add(rdbtnDarkChoco);
		group.add(rdbtnLemon);
		group.add(rdbtnMintChoco);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selection = "";
				if (rdbtnChocolate.isSelected())
					selection = "Chocolate";
				else if (rdbtnVanilla.isSelected())
					selection = "Vanilla";
				else if (rdbtnStrawberry.isSelected())
					selection = "Strawberry";
				else if (rdbtnMatcha.isSelected())
					selection = "Matcha";
				else if (rdbtnCoffee.isSelected())
					selection = "Coffee";
				else if (rdbtnCookieCream.isSelected())
					selection = "Cookie&Cream";
				else if (rdbtnDarkChoco.isSelected())
					selection = "Dark Chocolate";
				else if (rdbtnLemon.isSelected())
					selection = "Lemon";
				else if (rdbtnMintChoco.isSelected())
					selection = "MintChoco";

				OrderTopping OT = new OrderTopping(getCone(), selection);
				setVisible(false);
				OT.setLocation(getLocation());
				OT.setVisible(true);
				dispose();
			}
		});

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(21, 414, 109, 36);
		contentPane.add(btnBack);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Choco (1).png")));
		lblNewLabel_1.setBounds(103, 75, 109, 82);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Matcha.png")));
		lblNewLabel_2.setBounds(292, 75, 90, 82);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Straw.png")));
		lblNewLabel_3.setBounds(101, 281, 100, 83);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Coffee.png")));
		lblNewLabel_4.setBounds(288, 181, 90, 82);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/DarkChoc.png")));
		lblNewLabel_5.setBounds(465, 83, 84, 73);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Vanila.png")));
		lblNewLabel_6.setBounds(102, 187, 93, 67);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Lemon.png")));
		lblNewLabel_7.setBounds(465, 191, 89, 67);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/Mint (1).png")));
		lblNewLabel_8.setBounds(466, 293, 92, 68);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(OrderFlavor.class.getResource("/image/CookieCream.png")));
		lblNewLabel_9.setBounds(287, 291, 93, 71);
		contentPane.add(lblNewLabel_9);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderGui OG = new OrderGui();
				setVisible(false);
				OG.setLocation(getLocation());
				OG.setSelection(getCone());
				OG.setVisible(true);
				dispose();
			}
		});
	}

	public String getCone() {
		return Cone;
	}

	public String getFlavor() {
		return Flavor;

	}

	public void setFlavor(String flavor) {
		Flavor = flavor;
		if (Flavor != null) {
			if (Flavor.equalsIgnoreCase("Chocolate"))
				rdbtnChocolate.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Vamilla"))
				rdbtnVanilla.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Strawberry"))
				rdbtnStrawberry.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Matcha"))
				rdbtnMatcha.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Coffee"))
				rdbtnCoffee.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Cookie&Cream"))
				rdbtnCookieCream.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Dark Chocolate"))
				rdbtnDarkChoco.setSelected(true);
			else if (Flavor.equalsIgnoreCase("Lemon"))
				rdbtnLemon.setSelected(true);
			else if (Flavor.equalsIgnoreCase("MintChoco"))
				rdbtnMintChoco.setSelected(true);
		}
	}
}
