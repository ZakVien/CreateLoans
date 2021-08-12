
/**
 *
 * @author Zach
 */

public class PersonalLoan extends Loan {
    public PersonalLoan(String name, String number, int amount, int length, double intRate){
        super(name, number, amount, length);
        interestRate = intRate + 2.0;
    }
}
