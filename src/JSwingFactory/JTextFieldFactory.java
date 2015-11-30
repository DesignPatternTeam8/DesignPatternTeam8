package JSwingFactory;

import javax.swing.border.Border;

import JSwingComponent.JLabelComponent;
import JSwingComponent.JSwingComponentProperties;
import JSwingComponent.JTextFieldComponent;
import JSwingComponent.JTextFieldProperties;

public class JTextFieldFactory extends JSwingComponentFactory {
	JTextFieldComponent textField = null;
	JSwingComponentProperties componentProperties;

	@Override
	public Object create(String text) {
		this.componentProperties = new JTextFieldProperties(text);
		textField = new JTextFieldComponent(this.componentProperties);
		return textField;
	}

	@Override
	public Object textFieldCreate(String text, Integer alignment, Border border, boolean editable) {
		this.componentProperties = new JTextFieldProperties(text, alignment, border, editable);
		textField = new JTextFieldComponent(this.componentProperties);
		return textField;
	}
}
