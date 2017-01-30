/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jason
 */
public class InputActionListener implements ActionListener {
    private Keypad keypad;
    
    
    public InputActionListener(Keypad keypad){
        this.keypad = keypad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        keypad.keyPress(e.getActionCommand());
    }
    
    
    
    
    
}
