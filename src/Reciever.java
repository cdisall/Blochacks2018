import java.util.*;


public class Reciever {

    //urgency + description
    private final String firstName;
    private final String lastName;
    private String email;
    private int password;
    private ArrayList<Category> needs;


    public Reciever(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


   private void updateNeed(String type, int amount){
        for(int i=0; i<needs.size(); i++){
            if(needs.get(i).getType().equals(type)){
                needs.get(i).setAmount(amount);
            }
        }
   }

}
