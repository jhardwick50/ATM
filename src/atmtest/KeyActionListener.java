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
public class KeyActionListener implements ActionListener {
    private Screen screen;
    
    public KeyActionListener(Screen screen){
        this.screen = screen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        screen.keyPress(e.getActionCommand());
    }
    
}
