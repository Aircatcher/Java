import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Computer;
import order.Customer;
import order.Deliveries;
import order.Invoice;
import order.Orders;
import sales.Sales;
import store.Store;

public class JDBConnector {

    public JDBConnector(){
        
    }
    
    //Note Student, This module is for returning the connection, which is object 
    //Call this module when you need to access the database
    private static Connection getDBConnection(){
         System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/computerdistributor", "root", "");
                    //Connect to:  "Database URL"                               , "Username", "Password"

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return connection;
    }
    
    /*This is the example of one module to get information from a single table
    WARNING : the return statement is a single model. If you want to return multiple row
    then use List of Computer or Array List of person (eg. List<Persons>)
    */
    public Computer getTables_Computer()
    {
        Computer test = new Computer();
        String selectSQL =
        "SELECT * FROM computer LEFT JOIN computer_model ON computer.Computer_Model_Code = computer_model.Computer_Model_Code;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setComputer_ID(rs.getString("Computer_ID"));
                test.setComputer_Model_Code(rs.getString("Computer_Model_Code"));
                test.setComputer_Model_Name(rs.getString("Computer_Model_Name"));
                test.setComputer_Name(rs.getString("Computer_Name"));
                test.setFactory(rs.getString("Factory"));
                test.setComputer_Brand_Code(rs.getString("Computer_Brand_Code"));
                test.setComputer_Brand_Name(rs.getString("Computer_Brand_Name"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
    
    public Customer getTables_Customer()
    {
        Customer test = new Customer();
        String selectSQL = "SELECT * FROM customer;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setCustomer_ID(rs.getString("customer_ID"));
                test.setCustomer_Name(rs.getString("customer_Name"));
                test.setCustomer_Location(rs.getString("customer_Location"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
    
    public Deliveries getTables_Deliveries()
    {
        Deliveries test = new Deliveries();
        String selectSQL = "SELECT * FROM deliveries;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setDelivery_ID(rs.getString("delivery_ID"));
                test.setDelivery_date(rs.getString("delivery_Date"));
                test.setCost(rs.getString("delivery_Cost"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
    
    public Orders getTables_Orders()
    {
        Orders test = new Orders();
        String selectSQL = "SELECT * FROM orders;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setOrder_ID(rs.getString("order_ID"));
                test.setStatus(rs.getString("status"));
                test.setPrice(rs.getString("price"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
    
    public Invoice getTables_Invoice()
    {
        Invoice test = new Invoice();
        String selectSQL = "SELECT * FROM invoice;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setInvoice_ID(rs.getString("invoice_ID"));
                test.setTotal_Price(rs.getString("total_Price"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
    
    public Store getTables_Store()
    {
        Store test = new Store();
        String selectSQL = "SELECT * FROM store;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setStore_ID(rs.getString("store_ID"));
                test.setStore_Name(rs.getString("store_Name"));
                test.setAddress(rs.getString("address"));
                test.setCity_Store(rs.getString("city_Store"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
    
    public Sales getTables_Sales()
    {
        Sales test = new Sales();
        String selectSQL = "SELECT * FROM sales;";

        try
        {
            Connection dbConnection = getDBConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL);
            
            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next())
            {
                test.setSales_ID(rs.getString("sales_ID"));
                test.setSales_Name(rs.getString("sales_Name"));
                test.setCity_Sales(rs.getString("city_Sales"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return test;
    }
}
