package JSwingComponent;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class JLabelComponent extends JLabel implements Observer{

	public JLabelComponent(JSwingComponentProperties componentProperties) {

		this.setText(componentProperties.getText());
		this.setHorizontalAlignment(componentProperties.getHorizontalAlignment());
		this.setBorder(componentProperties.getBorder());

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
