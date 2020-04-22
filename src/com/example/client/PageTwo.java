package com.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class PageTwo extends Composite {
	private HorizontalPanel  hpanel = new HorizontalPanel();
	
	public PageTwo() {
		initWidget(hpanel);
		
		FlexTable ft = new FlexTable();
		Label lbl1 = new Label("yash");
		Label lbl2 = new Label("Priyanka");
		
		
		ft.setWidget(0, 0, lbl1);
		ft.setWidget(0, 1, lbl2);
		
		
		hpanel.add(ft);
		
	}
	
	
	

}
