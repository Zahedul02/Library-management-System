/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.Model;

import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;
import library.management.system.AddBook;
import library.management.system.Home;
import library.management.system.conn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class AddBookTest {
    
    
    /**
     * Test of main method, of class AddBook.
     */
    @Test
    public void testMain() {
        new AddBook().setVisible(true);
    }

    /**
     * Test of random method, of class AddBook.
     */
    @Test
    public void testRandom() {
         Random rd = new Random();
         AddBookTest t1=new AddBookTest();
	
         
       //t1.setText("" + rd.nextInt(1000 + 1));
    }

    /**
     * Test of actionPerformed method, of class AddBook.
     */
    @Test
    public void testActionPerformed() {
        
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
		//PreparedStatement st = con.c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
		

		int rs = st.executeUpdate();
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
               
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);

            }
            //con.c.close();
        }catch(Exception e){
            
        }
    }
    
}
