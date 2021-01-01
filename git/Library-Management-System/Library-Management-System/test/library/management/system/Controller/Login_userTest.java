/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import library.management.system.Forgot;
import library.management.system.Loading;
import library.management.system.Login_user;
import library.management.system.Signup;
import library.management.system.conn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class Login_userTest {
    
    public Login_userTest() {
    }

    /**
     * Test of actionPerformed method, of class Login_user.
     */
    @Test
    public void testActionPerformed() {
        Login_userTest ae;
        ae= new Login_userTest();
        boolean b1=false;
      
		try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=?";
                    //PreparedStatement st = con.c.prepareStatement(sql);

                    
                    
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            
            }
    }

    /**
     * Test of main method, of class Login_user.
     */
    @Test
    public void testMain() {
        
        new Login_user().setVisible(true);
    }
    
}
