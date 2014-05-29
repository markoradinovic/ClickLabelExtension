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

package com.zipsoft.clicklabel.client.shared;

import java.io.Serializable;

/**
 *
 * @author marko
 */
public class ClickedElementDetails implements Serializable {
    
    private String id;
    
    private String tagName;
    
    private String className;
        
    private String html;
    
    private String innerHtml;
    
    private String innerText;
    
    public ClickedElementDetails() {
        
    }

    /**
     * 
     * @param id
     * @param tagName
     * @param className
     * @param html
     * @param innerHtml
     * @param innerText 
     */
    public ClickedElementDetails(String id, String tagName, String className, String html, String innerHtml, String innerText) {
        this.id = id;
        this.tagName = tagName;
        this.className = className;
        this.html = html;
        this.innerHtml = innerHtml;
        this.innerText = innerText;
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName the tagName to set
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the html
     */
    public String getHtml() {
        return html;
    }

    /**
     * @param html the html to set
     */
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * @return the innerHtml
     */
    public String getInnerHtml() {
        return innerHtml;
    }

    /**
     * @param innerHtml the innerHtml to set
     */
    public void setInnerHtml(String innerHtml) {
        this.innerHtml = innerHtml;
    }

    /**
     * @return the innerText
     */
    public String getInnerText() {
        return innerText;
    }

    /**
     * @param innerText the innerText to set
     */
    public void setInnerText(String innerText) {
        this.innerText = innerText;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 79 * hash + (this.tagName != null ? this.tagName.hashCode() : 0);
        hash = 79 * hash + (this.className != null ? this.className.hashCode() : 0);        
        hash = 79 * hash + (this.html != null ? this.html.hashCode() : 0);
        hash = 79 * hash + (this.innerHtml != null ? this.innerHtml.hashCode() : 0);
        hash = 79 * hash + (this.innerText != null ? this.innerText.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClickedElementDetails other = (ClickedElementDetails) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.tagName == null) ? (other.tagName != null) : !this.tagName.equals(other.tagName)) {
            return false;
        }
        if ((this.className == null) ? (other.className != null) : !this.className.equals(other.className)) {
            return false;
        }
        if ((this.html == null) ? (other.html != null) : !this.html.equals(other.html)) {
            return false;
        }
        if ((this.innerHtml == null) ? (other.innerHtml != null) : !this.innerHtml.equals(other.innerHtml)) {
            return false;
        }
        if ((this.innerText == null) ? (other.innerText != null) : !this.innerText.equals(other.innerText)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClickedElementDetails{" + "id=" + id + ", tagName=" + tagName + ", className=" + className + ", html=" + html + ", innerHtml=" + innerHtml + ", innerText=" + innerText + '}';
    }
    
    
    
}
