import java.awt.Color;

public aspect TextBlack {

	declare precedence: TextBlack, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.setTextColor(Color.BLACK);
		}

	}