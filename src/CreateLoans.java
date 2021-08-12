
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Zach
 */

public class CreateLoans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String response = "";
        double intRate = 0.0;
        ArrayList<Loan> loans = new ArrayList<Loan>();
        
        do{
            response = JOptionPane.showInputDialog(null, 
                    "(B)usiness loan?\n"
                    + "(P)ersonal loan\n"
                    + "(Q)uit");
            if(response.equalsIgnoreCase("B")){
                intRate = Double.parseDouble(JOptionPane.showInputDialog(null, 
                        "What is the current prime interest rate?"));
                Random rand = new Random();
                String loanNumber = Integer.toString(rand.nextInt(10000));
                Loan aLoan = new BusinessLoan(
                    JOptionPane.showInputDialog(null, "Enter customer last name:"),
                    loanNumber,
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Enter loan amount:")),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Enter term length:")),
                    intRate
                );
                loans.add(aLoan);
            }
            if(response.equalsIgnoreCase("P")){
                intRate = Double.parseDouble(JOptionPane.showInputDialog(null, 
                        "What is the current prime interest rate?"));
                Random rand = new Random();
                String loanNumber = Integer.toString(rand.nextInt(10000));
                Loan aLoan = new BusinessLoan(
                    JOptionPane.showInputDialog(null, "Enter customer last name:"),
                    loanNumber,
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Enter loan amount:")),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Enter term length:")),
                    intRate
                );
                loans.add(aLoan);
            }
        }while(!response.equalsIgnoreCase("Q"));
        for(Loan l : loans){
            JOptionPane.showMessageDialog(null, l.display());
        }
    }
}

