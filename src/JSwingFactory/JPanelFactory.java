package JSwingFactory;

import javax.swing.border.Border;

import JSwingComponent.JPanelComponent;
import JSwingComponent.JPanelProperties;
import JSwingComponent.JSwingComponentProperties;

public class JPanelFactory extends JSwingComponentFactory {
	JPanelComponent panel = null;
	JSwingComponentProperties componentProperties;

	@Override
	public Object create() {
		componentProperties = new JPanelProperties();
		this.panel = new JPanelComponent(componentProperties);
		return this.panel;
	}

	@Override
	public Object panelCreate(Border border) {
		componentProperties = new JPanelProperties(border);
		this.panel = new JPanelComponent(componentProperties);
		return this.panel;
	}
}