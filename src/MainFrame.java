import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.*;

public class MainFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ArrayList<Transaction> transactions = new ArrayList<>();
		String file = "Summary.pdf";
		PDFParser parse = new PDFParser(file);
		transactions = parse.getTransactions();
		addCategory(transactions);
		ArrayList<Category> tester = new ArrayList<Category>();
		tester = getReport(transactions);
		System.out.println(tester.toString());

        Donor d1 = new Donor("Bob", "Doe", "bobdoe@gmail.com");
        Donor d2 = new Donor("Joe", "Youn", "joeyoun@gmail.com");
        Donor d3 = new Donor("Julie", "Robb", "julierobb@gmail.com");

        Reciever r1 = new Reciever("Ion", "Martin", "ionmartins@gmail.com");
        Reciever r2 = new Reciever("Bronf", "Man", "bronfman@gmail.com");
        Reciever r3 = new Reciever("Jane", "Sommers", "janesommers@gmail.com");

        ArrayList<Donor> donors = new ArrayList<Donor>();
        ArrayList<Reciever> recievers = new ArrayList<Reciever>();

        donors.add(0, d1);
        donors.add(1, d2);
        donors.add(2, d3);
        recievers.add(0, r1);
        recievers.add(1, r2);
        recievers.add(2, r3);
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
	
	public static void sendSomewhere(String url) throws IOException, URISyntaxException {
		java.net.URI tester = new java.net.URI(url);
		java.awt.Desktop.getDesktop().browse(tester);
	}
	
	public static ArrayList<Category> getReport(ArrayList<Transaction> transactions){
		ArrayList<Category> budget = new ArrayList<Category>();
		
		for (Transaction x : transactions) {
			
			boolean test = true;
			for (Category y : budget) {
				if (x.getCategory().equals(y.getType())) {
					test=false;
					double addAmount = (x.getAmount());
					y.setAmount(y.getAmount()+ (int)addAmount);
				}
			}
			if(test) {
				double addAmount = (x.getAmount());
				Category temp = new Category(x.getCategory(), (int)addAmount);
				budget.add(temp);
			}
		}
		
		return budget;
	}
}
