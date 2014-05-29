package com.zipsoft.clicklabel;

import com.vaadin.server.AbstractExtension;
import com.zipsoft.clicklabel.client.ClickLabelExtensionServerRpc;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.Label;
import com.zipsoft.clicklabel.client.shared.ClickedElementDetails;

// This is the server-side UI component that provides public API 
// for ClickLabelExtension
public class ClickLabelExtension extends AbstractExtension {

    // To process events from the client, we implement ServerRpc
    private ClickLabelExtensionServerRpc rpc = new ClickLabelExtensionServerRpc() {

        @Override
        public void clicked(MouseEventDetails mouseDetails, ClickedElementDetails clickedElementDetails) {
           
        }
    };

    public ClickLabelExtension(final Label label) {
        registerRpc(new ClickLabelExtensionServerRpc() {

            @Override
            public void clicked(MouseEventDetails mouseDetails, ClickedElementDetails clickedElementDetails) {
                 
                fireEvent(new ClickLabelEvent(label, mouseDetails, clickedElementDetails));
            }
        });
        extend(label);
        
    }
    
    public void addClickLabelListener(ClickLabelListener listener) {
        super.addListener(ClickLabelEvent.class, listener, ClickLabelListener.METHOD);
    }
    
    public void removeClickLabelListener(ClickLabelListener listener) {
        super.removeListener(ClickLabelEvent.class, listener, ClickLabelListener.METHOD);
    }

}
