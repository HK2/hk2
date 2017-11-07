/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2015-2017 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.glassfish.hk2.xml.test.defaulting;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

import org.jvnet.hk2.annotations.Contract;

/**
 * @author jwells
 *
 */
@XmlRootElement(name="defaulted-bean",
  namespace="http://hk2.java.net/hk2-xml/test/defaulting") @Contract
public interface DefaultedBean {
    /**
     * This one has no setter
     * @return
     */
    @XmlElement(name="int-prop", defaultValue="13")
    public int getIntProp();
    
    /**
     * This one has a setter
     * JAXB annotation on the getter
     * @return
     */
    @XmlElement(name="long-prop", defaultValue="13")
    public long getLongProp();
    public void setLongProp(long prop);
    
    /**
     * This one has a setter
     * JAXB annotation on the setter
     * @return
     */
    @XmlElement(name="short-prop", defaultValue="13")
    public void setShortProp(short prop);
    public short getShortProp();
    
    @XmlElement(name="byte-prop", defaultValue="13")
    public void setByteProp(byte prop);
    public byte getByteProp();
    
    @XmlElement(name="boolean-prop", defaultValue="true")
    public boolean isBooleanProp();
    public void setBooleanProp(boolean prop);
    
    @XmlElement(name="char-prop", defaultValue="f")
    public char getCharProp();
    public void setCharProp(char prop);
    
    @XmlElement(name="float-prop", defaultValue="13.00")
    public float getFloatProp();
    public void setFloatProp(float prop);
    
    @XmlElement(name="double-prop", defaultValue="13.00")
    public double getDoubleProp();
    public void setDoubleProp(double prop);
    
    @XmlElement(name="string-prop", defaultValue="13")
    public String getStringProp();
    public void setStringProp(String prop);
    
    @XmlElement(name="qname-prop", defaultValue="xyz:foo")
    public QName getQNameProp();
    public void setQNameProp(QName qname);
    
    @XmlElement(name="color", defaultValue="GREEN")
    public Colors getColor();
    public void setColor(Colors color);
    
    // Below are testing the default defaults which should all be zero
    
    public int getDefaultIntProp();
    public long getDefaultLongProp();
    public short getDefaultShortProp();
    public byte getDefaultByteProp();
    public boolean isDefaultBooleanProp();
    public char getDefaultCharProp();
    public float getDefaultFloatProp();
    public double getDefaultDoubleProp();
    public String getDefaultStringProp();
    public QName getDefaultQNameProp();
    public Colors getDefaultColor();
}
