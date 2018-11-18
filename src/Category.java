public class Category{
    private String type;
    private int amount;


    public Category(String type, int amount){
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
