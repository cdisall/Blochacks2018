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
//		System.out.println(transactions.toString());
		
		String merchant = transactions.get(0).getMerchant();
		String city = transactions.get(0).getCity();
		
		System.out.println(merchant);
		System.out.println(city + "Hello ");
		String category = REST.getCategory(merchant, city);
		System.out.println(category);
		
	}
}
