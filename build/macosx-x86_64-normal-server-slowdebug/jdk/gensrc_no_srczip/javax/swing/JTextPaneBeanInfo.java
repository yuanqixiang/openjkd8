/*
 * Copyright (c) 1998, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javax.swing;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.awt.Image;

import sun.swing.BeanInfoUtils;

/**
 * Descriptive information about the JTextPane class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTextPane properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTextPaneBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTextPane = javax.swing.JTextPane.class;

    /**
     * @return a JTextPane BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTextPane,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.TRUE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A text component that can be marked up with attributes that are graphically represented."
        });
    }


    /**
     * Create a JTextPane PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTextPane.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTextPane PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTextPane, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTextPane.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTextPane
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("characterAttributes", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "characterAttributes",
               }
             ),
             
             createPropertyDescriptor("inputAttributes", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "inputAttributes",
               }
             ),
             
             createPropertyDescriptor("logicalStyle", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "logicalStyle",
               }
             ),
             
             createPropertyDescriptor("paragraphAttributes", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "paragraphAttributes",
               }
             ),
             
             createPropertyDescriptor("styledDocument", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "styledDocument",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JTextPane
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTextPaneColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTextPaneColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTextPaneMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTextPaneMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


