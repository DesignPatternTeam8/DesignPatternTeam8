package GUI;

import java.util.Observable;

import DAO.MemberVO;
import JSwingComponent.JLabelComponent;

//subject
public class DB_Observable extends Observable{
	private MemberVO mem = new MemberVO();
	
	public void action() {
		System.out.println("action!!");
		setChanged();
        notifyObservers(mem);
	}
}
