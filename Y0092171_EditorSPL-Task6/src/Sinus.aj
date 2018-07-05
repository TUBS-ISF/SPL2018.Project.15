public aspect Sinus {


	declare precedence: Sinus, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.showBtnSINUS();
		}

	}