package JSwingComponent;

import javax.swing.JPanel;
import javax.swing.border.*;

public class JPanelComponent extends JPanel {

	public JPanelComponent(JSwingComponentProperties componentProperties) {

			this.setBorder((TitledBorder)componentProperties.getBorder());
			
	}
}
