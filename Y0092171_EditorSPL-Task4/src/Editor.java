/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2017  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */

import java.util.List;

import interfaces.IColor;
import interfaces.IFont;
import loader.PluginLoader;


public class Editor {

	private static Control control = new Control();
	public static void main(String[] args) throws InterruptedException {

		List<IColor> colorPlugins = PluginLoader.load(IColor.class);
		List<IFont> fontPlugins = PluginLoader.load(IFont.class);
		setColors(colorPlugins, true);
	}

	
	private static void setColors(List<IColor> colorPlugins, Boolean bla) {
		for(IColor color : colorPlugins) {			

			switch(color.getColorType())
			{
			case Background:
				control.setBackgroundColor(color.getColor());
				break;
				
			case Text:
				control.setTextColor(color.getColor());
				break;
			}
		}
	}
	
	private static void setFont(List<IFont> fontPlugins) {
		for(IFont font : fontPlugins) {			

			switch(font.getFontType())
			{
			case Bold:
				control.setFontToBold();
				break;
				
			case Cursiv:
				control.setFontToCursiv();
				break;
			}
		}
	}

}
