package order;

public class Deliveries
{
    private String delivery_ID;
    //order_ID is on class "Orders"
    //sales_ID is on class "Sales"
    // store_ID is on class "Store"
    private String delivery_date;
    private String cost;

    //getter
    public String getDelivery_ID() {
        return delivery_ID;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public String getCost() {
        return cost;
    }

    //setter
    public void setDelivery_ID(String delivery_ID) {
        this.delivery_ID = delivery_ID;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
