package GUI;

import java.util.Observable;

//subject
public class Test_Observable extends Observable{
	private Member mem = new Member();
	
	public void action() {
		setChanged();
        notifyObservers(mem);
	}
}