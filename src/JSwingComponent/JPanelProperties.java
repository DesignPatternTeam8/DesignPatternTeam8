package JSwingComponent;

import javax.swing.border.Border;

public class JPanelProperties extends JSwingComponentProperties {

	private Border border = null;

	public JPanelProperties() {

	}

	public JPanelProperties(Border border) {
		this.border = border;
	}

	@Override
	public Border getBorder() {
		return this.border;
	}
}
