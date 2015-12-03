package JSwingComponent;

import javax.swing.JButton;

public class JButtonComponent extends JButton {
	public JButtonComponent(JSwingComponentProperties componentProperties) {

		this.setText(componentProperties.getText());

	}
}
