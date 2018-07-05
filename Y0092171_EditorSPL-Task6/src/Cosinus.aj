public aspect Cosinus {


	declare precedence: Cosinus, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.showBtnCOSINUS();
		}

	}