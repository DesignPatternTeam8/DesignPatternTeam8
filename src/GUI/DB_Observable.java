package GUI;

import java.util.Observable;

import DAO.MemberVO;
import JSwingComponent.JLabelComponent;

//subject
public class DB_Observable extends Observable{
	public void action(String type) {
		System.out.println("action!!");
		setChanged();
        notifyObservers(type);
	}
}
