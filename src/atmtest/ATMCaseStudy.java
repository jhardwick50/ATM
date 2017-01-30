package atmtest;
/**
 * @author Java How to Program Deitel & Deitel Ch.34
 *
 */
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ATMCaseStudy {
    
    

	public static void main(String[] args) {
                
                //create frame
                JFrame frame = new JFrame("ATM");
                
                ATM atm = new ATM();
                atm.setLayout(new GridLayout(4,1));
                
                Screen screen = new Screen();
                screen.setLayout(new GridLayout(1,1));
                screen.displayMessage("\nPlease enter your account number: ");

                
                Keypad keypad = new Keypad(atm);
                keypad.setLayout(new GridLayout(4,3));
                
                
                // TODO: make cash dispenser a class that is a JPanel.
                CashDispenser cashDispenser = new CashDispenser(screen);
                cashDispenser.setLayout(new GridLayout(1,1));
                
                DepositSlot depositSlot = new DepositSlot();
                depositSlot.setLayout(new GridLayout(1,1));
                
                atm.setScreen(screen);
                atm.setKeypad(keypad);
                atm.setCashDispenser(cashDispenser);
                atm.setDepositSlot(depositSlot);
                atm.setBankDatabase(new BankDatabase());
                
                
                atm.add(screen);
                atm.add(keypad);
                atm.add(cashDispenser);
                atm.add(depositSlot);


                frame.add(atm);
                frame.setSize(500,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                
               
	}

}
