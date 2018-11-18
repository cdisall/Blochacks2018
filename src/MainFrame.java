import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class MainFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		ArrayList<Transaction> transactions = new ArrayList<>();
		String file = "Summary.pdf";
		PDFParser parse = new PDFParser(file);
		transactions = parse.getTransactions();
		//System.out.println(transactions.toString());
		addCategory(transactions);
		
		
	}
	
	public static void addCategory(ArrayList<Transaction> transactions) {
		for (Transaction x : transactions) {
			String merchant = x.getMerchant();
			String city = x.getCity();
			
			//This step is only required on Windows. Comment out if running on Mac.
			if (city.charAt(city.length()-2) < 1 || city.charAt(city.length()-2) > 26 ) city = city.substring(0, city.length() - 1);
			
			String category = REST.getCategory(merchant, city);
			
			x.setCategory(category);
		}
	}
}
