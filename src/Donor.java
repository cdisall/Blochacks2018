import java.util.*;

public class Donor {

    //donor ranking  system

    private final String firstName;
    private final String lastName;
    private String email;
    private int password;

    private double donated;
    private ArrayList<Integer> associatedRecievers;



    public Donor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDonated(){
        return donated;
    }

    public void addDonated(double toAdd) {
        donated += toAdd;
    }
}