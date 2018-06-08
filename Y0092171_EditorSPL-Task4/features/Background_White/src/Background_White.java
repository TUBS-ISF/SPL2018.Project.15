import java.awt.*;


public class Background_White implements interfaces.IColor {
	
	public Color getColor() {
		return Color.WHITE;
	}
		
	public interfaces.IColor.ColorType getColorType() {
		return interfaces.IColor.ColorType.Background;
	}	

}
