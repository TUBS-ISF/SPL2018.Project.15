import java.awt.Color;

public aspect TextWhite {

	declare precedence: TextWhite, Windows;

		after(): execution(void Editor.print()) {
			Windows.control.setTextColor(Color.WHITE);
		}

	}