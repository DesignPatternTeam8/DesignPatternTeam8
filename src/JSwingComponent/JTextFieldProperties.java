package JSwingComponent;

import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class JTextFieldProperties extends JSwingComponentProperties {

	private Integer horizontalAlignment = SwingConstants.LEADING;
	private String text = null;
	private Border border = null;
	private boolean editable = false;

	public JTextFieldProperties(String text) {
		this.text = text;
	}

	public JTextFieldProperties(String text, int alignment, Border border, boolean editable) {
		this.text = text;
		this.horizontalAlignment = alignment;
		this.border = border;
		this.editable = editable;
	}

	@Override
	public Border getBorder() {
		return this.border;
	}

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public Integer getHorizontalAlignment() {
		return this.horizontalAlignment;
	}

	@Override
	public boolean getEditable() {
		return this.editable;
	}
}
