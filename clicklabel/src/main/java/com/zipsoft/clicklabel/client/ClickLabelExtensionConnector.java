package com.zipsoft.clicklabel.client;

import com.zipsoft.clicklabel.ClickLabelExtension;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.MouseEventDetailsBuilder;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.ui.Connect;
import com.zipsoft.clicklabel.client.shared.ClickedElementDetails;

// Connector binds client-side widget class to server-side component class
// Connector lives in the client and the @Connect annotation specifies the
// corresponding server-side component
@Connect(ClickLabelExtension.class)
public class ClickLabelExtensionConnector extends AbstractExtensionConnector {

    @Override
    protected void extend(ServerConnector target) {
        final Widget widget = ((ComponentConnector) target).getWidget();

        widget.addDomHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                MouseEventDetails mouseEventDetails = MouseEventDetailsBuilder.buildMouseEventDetails(event.getNativeEvent());
                Element actualElement = Element.as(event.getNativeEvent().getEventTarget());
                ClickedElementDetails details = new ClickedElementDetails(
                        actualElement.getId(),
                        actualElement.getTagName(),
                        actualElement.getClassName(),
                        actualElement.getString(), actualElement.getInnerHTML(), actualElement.getInnerText());
                getRpcProxy(ClickLabelExtensionServerRpc.class).clicked(mouseEventDetails, details);

            }
        }, ClickEvent.getType());
    }
}
