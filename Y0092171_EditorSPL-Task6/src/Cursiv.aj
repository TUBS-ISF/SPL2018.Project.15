public aspect Cursiv {

	declare precedence: Cursiv, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.setFontToCursiv();
		}

	}