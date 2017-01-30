package atmtest;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Screen extends JPanel {

    JTextField textScreen = new JTextField();

    public Screen() {
        this.add(textScreen);

    }
    

    public void displayMessageLine(String value) {
        textScreen.setText( value + "\n");
    }

    public void displayMessage(String value) {
        textScreen.setText( value );

    }
}//end class Screen
