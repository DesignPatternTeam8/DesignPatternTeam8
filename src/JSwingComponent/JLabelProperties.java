package JSwingComponent;

import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class JLabelProperties extends JSwingComponentProperties {

	private Integer horizontalAlignment = SwingConstants.LEADING;
	private String text = null;
	private Border border = null;

	public JLabelProperties(String text) {
		this.text = text;
	}

	public JLabelProperties(String text, int alignment, Border border) {
		this.text = text;
		this.horizontalAlignment = alignment;
		this.border = border;
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

}
