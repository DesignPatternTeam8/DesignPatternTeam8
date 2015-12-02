package JSwingFactory;

import javax.swing.border.Border;

import JSwingComponent.JButtonComponent;
import JSwingComponent.JLabelComponent;
import JSwingComponent.JPanelComponent;
import JSwingComponent.JTextFieldComponent;

public abstract class JSwingComponentFactory {

	public JLabelComponent labelCreate(String text) {
		return null;
	}

	public JLabelComponent labelCreate(String text, Integer alignment, Border border) {
		return null;
	}

	public JPanelComponent panelCreate() {
		return null;
	}

	public JPanelComponent panelCreate(Border border) {
		return null;
	}

	public JButtonComponent buttonCreate(String text) {
		return null;
	}

	public JTextFieldComponent textFieldCreate(String text) {
		return null;
	}

	public JTextFieldComponent textFieldCreate(String text, Integer alignment, Border border, boolean editable) {
		return null;
	}
}
