package atmtest;
/**
 * @author Java How to Program Deitel & Deitel Ch.34
 *
 */

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CashDispenser extends JButton implements ActionListener {

	private final static int INITIAL_COUNT = 500;
	private int count;
	private boolean cashInSlot = false;
        
	public CashDispenser(){
                super ("Cash Slot");
		count = INITIAL_COUNT;
                addActionListener(this);
	}//end CashDispenser constructor 
	
	public void dispenseCash(int amount){
		int billsRequired = amount / 20;
		count -= billsRequired;
	}//end method dispenseCash
	
	public boolean isSufficientCashAvailable(int amount){
		int billsRequired = amount / 20;
		
		if( count >= billsRequired){
			return true;
		}else{
			return false;
		}
	}//end method isSufficientCashAvailable
        //wait for the user to take the cash
        public void waitForCashRemoval(){
            while (cashInSlot){
               
                try{
                    Thread.sleep(10);
                }
            
                catch(InterruptedException ie){
                    
                    }
            }

        setText("Cash Slot");
        paint(this.getGraphics());
        setVisible(false);
        setVisible(true);
        }
        
        @Override 
        public void actionPerformed(ActionEvent ae){
            cashInSlot = false;
        }
                
}//end class CashDispenser
