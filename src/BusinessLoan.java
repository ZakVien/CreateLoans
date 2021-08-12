
/**
 *
 * @author Zach
 */

public class BusinessLoan extends Loan {
    public BusinessLoan(String name, String number, int amount, int length, double intRate){
        super(name, number, amount, length);
        interestRate = intRate + 1.0;
    }
    
}
