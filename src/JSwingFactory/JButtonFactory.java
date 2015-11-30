package JSwingFactory;

import JSwingComponent.JButtonComponent;
import JSwingComponent.JButtonProperties;
import JSwingComponent.JSwingComponentProperties;

public class JButtonFactory extends JSwingComponentFactory {
	JButtonComponent button = null;
	JSwingComponentProperties componentProperties;

	@Override
	public Object create(String text) {
		componentProperties = new JButtonProperties(text);
		this.button = new JButtonComponent(componentProperties);
		return this.button;
	}

}
