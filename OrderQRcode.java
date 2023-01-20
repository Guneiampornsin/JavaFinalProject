import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderQRcode extends JFrame {

	private JPanel contentPane;

	public OrderQRcode(int x, int z) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 217, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(700, 500);
		setTitle("GOMU ICE-SCREAM");// sets title of frame
		setResizable(false);// prevent frame from being resized
		ImageIcon image = new ImageIcon("ice-cream-icon.png"); // create an ImageIcon
		setIconImage(image.getImage());// change icon of frame

		setLocation(x, z);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java-2022-12\\ICON\\QRCODE_1.png"));
		lblNewLabel.setBounds(203, 112, 312, 326);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("SCAN TO PAY");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel_1.setBounds(172, 22, 356, 79);
		contentPane.add(lblNewLabel_1);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(565, 414, 109, 36);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
