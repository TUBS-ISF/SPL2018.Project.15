import java.awt.Color;

public aspect BackgroundBlack {

	declare precedence: BackgroundBlack, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.setBackgroundColor(Color.BLACK);
		}

	}