
	public aspect Windows {

		public static Control control;
		
		after(): execution(void Editor.print()) {
			control = new Control();
		}

	}