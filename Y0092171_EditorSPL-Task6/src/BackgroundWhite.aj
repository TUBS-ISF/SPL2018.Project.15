import java.awt.Color;

public aspect BackgroundWhite {

	declare precedence: BackgroundWhite, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.setBackgroundColor(Color.WHITE);
		}

	}