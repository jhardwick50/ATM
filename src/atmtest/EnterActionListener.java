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

public class EnterActionListener implements ActionListener {
   private ATM atm;
    
    public EnterActionListener(ATM atm){
        this.atm = atm;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        atm.pressEnter();
    }
    
}
