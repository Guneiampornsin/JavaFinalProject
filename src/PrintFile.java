import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class PrintFile {;
	private final String cone , flavor , topping ;
	private final String email;
	private final String name;
	private final String phoneNumber;
	
	public PrintFile(String cone, String flavor, String topping ,String name, String email, String phoneNumber) {
		// TODO Auto-generated constructor stub
		this.cone = cone;
		this.flavor = flavor;
		this.topping = topping;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getFormattedDate() {
		final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

		return dateFormat.format(System.currentTimeMillis());
	}
	public void writeBill() throws IOException{
		int conCost = 10;
		int flavorCost = 30;
		int toppingCost =  10;
		int total = conCost + flavorCost + toppingCost ;
		
		DecimalFormat decFor = new DecimalFormat("#,###.##");
		
		File toRead = new File(Paths.get("").toAbsolutePath() + "\\Bill.txt");//ดึงที่อยู่ของไฟล์ แล้วมาใช้ในโปรแกรม
		if(!toRead.exists())
			toRead.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(toRead,true));
		
		writer.write("------------------------"+ getFormattedDate()+"------------------------"
					+"\nName : "+ name
					+"\nEmail : " + email
					+"\nPhone : " + phoneNumber
					+"\nContainer : " + cone
					+"\nFlavor : " + flavor
					+"\nTopping : " + topping
					+"\nTotal : "+ decFor.format(total) +" Baht.");
		writer.write("\n-------------------------------------------------------------------\n");
		writer.close();
		
	}
}
