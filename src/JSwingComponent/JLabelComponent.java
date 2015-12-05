package JSwingComponent;

import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelComponent extends JLabel implements Observer{
	
	public JLabelComponent(JSwingComponentProperties componentProperties) {

		this.setText(componentProperties.getText());
		this.setHorizontalAlignment(componentProperties.getHorizontalAlignment());
		this.setBorder(componentProperties.getBorder());

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
//		GasDAO gas= new GasDAO("");
//		gas.setMember(arg.toString());
//		this.setText(String.valueOf(gas.getMember().getVolume()));
		this.setHorizontalAlignment(SwingConstants.RIGHT);
		this.setBorder(BorderFactory.createEtchedBorder());
	}
}
