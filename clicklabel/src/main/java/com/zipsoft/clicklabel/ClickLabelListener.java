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

import com.vaadin.util.ReflectTools;
import java.lang.reflect.Method;

/**
 *
 * @author marko
 */
public interface ClickLabelListener {
    
    static Method METHOD = ReflectTools.findMethod(ClickLabelListener.class, "onLabelClick", ClickLabelEvent.class);
    
    public void onLabelClick(ClickLabelEvent event);
    
}
