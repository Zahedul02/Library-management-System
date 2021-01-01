/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import library.management.system.Statistics;
import library.management.system.conn;
import net.proteanit.sql.DbUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class StatisticsTest {
    //Statistics st;
    //st= new Statistics();
    
    public StatisticsTest() {
    }

    /**
     * Test of main method, of class Statistics.
     */
    @Test
    public void testMain() {
         new Statistics().setVisible(true);
    }

    /**
     * Test of issueBook method, of class Statistics.
     */
    @Test
    public void testIssueBook() {
        System.out.println("Issued");
        //assertEquals(True,st.executeQuery(1, textField.getText());
        try {
            conn con =  new conn();
            String sql = "select * from issueBook";
            //PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
	}
    }

    /**
     * Test of returnBook method, of class Statistics.
     */
    @Test
    public void testReturnBook(){

System.out.println("BookReturned");
try {


            conn con = new conn();
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
        
    }
    
}
