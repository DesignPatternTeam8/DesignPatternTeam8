package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import DAO.DBConnection;

public class MemberDAO {
	private String QUERY = "select type, supply, price from gas";
	MemberVO mem = new MemberVO();
	public MemberDAO() {
		try(Connection conn = DBConnection.getConnection();
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(getQuery(1))) {  
			while(rs.next()){
	            mem.setName(rs.getString("name"));
	            mem.setCustomerID(rs.getInt("customerID"));
	            mem.setMileage(rs.getInt("mileage"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public String getQuery(int i) {
		String query="";
		switch(i) {
		case 1:
			query= "select type, supply, price from gas"; break;
		case 2:
			query= "select mileage from customer where customerID=’"+mem.getCustomerID()+"’"; break;
		case 3:
			query= "insert into customer(+customerID, name, mileage) values("+mem.getCustomerID()+", "+mem.getName()+", 0)"; break;
		case 4:
			query= "select mileage from customer where customerID=’s_id’"; break;
		case 5:
			query= "select price from gas"; break;
		case 6:
			query= "select supply from gas"; break;
		case 7:
			query= "select mileage from customer where customerID=’s_id’"; break;
			
		}
		return query;
	}
	
	public void insert(MemberVO vo, String table) throws Exception {
		
	}
	public void select(MemberVO vo, String table) throws Exception {
		
	}
	public void update(MemberVO vo, String table) throws Exception {
		
	}
	public void delete(MemberVO vo, String table) throws Exception {
		
	}
	
}
