package JSwingFactory;

import javax.swing.border.Border;

import JSwingComponent.JSwingComponentProperties;
import JSwingComponent.JTextFieldComponent;
import JSwingComponent.JTextFieldProperties;

public class JTextFieldFactory extends JSwingComponentFactory {
	JTextFieldComponent textField = null;
	JSwingComponentProperties componentProperties;

	@Override
	public JTextFieldComponent textFieldCreate(String text) {
		this.componentProperties = new JTextFieldProperties(text);
		textField = new JTextFieldComponent(this.componentProperties);
		return textField;
	}

	@Override
	public JTextFieldComponent textFieldCreate(String text, Integer alignment, Border border, boolean editable) {
		this.componentProperties = new JTextFieldProperties(text, alignment, border, editable);
		textField = new JTextFieldComponent(this.componentProperties);
		return textField;
	}
}
