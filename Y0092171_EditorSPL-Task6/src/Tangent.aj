public aspect Tangent {


	declare precedence: Tangent, Windows;
	
		after(): execution(void Editor.print()) {
			Windows.control.showBtnTANGENT();
		}

	}