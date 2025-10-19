/**
 * Main application to demonstrate CarLoan functionality
 */
public class LoanApplication {
    public static void main(String[] args) {
        System.out.println("=== Car Loan Management System ===\n");
        
        // i) Create car loan objects
        CarLoan carLoan1 = new CarLoan();
        CarLoan carLoan2 = new CarLoan();
        CarLoan carLoan3 = new CarLoan();
        
        // ii) Assign values to their id, type, amount and name for carLoan1
        carLoan1.setLoanId("CL001");
        carLoan1.setAmount(25000.50);
        carLoan1.setCustName("Moses Kemigisha");
        
        // iii) Assign value to the car_lien for the car loan
        carLoan1.setCarLien(22000.00);
        
        // ii) Assign values for carLoan2
        carLoan2.setLoanId("CL002");
        carLoan2.setAmount(18500.75);
        carLoan2.setCustName("Grace Nakirya");
        
        // iii) Assign value to the car_lien for carLoan2
        carLoan2.setCarLien(15000.25);
        
        // ii) Assign values for carLoan3
        carLoan3.setLoanId("CL003");
        carLoan3.setAmount(32000.00);
        carLoan3.setCustName("David Mubiru");
        
        // iii) Assign value to the car_lien for carLoan3
        carLoan3.setCarLien(28500.50);
        
        // iv) Display all the values
        System.out.println("Car Loan Details:");
        System.out.println("=================");
        
        displayLoanDetails(carLoan1, 1);
        displayLoanDetails(carLoan2, 2);
        displayLoanDetails(carLoan3, 3);
    }
    
    // Helper method to display loan details
    public static void displayLoanDetails(CarLoan loan, int loanNumber) {
        System.out.println("Car Loan " + loanNumber + ":");
        System.out.println("  Loan ID: " + loan.getLoanId());
        System.out.println("  Loan Type: " + loan.getLoanType());
        System.out.println("  Loan Amount: UGX " + String.format("%.2f", loan.getAmount()));
        System.out.println("  Customer Name: " + loan.getCustName());
        System.out.println("  Car Lien: UGX " + String.format("%.2f", loan.getCarLien()));
        System.out.println("  Remaining Balance: UGX " + String.format("%.2f", (loan.getAmount() - loan.getCarLien())));
        System.out.println();
    }
}