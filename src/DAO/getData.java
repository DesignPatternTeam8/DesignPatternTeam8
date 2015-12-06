package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class getData {
	Connection conn = DBConnection.getConnection();
	Statement stmt;

	public getData() {
	}

	public List<Object> setType() {
		List<Object> types = new ArrayList<Object>();
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(getTypeSQL());
			while (rs.next()) {
				types.add(rs.getString(1));
			}
			return types;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	// type combo
	public String getTypeSQL() {
		return "select type from gas";
	}

	// sales화면 ok버튼
	public void insertSalesMN(int CustomerID, String type, int volume, int money, int mieleage) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String sql = "insert into sales values(" + CustomerID + "," + "\'" + type + "\'" + "," + volume + ","
					+ money + "," + (int) (money * 0.1 - mieleage) + ","
					+ dateFormat.format(new Date(System.currentTimeMillis())) + ")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// sales화면 ok버튼
	public void insertSales(int CustomerID, String type, int volume, int money, int mieleage) {

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String sql = "insert into sales values(" + CustomerID + "," + "\'" + type + "\'" + "," + volume + ","
					+ money + "," + (int) (money * 0.1 - mieleage) + ","
					+ dateFormat.format(new Date(System.currentTimeMillis())) + ")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// sales화면 ok버튼
	public void insertSalesVOL(int CustomerID, String type, int volume, int money, int mieleage) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String sql = "insert into sales values(" + CustomerID + "," + "\'" + type + "\'" + "," + volume + ","
					+ money + "," + (int) (money * 0.1 - mieleage) + ","
					+ dateFormat.format(new Date(System.currentTimeMillis())) + ")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 고객등록

	public void insertCInfo(String name, int CustomerID) {
		try {
			String sql = "insert into customer values(" + "\'" + name + "\'" + "," + CustomerID + ", 0)";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 고객 마일리지 확인
	public int checkCInfo(String name, int CustomerID) {
		try {
			String sql = "select mileage from customer where name =" + "\'" + name + "\'" + "and customerID =\'"
					+ CustomerID + "\'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next())
				return rs.getInt(1);
			else
				return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	// gas type에 따른 volume과 가격
	public int getGasVolume(String type) {
		try {
			String sql = "select volume from gas where type =" + "\'" + type + "\'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next())
				return rs.getInt(1);
			else
				return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	// gas type에 따른 가격
	public int getGasPrice(String type) {
		try {
			String sql = "select price from gas where type =" + "\'" + type + "\'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next())
				return rs.getInt(1);
			else
				return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	// 가스 가격 변경
	public void setGasPrice(String type, int price) {
		try {
			String sql = "update gas set price =" + "\'" + price + "\'" + "where type =" + "\'" + type + "\'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 가스 수량 추가
	public void setGasVolume(String type, int add) {
		try {
			String sql = "update gas set volume = volume +" + "\'" + add + "\'" + "where type =" + "\'" + type + "\'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 총판매량 확인
	public int checkResultVOL(String type, String startDate, String endDate) {
		int volume = 0;
		try {
			String sql = "select volume from sales where type =" + "\'" + type + "\'" + "and date between \'"
					+ startDate + "\' and \'" + endDate + "\'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				volume += rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return volume;
	}

	// 총판매금액 확인
	public int checkResultMN(String type, String startDate, String endDate) {
		int money = 0;
		try {
			String sql = "select money from sales where type =" + "\'" + type + "\'" + "and date between \'" + startDate
					+ "\' and \'" + endDate + "\'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				money += rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return money;
	}
}
