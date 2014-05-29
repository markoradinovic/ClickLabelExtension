package com.zipsoft.clicklabel.demo;

import com.zipsoft.clicklabel.ClickLabelExtension;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.zipsoft.clicklabel.ClickLabelEvent;
import com.zipsoft.clicklabel.ClickLabelListener;

@Theme("demo")
@Title("ClickLabelExtension Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class, widgetset = "com.zipsoft.clicklabel.demo.DemoWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {     
        
        final StringBuilder sb = new StringBuilder();
        sb.append("<div id=\"div1\" class=\"class1 class2\">Click on div</div>");
        sb.append("<p id=\"p1\">Click on p tag</p>");
        sb.append("<a href=\"javascript:;\" id=\"a1\">Click on a</a>");
        
        final TextArea textArea = new TextArea("Click event details");
        textArea.setSizeFull();
        
        final Label demoLabel = new Label("Click on label");
                
        final ClickLabelExtension extension = new ClickLabelExtension(demoLabel);
        extension.addClickLabelListener(new ClickLabelListener() {

            @Override
            public void onLabelClick(ClickLabelEvent event) {
                final StringBuilder s = new StringBuilder();
                s.append("Clicked Element Details \n");
                s.append("Element tag: " + event.getClickedElementDetails().getTagName() + "\n");
                s.append("Element ID: " + event.getClickedElementDetails().getId() + "\n");
                s.append("Element CSS class: " + event.getClickedElementDetails().getClassName() + "\n");
                s.append("Element HTML: " + event.getClickedElementDetails().getHtml() + "\n");
                s.append("Element Inner HTML: " + event.getClickedElementDetails().getInnerHtml() + "\n");
                s.append("Element Inner TEXT: " + event.getClickedElementDetails().getInnerText() + "\n");
//                s.append(event.getClickedElementDetails().toString());
                s.append("-----------\n");
                s.append("MouseEventDetails\n");
                s.append(event.getMouseDetails().toString());
                textArea.setValue(s.toString());
            }
        });
        
        
                
        Button button = new Button("Set HTML content");
        button.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(Button.ClickEvent event) {
                demoLabel.setContentMode(ContentMode.HTML);
                demoLabel.setValue(sb.toString());
            }
        });
        
        
        
        // Show it in the middle of the screen
        final VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(true);
        layout.setStyleName("demoContentLayout");
        layout.setSizeFull();
//        layout.addComponent(component);
//        layout.setComponentAlignment(component, Alignment.MIDDLE_CENTER);
        setContent(layout);
        
        layout.addComponent(demoLabel);
        layout.addComponent(button);
        layout.addComponent(textArea);
        layout.setExpandRatio(textArea, 1f);
        

    }

}
