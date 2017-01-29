package atmtest;
/**
 * @author Java How to Program Deitel & Deitel Ch.34
 *
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Scanner;


public class Keypad extends JPanel{
	
	
	
        // TODO: add listeners for every button
	public Keypad(Screen screen){
		
                JButton one = new JButton("1");
                this.add(one);
                one.addActionListener(new KeyActionListener(screen));
                
                JButton two = new JButton();
                this.add(two);
                
                JButton three = new JButton();
                this.add(three);
                
                JButton four = new JButton();
                this.add(four);
                
                JButton five = new JButton();
                this.add(five);
                
                JButton six = new JButton();
                this.add(six);
                
                JButton seven = new JButton();
                this.add(seven);
                
                JButton eight = new JButton();
                this.add(eight);
                
                JButton nine = new JButton();
                this.add(nine);
                
                JButton zero = new JButton();
                this.add(zero);
                
                JButton enter = new JButton();
                this.add(enter);
                
                JButton clear = new JButton();
                this.add(clear);
        }
        public int getInput(){
            return 0;
        }
	
}
