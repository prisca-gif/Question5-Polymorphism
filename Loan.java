/**
 * Abstract class Loan
 * This class represents a loan with basic properties and methods
 */
public abstract class Loan {
    // Data members
    private String loan_id;
    private String loan_type;
    private double amount;
    private String cust_name;
    
    // Default no-arg constructor to initialize loan amount to 0
    public Loan() {
        this.amount = 0.0;
    }
    
    // Set method for loan_id
    public void setLoanId(String loan_id) {
        this.loan_id = loan_id;
    }
    
    // Set method for customer name
    public void setCustName(String cust_name) {
        this.cust_name = cust_name;
    }
    
    // Get method for loan_id
    public String getLoanId() {
        return this.loan_id;
    }
    
    // Get method for customer name
    public String getCustName() {
        return this.cust_name;
    }
    
    // Method to set the value of loan amount
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    // Method to return the value of loan amount
    public double getAmount() {
        return this.amount;
    }
    
    // Abstract method to indicate the loan type
    public abstract String getLoanType();
}