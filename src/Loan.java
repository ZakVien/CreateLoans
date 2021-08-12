
/**
 *
 * @author Zach
 */

public abstract class Loan implements LoanConstants {
    String loanNumber;
    int loanAmount;
    int termLength;
    double interestRate;
    String custLastName;
    
    public Loan(String name, String number, int amount, int length){
        custLastName = name;
        loanNumber = number;
        if(amount > 100000){
            loanAmount = 100000;
        }else{
            loanAmount = amount;
        };
        
        if((length != SHORTTERM) && (length != MEDIUMTERM) && (length != LONGTERM)){
            termLength = 1;
        }else{
            termLength = length;
        }
    }
    
    public String display(){
        String message = COMPANYNAME + "\n"
                + "---------------\n"
                + "Last Name: " + custLastName + "\n"
                + "Loan Number: " + loanNumber + "\n"
                + "Loan Amount: $" + String.format("%,d", loanAmount) + "\n"
                + "Loan Term: " + termLength + " year(s)\n"
                + "Interest Rate: " + String.format("%.3f", interestRate) + "%";
        return message;
    }
}
