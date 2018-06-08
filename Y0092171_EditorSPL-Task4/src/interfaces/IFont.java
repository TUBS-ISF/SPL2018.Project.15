package interfaces;

public interface IFont {
	
	public enum FontType{
		Bold,
		Cursiv,
	}
	
	public FontType getFontType();
	
}
