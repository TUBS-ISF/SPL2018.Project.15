public aspect Bold {

	declare precedence: Bold, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.setFontToBold();
		}

	}