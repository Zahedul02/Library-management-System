/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.Controller;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import library.management.system.Login_user;
import library.management.system.Signup;
import library.management.system.conn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class SignupTest {
    
    public SignupTest() {
    }

    /**
     * Test of main method, of class Signup.
     */
    @Test
    public void testMain() {
        new Signup().setVisible(true);
    }

    /**
     * Test of actionPerformed method, of class Signup.
     */
    @Test
    public void testActionPerformed() {
        
       try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
		//PreparedStatement st = con.c.prepareStatement(sql);

		

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully Created");
                }

               
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
    
}
