/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import library.management.system.Home;
import library.management.system.ReturnBook;
import library.management.system.conn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class ReturnBookTest {
   Connection c;
    Statement s;
    
    public ReturnBookTest() {
    }

    /**
     * Test of main method, of class ReturnBook.
     */
    @Test
    public void testMain() {
        new ReturnBook().setVisible(true);
    }

    /**
     * Test of delete method, of class ReturnBook.
     */
    
    

    /**
     * Test of actionPerformed method, of class ReturnBook.
     */
    @Test
    public void testActionPerformed() {
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from issueBook where student_id = ? and book_id =?";
		//PreparedStatement st = con.c.prepareStatement(sql);
		
                
		
            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
		

		
		if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Processing..");
                    delete();
		} else
                    JOptionPane.showMessageDialog(null, "error");
		
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
    
    
}
