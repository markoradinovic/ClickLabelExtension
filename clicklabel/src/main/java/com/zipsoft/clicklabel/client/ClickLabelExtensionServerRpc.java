package com.zipsoft.clicklabel.client;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;
import com.zipsoft.clicklabel.client.shared.ClickedElementDetails;

// ServerRpc is used to pass events from client to server
public interface ClickLabelExtensionServerRpc extends ServerRpc {

	public void clicked(MouseEventDetails mouseDetails, ClickedElementDetails clickedElementDetails);

}
