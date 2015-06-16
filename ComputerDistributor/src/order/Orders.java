package order;

public class Orders
{
    private String order_ID;
    //sales_ID is on class "Sales"
    // store_ID is on class "Store"
    // computer_ID is on class "Computer"
    private String status;
    private String price;

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
