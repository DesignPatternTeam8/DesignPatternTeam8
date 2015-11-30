package JSwingFactory;

import javax.swing.border.Border;

import JSwingComponent.JLabelComponent;
import JSwingComponent.JLabelProperties;
import JSwingComponent.JSwingComponentProperties;

public class JLabelFactory extends JSwingComponentFactory {

	JLabelComponent label = null;
	JSwingComponentProperties componentProperties;

	public JLabelFactory() {

	}

	@Override
	public Object create(String text) {
		this.componentProperties = new JLabelProperties(text);
		label = new JLabelComponent(this.componentProperties);
		return label;
	}

	@Override
	public Object labelCreate(String text, Integer alignment, Border border) {
		this.componentProperties = new JLabelProperties(text, alignment, border);
		label = new JLabelComponent(this.componentProperties);
		return label;
	}
}
