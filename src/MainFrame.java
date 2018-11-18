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
		System.out.println(transactions.toString());
		
	}
}
