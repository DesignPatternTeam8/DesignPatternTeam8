package JSwingFactory;

import javax.swing.border.Border;

import JSwingComponent.JPanelComponent;
import JSwingComponent.JPanelProperties;
import JSwingComponent.JSwingComponentProperties;

public class JPanelFactory extends JSwingComponentFactory {
	JPanelComponent panel = null;
	JSwingComponentProperties componentProperties;

	@Override
	public JPanelComponent panelCreate() {
		componentProperties = new JPanelProperties();
		this.panel = new JPanelComponent(componentProperties);
		return this.panel;
	}

	@Override
	public JPanelComponent panelCreate(Border border) {
		
		componentProperties = new JPanelProperties(border);
		this.panel = new JPanelComponent(componentProperties);
		return this.panel;
	}
}