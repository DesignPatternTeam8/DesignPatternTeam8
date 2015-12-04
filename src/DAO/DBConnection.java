package DAO;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//singleton pattern 151204 이호일 수정
public class DBConnection {
	private static Connection conn = null;
	
	public static Connection getConnection() {
        Properties props = new Properties();
        FileInputStream fis = null;
        if(conn==null) {
	        try {
	            fis = new FileInputStream("db.properties");
	            props.load(fis);
	            
	            // load the Driver Class
	            Class.forName(props.getProperty("DB_DRIVER_CLASS"));
	 
	            // create the connection now
	            conn = DriverManager.getConnection(props.getProperty("DB_URL"),
	                    props.getProperty("DB_USERNAME"),
	                    props.getProperty("DB_PASSWORD"));
	        } catch (IOException | ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
        }
        return conn;
    }
}


//사용 예시
//st = connect.createStatement();
//rset = st.executeQuery(dbname);
//if(s_no!=0){
//	sql = "select * from info where no = '"+s_no+"'";		//SQL
//}
//else {	
//	sql = "select name from info";
//}	
//rset = st.executeQuery(sql);
//while( rset.next() ) {	//내용 있으면
//
//}
//}
//catch(Exception se){}
//finally{
//try{
//	if(rset!=null)rset.close();
//	if(st!=null)st.close();
//	if(connect!=null)connect.close();
//}
//catch(Exception se){}
//}
