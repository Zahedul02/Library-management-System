/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.Model;

import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;
import library.management.system.Home;
import library.management.system.conn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class AddStudentTest {
    
    public AddStudentTest() {
    }

    /**
     * Test of main method, of class AddStudent.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of random method, of class AddStudent.
     */
    @Test
    public void testRandom() {
         Random rd = new Random();
	
    }

    /**
     * Test of actionPerformed method, of class AddStudent.
     */
    @Test
    public void testActionPerformed() {
        try{
            AddStudentTest ae=new AddStudentTest();
            
            if(ae.getSource() == b1){
                try{
                conn con = new conn();
                String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
		//PreparedStatement st = con.c.prepareStatement(sql);
		int i=1;

		//int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    //this.setVisible(false);
                    new Home().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);		
            }
        }catch(Exception e){
            
        }
    }
    
}
