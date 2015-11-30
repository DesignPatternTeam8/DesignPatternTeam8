package JSwingComponent;

import javax.swing.JLabel;

public class JLabelComponent extends JLabel {

	public JLabelComponent(JSwingComponentProperties componentProperties) {

		this.setText(componentProperties.getText());
		this.setHorizontalAlignment(componentProperties.getHorizontalAlignment());
		this.setBorder(componentProperties.getBorder());

	}
}
