package JSwingFactory;

import javax.swing.border.Border;

public abstract class JSwingComponentFactory {

	public Object create(String text) {
		return null;
	}

	public Object labelCreate(String text, Integer alignment, Border border) {
		return null;
	}

	public Object create() {
		return null;
	}

	public Object panelCreate(Border border) {
		return null;
	}

	public Object textFieldCreate(String text, Integer alignment, Border border, boolean editable) {
		return null;
	}
}
