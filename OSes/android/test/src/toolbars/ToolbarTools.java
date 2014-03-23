package toolbars;

import android.os.Bundle;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;
import android.view.View;
import android.app.Activity;

import net.sourceforge.fidocadj.*;
import circuit.controllers.ElementsEdtActions;


/** ANDROID VERSION.
	Handle the events on the toolbar present in the resources.
	    
<pre>
    This file is part of FidoCadJ.

    FidoCadJ is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FidoCadJ is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY{} without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with FidoCadJ.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2014 by Davide Bucci
</pre>
*/

public class ToolbarTools
{

	private ToggleButton selection;
	private ToggleButton line;
	private ToggleButton advtext;
	private ToggleButton bezier;
	private ToggleButton polygon;
	private ToggleButton complexcurve;
	private ToggleButton ellipse;
	private ToggleButton rectangle;
	private ToggleButton connection;
	private ToggleButton pcbline;
	private ToggleButton pcbpad;
	
	private ElementsEdtActions eea;
	
	/** Create and add all the required listeners to the toggle buttons.
	*/
	public void activateListeners(Activity aa, ElementsEdtActions ee)
	{
		eea=ee;
		getButtons(aa);
		
		// Quite boring, but easy code. Each listener blanks the state
		// of all buttons, except the one which has been clicked and
		// sets the current selected state.
		selection.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(selection);
				selection.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.SELECTION);
			}
		});
		line.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(line);
				line.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.LINE);
			}
		});
		advtext.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(advtext);
				advtext.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.TEXT);
			}
		});
		bezier.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(bezier);
				bezier.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.BEZIER);
			}
		});
		polygon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(polygon);
				polygon.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.POLYGON);
			}
		});
		complexcurve.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(complexcurve);
				complexcurve.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.COMPLEXCURVE);
			}
		});
		ellipse.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(ellipse);
				ellipse.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.ELLIPSE);
			}
		});
		rectangle.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(rectangle);
				rectangle.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.RECTANGLE);
			}
		});
		connection.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(connection);
				connection.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.CONNECTION);
			}
		});
		pcbline.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(pcbline);
				pcbline.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.PCB_LINE);
			}
		});
		pcbpad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				resetButtons(pcbpad);
				pcbpad.setChecked(true);
				eea.setActionSelected(ElementsEdtActions.PCB_PAD);
			}
		});
	}
	
	/** Reset the state of all buttons, except the one specified.
		@param exc the toggle button to exclude from the reset. It can
			be null, if all buttons should be reset.
	*/
	private void resetButtons(ToggleButton exc)
	{
		if(!selection.equals(exc))    selection.setChecked(false);
		if(!line.equals(exc))         line.setChecked(false);
		if(!advtext.equals(exc))      advtext.setChecked(false);
		if(!bezier.equals(exc))       bezier.setChecked(false);
		if(!polygon.equals(exc))      polygon.setChecked(false);
		if(!complexcurve.equals(exc)) complexcurve.setChecked(false);
		if(!ellipse.equals(exc))      ellipse.setChecked(false);
		if(!rectangle.equals(exc))    rectangle.setChecked(false);
		if(!connection.equals(exc))   connection.setChecked(false);
		if(!pcbline.equals(exc))      pcbline.setChecked(false);
		if(!pcbpad.equals(exc))       pcbpad.setChecked(false);
	}
	
	/** Associate all the ToggleButtons present in the resources to internal
		variables.
	*/
	private void getButtons(Activity aa) 
	{
		// get elements of the toolbars created in the resources
		selection = (ToggleButton) aa.findViewById(R.id.selection);
		line = (ToggleButton) aa.findViewById(R.id.line);
		advtext = (ToggleButton) aa.findViewById(R.id.advtext);
		bezier = (ToggleButton) aa.findViewById(R.id.bezier);
		polygon = (ToggleButton) aa.findViewById(R.id.polygon);
		complexcurve = (ToggleButton) aa.findViewById(R.id.complexcurve);
		ellipse = (ToggleButton) aa.findViewById(R.id.ellipse);
		rectangle = (ToggleButton) aa.findViewById(R.id.rectangle);
		connection = (ToggleButton) aa.findViewById(R.id.connection);
		pcbline = (ToggleButton) aa.findViewById(R.id.pcbline);
		pcbpad = (ToggleButton) aa.findViewById(R.id.pcbpad);
	}
}