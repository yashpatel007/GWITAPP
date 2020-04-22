package com.example.client;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageOne extends Composite{
	private VerticalPanel vpanel= new VerticalPanel();
	private Label lbl;
	private TextBox tb;
	
	public PageOne() {
		initWidget(this.vpanel);
		
		
		
		
		// lable
		this.lbl= new Label();
		this.lbl.setText("Hello");

		
		// 
		HorizontalPanel hpanel= new HorizontalPanel();
			// a text box and a button
			this.tb = new TextBox();
			Button btn1 = new Button("Change");
			btn1.addClickHandler(new ButtonClickHandler());
			hpanel.add(tb);
			hpanel.add(btn1);
			
			
		vpanel.add(lbl);
		vpanel.add(hpanel);
		
		PageTwo pagetwo = new PageTwo();
		vpanel.add(pagetwo);
		
		
	}
	private class ButtonClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			lbl.setText(tb.getText());
		}
		
		
	}
	
	
	
	
}
