public class CarLoan extends Loan {
    // Variable car_lien - lien placed on the car until loan has been reimbursed
    private double car_lien;
    
    // No-arg constructor that initializes the variables amount, loan_id and cust_name
    public CarLoan() {
        super(); // Call parent constructor (initializes amount to 0)
        this.setLoanId("");
        this.setCustName("");
        this.car_lien = 0.0;
    }
    
    // Method to assign value to the lien
    public void setCarLien(double car_lien) {
        this.car_lien = car_lien;
    }
    
    // Method to return the value of the lien
    public double getCarLien() {
        return this.car_lien;
    }
    
    // Implementation of abstract method from parent class
    @Override
    public String getLoanType() {
        return "Car Loan";
    }
}