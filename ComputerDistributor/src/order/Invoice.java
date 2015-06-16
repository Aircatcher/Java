package order;

public class Invoice
{
    private String invoice_ID;
    //order_ID is on class "Orders"
    //customer_ID is on class "Customer"
    private String total_Price;

    public String getInvoice_ID() {
        return invoice_ID;
    }

    public void setInvoice_ID(String invoice_ID) {
        this.invoice_ID = invoice_ID;
    }

    public String getTotal_Price() {
        return total_Price;
    }

    public void setTotal_Price(String total_Price) {
        this.total_Price = total_Price;
    }
}
