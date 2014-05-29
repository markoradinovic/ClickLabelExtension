/*
 * Copyright 2014 marko.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zipsoft.clicklabel;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.Component;
import com.zipsoft.clicklabel.client.shared.ClickedElementDetails;

/**
 *
 * @author marko
 */
public class ClickLabelEvent extends Component.Event {

    private final MouseEventDetails mouseDetails;
    
    private final ClickedElementDetails clickedElementDetails;
    
    public ClickLabelEvent(Component source, MouseEventDetails mouseDetails, ClickedElementDetails clickedElementDetails) {
        super(source);
        this.mouseDetails = mouseDetails;
        this.clickedElementDetails = clickedElementDetails;
    }

    public MouseEventDetails getMouseDetails() {
        return mouseDetails;
    }

    public ClickedElementDetails getClickedElementDetails() {
        return clickedElementDetails;
    }       
    
}
