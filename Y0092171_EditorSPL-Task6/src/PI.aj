import java.awt.Color;

public aspect PI {


	declare precedence: PI, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.showBtnPI();
		}

	}