package JSwingComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonComponent extends JButtonObservable implements ActionListener {
	public JButtonComponent(JSwingComponentProperties componentProperties) {

		this.setText(componentProperties.getText());

	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
	}
}
