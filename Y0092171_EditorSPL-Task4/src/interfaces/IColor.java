package interfaces;

import java.awt.*;


public interface IColor {
	
	public enum ColorType{
		Background,
		Text,
	}
	
	public Color getColor();

	public ColorType getColorType();
	
}
