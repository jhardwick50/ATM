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
	private int input = 0;
	private ATM atm;
	
        // TODO: add listeners for every button
	public Keypad(ATM atm){
            this.atm = atm;
            
                JButton one = new JButton("1");
                this.add(one);
                one.addActionListener(new InputActionListener(this));
                
                JButton two = new JButton("2");
                this.add(two);
                two.addActionListener(new InputActionListener(this));
                
                JButton three = new JButton("3");
                this.add(three);
                three.addActionListener(new InputActionListener(this));
                
                JButton four = new JButton("4");
                this.add(four);
                four.addActionListener(new InputActionListener(this));
                
                JButton five = new JButton("5");
                this.add(five);
                five.addActionListener(new InputActionListener(this));
                
                JButton six = new JButton("6");
                this.add(six);
                six.addActionListener(new InputActionListener(this));
                
                JButton seven = new JButton("7");
                this.add(seven);
                seven.addActionListener(new InputActionListener(this));
                
                JButton eight = new JButton("8");
                this.add(eight);
                eight.addActionListener(new InputActionListener(this));
                
                JButton nine = new JButton("9");
                this.add(nine);
                nine.addActionListener(new InputActionListener(this));
                
                JButton zero = new JButton("0");
                this.add(zero);
                zero.addActionListener(new InputActionListener(this));
                
                JButton enter = new JButton("Enter");
                this.add(enter);
                enter.addActionListener(new InputActionListener(this));
                
                JButton clear = new JButton("Clear");
                this.add(clear);
                clear.addActionListener(new InputActionListener(this));
                
        }
        // TODO: get current value and update or delete depending on value passed in.

    public void keyPress(String value) {
        if (value.equals("Clear")) {

            input = 0;
        } 
        else if (value.equals("Enter")){
            atm.pressEnter();
        }
        else {
            input = Integer.parseInt(String.valueOf(input)+ value);
        }
    }
        
        public int getInput(){
            return input;
        }
        public void clearInput(){
            input = 0;
        }
	
}
