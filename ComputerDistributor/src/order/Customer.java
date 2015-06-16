package order;

public class Customer
{
    private String customer_ID;
    private String customer_Name;
    private String customer_Location;
    // store_ID is on class "Store"

    //getter
    public String getCustomer_ID() {
        return customer_ID;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public String getCustomer_Location() {
        return customer_Location;
    }

    //setter
    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public void setCustomer_Location(String customer_Location) {
        this.customer_Location = customer_Location;
    }
}
