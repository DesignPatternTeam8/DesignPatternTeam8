//package GUI;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DBconnectTest {
//	static final String QUERY = "select name,customerID,mileage from customer";
//	 public static void main(String[] args) {	
//		try(Connection con = DBConnection.getConnection();
//	            Statement stmt = con.createStatement();
//	            ResultSet rs = stmt.executeQuery(QUERY)) {  
//	         
//	        while(rs.next()){
//	            String name = rs.getString("name");
//	            String customerID = rs.getString("customerID");
//	            String mileage = rs.getString("mileage");
//	            System.out.println(name+ "," +customerID+ "," +mileage);
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	 }
//}
