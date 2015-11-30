package JSwingComponent;

import javax.swing.border.Border;

public class JButtonProperties extends JSwingComponentProperties {
	private String text = null;

	public JButtonProperties() {

	}

	public JButtonProperties(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return this.text;
	}
}
