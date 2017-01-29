package atmtest;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Screen extends JPanel {
	
        JTextField textScreen = new JTextField();
        
	public Screen(){
            this.add(textScreen);
        }
	// TODO: get current value and update or delete depending on value passed in.
        public void keyPress(String value){
            textScreen.setText(value);
        }
        public void displayMessageLine(String value){
            
        }
        public void displayMessage(String value){
            
        }
}//end class Screen
