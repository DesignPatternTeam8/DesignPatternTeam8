package GUI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.DBConnection;
import DAO.MemberVO;

public class DBconnectTest {
	static final String QUERY = "select name,customerID,mileage from customer where name='hoil'";
	MemberVO mem = new MemberVO();	
	public DBconnectTest() {
		try(Connection con = DBConnection.getConnection();
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery(QUERY)) {  
			while(rs.next()){
	            mem.setName(rs.getString("name"));
	            mem.setCustomerID(rs.getInt("customerID"));
	            mem.setMileage(rs.getInt("mileage"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	 }
}
