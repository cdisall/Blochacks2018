import java.util.*;

public class Reciever {

    //urgency + description
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private ArrayList<Category> needs;
    private ArrayList<Category> report;
    private String description;


    public Reciever(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.needs = new ArrayList<Category>();
        this.report = new ArrayList<Category>();
    }

    public Reciever(String email, String pwd) {
        this.email = email;
        this.password = pwd;
        this.needs = new ArrayList<Category>();
        this.report = new ArrayList<Category>();
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    public void setReport(ArrayList<Category> report) {
        this.report=report;
    }
    
    public ArrayList<Category> getReport(){
    	return this.report;
    }
    
    public String toString(){
    	String message = "";
    	
    	for (Category c : this.report) {
    		message += "Category: " + c.getType() + " Amount: " + c.getAmount() + '\n';
    	}
    	
    	return message;
    }

    //need to initalize these before
    public void setDefaultNeeds(){
        Category c0 = new Category("misc_store", 0);
        Category c1 = new Category("groceries", 0);
        Category c2 = new Category("bank", 0);
        Category c3 = new Category("gas_station", 0);
        Category c4 = new Category("clothing_store", 0);
        Category c5 = new Category("lodging", 0);
        Category c6 = new Category("pharmacy", 0);

        needs.add(c0);
        needs.add(1, c1);
        needs.add(2, c2);
        needs.add(3, c3);
        needs.add(4, c4);
        needs.add(5, c5);
        needs.add(6, c6);
    }

    public void updateNeed(String type, int amount){
        for(int j=0; j<needs.size(); j++){
            if(needs.get(j).getType().equals(type)){
                needs.get(j).setAmount(amount);
            }
        }
   }




}
