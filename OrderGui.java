import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;

public class OrderGui extends JFrame {

	private JPanel contentPane;
	public OrderGui(int x , int z) {
		
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
		
		JRadioButton rdbtnClone = new JRadioButton("Clone");
		rdbtnClone.setBounds(97, 235, 109, 23);
		contentPane.add(rdbtnClone);
		
		JRadioButton rdbtnClone_1 = new JRadioButton("Bread");
		rdbtnClone_1.setBounds(252, 235, 109, 23);
		contentPane.add(rdbtnClone_1);
		
		JRadioButton rdbtnClone_1_1 = new JRadioButton("Cup");
		rdbtnClone_1_1.setBounds(420, 235, 109, 23);
		contentPane.add(rdbtnClone_1_1);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(548, 389, 109, 36);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("CONTAINER");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 45));
		lblNewLabel.setBounds(186, 23, 312, 64);
		contentPane.add(lblNewLabel);
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new OrderFlavor(getLocation().x,getLocation().y).setVisible(true);
				setVisible(false);
			}
		});
	}
}
