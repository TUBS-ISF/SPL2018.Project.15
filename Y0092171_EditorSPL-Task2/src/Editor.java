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

import java.awt.Color;
import java.io.IOException;
import properties.PropertyManager;

public class Editor {
	
	//private Control control;

	public static void main(String[] args) throws IOException {
		Control control = new Control();
		if (PropertyManager.getProperty("Background_Black")) {
			System.out.println("Background color: Black");
			control.setBackgroundColor(Color.black);
		}
		if (PropertyManager.getProperty("Background_White")) {
			System.out.println("Background color: White");
			control.setBackgroundColor(Color.white);
		}
		if (PropertyManager.getProperty("Text_White")) {
			System.out.println("Text color: White");
			control.setTextColor(Color.white);
		}
		if (PropertyManager.getProperty("Text_Black")) {
			System.out.println("Text color: Black");
			control.setTextColor(Color.black);
		}
	}

}
