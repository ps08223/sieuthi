/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DialogHelper {
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message);
    }
    
    public static boolean confirm(Component parent, String message) {
        int ret = JOptionPane.showConfirmDialog(parent, message, "ABC",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        return ret == JOptionPane.YES_OPTION;
    }
    
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message);
    }
}
