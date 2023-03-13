import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Button;
import java.awt.Panel;

public class OrderGui extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnCone;
	private JRadioButton rdbtnBread;
	private JRadioButton rdbtnCup;
	private String selection;
	public OrderGui() {

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

		rdbtnCone = new JRadioButton("Cone");
		rdbtnCone.setFont(new Font("Arial Black", Font.PLAIN, 18));
		rdbtnCone.setBounds(124, 257, 83, 23);
		rdbtnCone.isSelected();
		rdbtnCone.setOpaque(false);// พื้นหลังหาย
		contentPane.add(rdbtnCone);

		rdbtnBread = new JRadioButton("Bread");
		rdbtnBread.setFont(new Font("Arial Black", Font.PLAIN, 18));
		rdbtnBread.setBounds(291, 257, 90, 23);
		rdbtnBread.setOpaque(false);
		contentPane.add(rdbtnBread);

		rdbtnCup = new JRadioButton("Cup");
		rdbtnCup.setFont(new Font("Arial Black", Font.PLAIN, 18));
		rdbtnCup.setBounds(465, 257, 68, 23);
		rdbtnCup.setOpaque(false);
		contentPane.add(rdbtnCup);
		
		final ButtonGroup group = new ButtonGroup();
		group.add(rdbtnCone);
		group.add(rdbtnBread);
		group.add(rdbtnCup);

		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(550, 414, 109, 36);
		contentPane.add(btnNext);

		JLabel lblNewLabel = new JLabel("CONTAINER");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 45));
		lblNewLabel.setBounds(194, 23, 312, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(OrderGui.class.getResource("/image/Bread.png")));
		lblNewLabel_2.setBounds(281, 139, 114, 104);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(OrderGui.class.getResource("/image/Cup.png")));
		lblNewLabel_3.setBounds(421, 124, 143, 126);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OrderGui.class.getResource("/image/Cone.png")));
		lblNewLabel_1.setBounds(82, 116, 125, 134);
		contentPane.add(lblNewLabel_1);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				selection = "";          
				if (rdbtnCone.isSelected())             
					selection = "Cone";         
				else if (rdbtnBread.isSelected())             
					selection = "Bread";         
				else if (rdbtnCup.isSelected())             
					selection = "Cup";
				OrderFlavor oF = new OrderFlavor(selection);
				setVisible(false);
				oF.setLocation(getLocation());
				dispose();
				oF.setVisible(true);
			}
			
		});
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
		if(selection != null) {
			if (selection.equalsIgnoreCase("Cone"))             
				rdbtnCone.setSelected(true);         
			else if (selection.equalsIgnoreCase("Bread"))             
				rdbtnBread.setSelected(true);         
			else if (selection.equalsIgnoreCase("Cup"))             
				rdbtnCup.setSelected(true);}

		
		
	}
}
