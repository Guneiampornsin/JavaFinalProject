import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class OrderBill extends JFrame {

	private JPanel contentPane;
	private String Cone, Flavor;
	private String Topping;

	public OrderBill(final String Cone, final String Flavor, final String Topping) {
		this.Cone = Cone;
		this.Flavor = Flavor;
		this.Topping = Topping;

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

		JLabel lblNewLabel = new JLabel("Bills");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(279, 11, 120, 59);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("------------------------------------------");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(157, 66, 342, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblFlavor = new JLabel("FLAVOR");
		lblFlavor.setFont(new Font("Calibri", Font.BOLD, 27));
		lblFlavor.setBounds(103, 165, 114, 59);
		contentPane.add(lblFlavor);

		JLabel lblContainer = new JLabel("CONTAINER");
		lblContainer.setFont(new Font("Calibri", Font.BOLD, 27));
		lblContainer.setBounds(103, 102, 150, 52);
		contentPane.add(lblContainer);

		JLabel lblTopping = new JLabel("TOPPING");
		lblTopping.setFont(new Font("Calibri", Font.BOLD, 27));
		lblTopping.setBounds(103, 245, 130, 52);
		contentPane.add(lblTopping);

		JLabel lblBillContainer = new JLabel(Cone);
		lblBillContainer.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblBillContainer.setBounds(417, 112, 130, 33);
		contentPane.add(lblBillContainer);

		JLabel lblBillFlavor = new JLabel(Flavor);
		lblBillFlavor.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblBillFlavor.setBounds(416, 178, 216, 32);
		contentPane.add(lblBillFlavor);

		JLabel lblbillTopping = new JLabel(Topping);
		lblbillTopping.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblbillTopping.setBounds(417, 255, 190, 33);
		contentPane.add(lblbillTopping);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("------------------------------------------");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(157, 340, 342, 14);
		contentPane.add(lblNewLabel_1_1_1_1);

		JLabel lblTotalPrice = new JLabel("TotalPrice");
		lblTotalPrice.setFont(new Font("Calibri", Font.BOLD, 40));
		lblTotalPrice.setBounds(103, 376, 237, 52);
		contentPane.add(lblTotalPrice);

		JLabel lblNewLabel_4_1 = new JLabel("50  baht .");
		lblNewLabel_4_1.setFont(new Font("Calibri", Font.BOLD, 33));
		lblNewLabel_4_1.setBounds(417, 388, 167, 33);
		contentPane.add(lblNewLabel_4_1);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Your name  : ");
				String email =JOptionPane.showInputDialog("Your email : ");
				String phoneNumber = JOptionPane.showInputDialog("Your phone number : " );
				
				PrintFile PF = new PrintFile(Cone, Flavor, Topping , name ,email ,phoneNumber );
				
				try {
					PF.writeBill();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnPrint.setBounds(563, 427, 89, 23);

		contentPane.add(btnPrint);

	}
}
