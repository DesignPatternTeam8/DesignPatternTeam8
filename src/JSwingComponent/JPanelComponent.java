package JSwingComponent;

import javax.swing.JPanel;

public class JPanelComponent extends JPanel {

	public JPanelComponent(JSwingComponentProperties componentProperties) {

		this.setBorder(componentProperties.getBorder());

	}
}
