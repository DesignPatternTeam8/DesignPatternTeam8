package JSwingComponent;

import javax.swing.JTextField;

public class JTextFieldComponent extends JTextField {

	public JTextFieldComponent(JSwingComponentProperties componentProperties) {

		this.setText(componentProperties.getText());
		this.setHorizontalAlignment(componentProperties.getHorizontalAlignment());
		this.setBorder(componentProperties.getBorder());
		this.setEditable(componentProperties.getEditable());
	}

}
