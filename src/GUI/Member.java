package GUI;

public class Member {
	private String s_type;	//휘발유 등유 LPG
	private int s_supply;	//보유량
	private int s_price;	//리터당 가격
	private String s_name;	//고객이름
	private int s_id;		//고객 ID
	private int s_mileage;	//고객 마일리지
	private int s_salesID;	//판매ID
	private int s_volume;	//판매량
	private int s_money;	//판매금액
	
	public void setType(String type) {
	  this.s_type = type;
	}
	public String getType(){
	  return s_type;
	}
	public void setSupply(int supply) {
		this.s_supply = supply;
	}
	public int getSupply() {
		return s_supply;
	}
	public void setPrice(int price) {
		this.s_price = price;
	}
	public int getPrice() {
		return s_price;
	}
	public void setName(String name) {
	  this.s_name = name;
	}
	public String getName(){
	  return s_name;
	}
	public void setCustomerID(int customerID) {
		this.s_id = customerID;
	}
	public int getCustomerID() {
		return s_id;
	}public void setMileage(int mileage) {
		this.s_mileage = mileage;
	}
	public int getMileage() {
		return s_mileage;
	}public void setSalesID(int salesID) {
		this.s_salesID = salesID;
	}
	public int getSalesID() {
		return s_salesID;
	}public void setVolume(int volume) {
		this.s_volume = volume;
	}
	public int getVolume() {
		return s_volume;
	}public void setMoney(int money) {
		this.s_money = money;
	}
	public int getMoney() {
		return s_money;
	}

}
