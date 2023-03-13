import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

public class OrderTopping extends JFrame {

	private JPanel contentPane;
	private String Cone, Flavor;
	private String Topping;
	private JRadioButton rdbtnOreos;
	private JRadioButton rdbtnNuts;
	private JRadioButton rdbtnWhippedCream;
	private JRadioButton rdbtnCaramel;
	private JRadioButton rdbtnChocolateSauce;
	private JRadioButton rdbtnStrawberrySauce;
	private JRadioButton rdbtnJelly;
	private JRadioButton rdbtnCandy;
	private JRadioButton rdbtnBanana;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	public OrderTopping(String Cone, String Flavor) {
		this.Cone = Cone;
		this.Flavor = Flavor;

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

		contentPane.setLayout(null);
		setContentPane(contentPane);

		rdbtnOreos = new JRadioButton("Oreos");
		rdbtnOreos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnOreos.setBounds(92, 156, 109, 23);
		rdbtnOreos.setOpaque(false);
		contentPane.add(rdbtnOreos);

		rdbtnNuts = new JRadioButton("nuts");
		rdbtnNuts.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnNuts.setBounds(92, 255, 109, 23);
		rdbtnNuts.setOpaque(false);
		contentPane.add(rdbtnNuts);

		rdbtnWhippedCream = new JRadioButton("Whipped cream");
		rdbtnWhippedCream.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnWhippedCream.setBounds(92, 355, 163, 23);
		rdbtnWhippedCream.setOpaque(false);
		contentPane.add(rdbtnWhippedCream);

		rdbtnCaramel = new JRadioButton("Caramel Sauce");
		rdbtnCaramel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnCaramel.setBounds(457, 156, 169, 23);
		rdbtnCaramel.setOpaque(false);
		contentPane.add(rdbtnCaramel);

		rdbtnChocolateSauce = new JRadioButton("Chocolate Sauce");
		rdbtnChocolateSauce.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnChocolateSauce.setBounds(457, 255, 177, 23);
		rdbtnChocolateSauce.setOpaque(false);
		contentPane.add(rdbtnChocolateSauce);

		rdbtnStrawberrySauce = new JRadioButton("Strawberry Sauce");
		rdbtnStrawberrySauce.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnStrawberrySauce.setBounds(457, 355, 185, 23);
		rdbtnStrawberrySauce.setOpaque(false);
		contentPane.add(rdbtnStrawberrySauce);

		rdbtnJelly = new JRadioButton("Jelly");
		rdbtnJelly.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnJelly.setBounds(291, 156, 98, 23);
		rdbtnJelly.setOpaque(false);
		contentPane.add(rdbtnJelly);

		rdbtnCandy = new JRadioButton("Candy");
		rdbtnCandy.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnCandy.setBounds(291, 255, 98, 23);
		rdbtnCandy.setOpaque(false);
		contentPane.add(rdbtnCandy);

		rdbtnBanana = new JRadioButton("Banana");
		rdbtnBanana.setFont(new Font("Arial Black", Font.PLAIN, 16));
		rdbtnBanana.setBounds(291, 355, 98, 23);
		rdbtnBanana.setOpaque(false);
		contentPane.add(rdbtnBanana);

		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(551, 414, 109, 36);
		contentPane.add(btnNext);

		JLabel lblTopping = new JLabel("TOPPING");
		lblTopping.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblTopping.setBounds(223, 11, 246, 64);
		contentPane.add(lblTopping);
		
		final ButtonGroup group = new ButtonGroup();
		group.add(rdbtnOreos);
		group.add(rdbtnNuts);
		group.add(rdbtnWhippedCream);
		group.add(rdbtnCaramel);
		group.add(rdbtnChocolateSauce);
		group.add(rdbtnStrawberrySauce);
		group.add(rdbtnJelly);
		group.add(rdbtnCandy);
		group.add(rdbtnBanana);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selection = "";
				if (rdbtnOreos.isSelected())
					selection = "Oreos";
				else if (rdbtnNuts.isSelected())
					selection = "Nuts";
				else if (rdbtnWhippedCream.isSelected())
					selection = "WhippedCream";
				else if (rdbtnCaramel.isSelected())
					selection = "Caramel";
				else if (rdbtnChocolateSauce.isSelected())
					selection = "ChocolateSauce";
				else if (rdbtnStrawberrySauce.isSelected())
					selection = "StrawberrySauce";
				else if (rdbtnJelly.isSelected())
					selection = "Jelly";
				else if (rdbtnCandy.isSelected())
					selection = "Candy";
				else if (rdbtnBanana.isSelected())
					selection = "Banana";

				OrderMycart OM = new OrderMycart(getCone(), getFlavor(), selection);
				setVisible(false);
				OM.setLocation(getLocation());
				OM.setVisible(true);
				dispose();
			}
		});
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(21, 414, 109, 36);
		contentPane.add(btnBack);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/Oreos.png")));
		lblNewLabel.setBounds(80, 72, 121, 82);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/candy.png")));
		lblNewLabel_2.setBounds(268, 53, 130, 124);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/banana.png")));
		lblNewLabel_1.setBounds(291, 285, 109, 79);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/caramel.png")));
		lblNewLabel_3.setBounds(490, 72, 112, 92);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/nuts.png")));
		lblNewLabel_4.setBounds(89, 166, 128, 110);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/jelly.png")));
		lblNewLabel_5.setBounds(284, 163, 110, 115);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/whip.png")));
		lblNewLabel_6.setBounds(91, 281, 99, 77);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/stwsc.png")));
		lblNewLabel_7.setBounds(489, 272, 93, 93);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(OrderTopping.class.getResource("/image/chocosc.jpg")));
		lblNewLabel_8.setBounds(467, 186, 135, 82);
		contentPane.add(lblNewLabel_8);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderFlavor OF = new OrderFlavor(getCone());
				setVisible(false);
				OF.setLocation(getLocation());
				OF.setFlavor(getFlavor());
				OF.setVisible(true);
				dispose();
				setVisible(false);
			}
		});
	}

	public String getCone() {
		return Cone;
	}

	public void setCone(String cone) {
		Cone = cone;
	}

	public String getFlavor() {
		return Flavor;
	}

	public void setFlavor(String flavor) {
		Flavor = flavor;
	}

	public String getTopping() {
		return Topping;
	}

	public void setTopping(String topping) {
		Topping = topping;
		if (Topping != null) {
			if (Topping.equalsIgnoreCase("Oreos"))
				rdbtnOreos.setSelected(true);
			else if (Topping.equalsIgnoreCase("Nuts"))
				rdbtnNuts.setSelected(true);
			else if (Topping.equalsIgnoreCase("WhippedCream"))
				rdbtnWhippedCream.setSelected(true);
			else if (Topping.equalsIgnoreCase("Caramel"))
				rdbtnCaramel.setSelected(true);
			else if (Topping.equalsIgnoreCase("ChocolateSauce"))
				rdbtnChocolateSauce.setSelected(true);
			else if (Topping.equalsIgnoreCase("StrawberrySauce"))
				rdbtnStrawberrySauce.setSelected(true);
			else if (Topping.equalsIgnoreCase("Jelly"))
				rdbtnJelly.setSelected(true);
			else if (Topping.equalsIgnoreCase("Candy"))
				rdbtnCandy.setSelected(true);
			else if (Topping.equalsIgnoreCase("Banana"))
				rdbtnBanana.setSelected(true);

		}

	}
}
