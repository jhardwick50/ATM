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
		ATM theATM = new ATM();
		//theATM.run();
                
                //create frame
                JFrame frame = new JFrame("ATM");
                
                JPanel outerPanel = new JPanel();
                outerPanel.setLayout(new GridLayout(3,1));
                
                Screen screen = new Screen();
                screen.setLayout(new GridLayout(1,1));
                outerPanel.add(screen);
                
                Keypad keypad = new Keypad(screen);
                keypad.setLayout(new GridLayout(4,3));
                outerPanel.add(keypad);
                
                
                // TODO: make cash dispenser a class that is a JPanel.
                JPanel cashDispenser = new JPanel();
                cashDispenser.setLayout(new GridLayout(1,1));
                outerPanel.add(cashDispenser);
                
                frame.add(outerPanel);
                frame.setSize(500,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                
                
	}

}
