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
public class Editor {

	public static void main(String[] args) {
		Control control = new Control();
		System.out.println("Welcome to the Editor!");
		// #if Background_White
		System.out.println("Background color: White");
		control.setBackgroundColor(Color.white);
		// #endif
		// #if Background_Black
//@		System.out.println("Background color: Black");
//@		control.setBackgroundColor(Color.black);
		// #endif
		// #if Text_White
//@		System.out.println("Background color: White");
//@		control.setTextColor(Color.white);
		// #endif
		// #if Text_Black
		System.out.println("Background color: Black");
		control.setTextColor(Color.black);
		// #endif

		// #if Bold
//@		System.out.println("Text format: Bold");
//@		control.setFontToBold();
		// #endif

		// #if Cursiv
		System.out.println("Text format: Cursiv");
		control.setFontToCursiv();
		// #endif
	}

}
