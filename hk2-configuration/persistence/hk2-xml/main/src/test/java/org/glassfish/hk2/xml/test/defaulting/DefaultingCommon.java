/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
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

import java.net.URL;

import javax.xml.namespace.QName;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.configuration.hub.api.Hub;
import org.glassfish.hk2.xml.api.XmlHk2ConfigurationBean;
import org.glassfish.hk2.xml.api.XmlRootHandle;
import org.glassfish.hk2.xml.api.XmlService;
import org.glassfish.hk2.xml.test.beans.DomainBean;
import org.glassfish.hk2.xml.test.beans.SSLManagerBean;
import org.glassfish.hk2.xml.test.beans.SecurityManagerBean;
import org.glassfish.hk2.xml.test.dynamic.merge.MergeTest;
import org.junit.Assert;

/**
 * @author jwells
 *
 */
public class DefaultingCommon {
private final static String DEFAULTING_FILE = "defaulted.xml";
    
    /**
     * Tests that we can default values with JAXB 
     * @throws Exception
     */
    public void testDefaultedValues(XmlService xmlService) throws Exception {
        URL url = getClass().getClassLoader().getResource(DEFAULTING_FILE);
        
        XmlRootHandle<DefaultedBean> rootHandle = xmlService.unmarshal(url.toURI(), DefaultedBean.class);
        DefaultedBean db = rootHandle.getRoot();
        
        XmlHk2ConfigurationBean asBean = (XmlHk2ConfigurationBean) db;
        Assert.assertFalse(asBean._isSet("int-prop"));
        Assert.assertFalse(asBean._isSet("long-prop"));
        Assert.assertFalse(asBean._isSet("short-prop"));
        Assert.assertFalse(asBean._isSet("byte-prop"));
        Assert.assertFalse(asBean._isSet("boolean-prop"));
        Assert.assertFalse(asBean._isSet("char-prop"));
        Assert.assertFalse(asBean._isSet("float-prop"));
        Assert.assertFalse(asBean._isSet("double-prop"));
        Assert.assertFalse(asBean._isSet("string-prop"));
        Assert.assertFalse(asBean._isSet("qname-prop"));
        
        Assert.assertEquals(13, db.getIntProp());
        Assert.assertEquals(13L, db.getLongProp());
        Assert.assertEquals((byte) 13, db.getByteProp());
        Assert.assertEquals(true, db.isBooleanProp());
        Assert.assertEquals((short) 13, db.getShortProp());
        Assert.assertEquals('f', db.getCharProp());
        Assert.assertEquals(0, Float.compare((float) 13.00, db.getFloatProp()));
        Assert.assertEquals(0, Double.compare(13.00, db.getDoubleProp()));
        Assert.assertEquals("13", db.getStringProp());
        Assert.assertEquals(new QName("http://qwerty.com/qwerty", "foo", "xyz"), db.getQNameProp());
        
        // Now set them all to the default values and make sure "isSet" works properly
        // db.setIntProp(13); we will have to trust that this one works
        db.setLongProp(13L);
        db.setByteProp((byte) 13);
        db.setBooleanProp(true);
        db.setShortProp((short) 13); 
        db.setCharProp('f');
        db.setFloatProp((float) 13.00);
        db.setDoubleProp(13.00);
        db.setStringProp("13");
        db.setQNameProp(new QName("http://qwerty.com/qwerty", "foo", "xyz"));
        
        // Check the SET default values (for completeness)
        Assert.assertEquals(13, db.getIntProp());
        Assert.assertEquals(13L, db.getLongProp());
        Assert.assertEquals((byte) 13, db.getByteProp());
        Assert.assertEquals(true, db.isBooleanProp());
        Assert.assertEquals((short) 13, db.getShortProp());
        Assert.assertEquals('f', db.getCharProp());
        Assert.assertEquals(0, Float.compare((float) 13.00, db.getFloatProp()));
        Assert.assertEquals(0, Double.compare(13.00, db.getDoubleProp()));
        Assert.assertEquals("13", db.getStringProp());
        Assert.assertEquals(new QName("http://qwerty.com/qwerty", "foo", "xyz"), db.getQNameProp());
        
        // First one still false, need to test this without a setter
        Assert.assertFalse(asBean._isSet("int-prop"));
        
        // But all the rest should be true now
        Assert.assertTrue(asBean._isSet("long-prop"));
        Assert.assertTrue(asBean._isSet("short-prop"));
        Assert.assertTrue(asBean._isSet("byte-prop"));
        Assert.assertTrue(asBean._isSet("boolean-prop"));
        Assert.assertTrue(asBean._isSet("char-prop"));
        Assert.assertTrue(asBean._isSet("float-prop"));
        Assert.assertTrue(asBean._isSet("double-prop"));
        Assert.assertTrue(asBean._isSet("string-prop"));
        Assert.assertTrue(asBean._isSet("qname-prop"));
    }
    
    /**
     * Tests that we can default values with JAXB 
     * @throws Exception
     */
    public void testDefaultDefaultedValues(XmlService xmlService) throws Exception {
        URL url = getClass().getClassLoader().getResource(DEFAULTING_FILE);
        
        XmlRootHandle<DefaultedBean> rootHandle = xmlService.unmarshal(url.toURI(), DefaultedBean.class);
        DefaultedBean db = rootHandle.getRoot();
        
        Assert.assertEquals(0, db.getDefaultIntProp());
        Assert.assertEquals(0L, db.getDefaultLongProp());
        Assert.assertEquals((byte) 0, db.getDefaultByteProp());
        Assert.assertEquals(false, db.isDefaultBooleanProp());
        Assert.assertEquals((short) 0, db.getDefaultShortProp());
        Assert.assertEquals((char) 0, db.getDefaultCharProp());
        Assert.assertEquals(0, Float.compare((float) 0.00, db.getDefaultFloatProp()));
        Assert.assertEquals(0, Double.compare(0.00, db.getDefaultDoubleProp()));
        Assert.assertEquals(null, db.getDefaultStringProp());
        Assert.assertNull(db.getDefaultQNameProp());
    }
    
    /**
     * Tests that defaults work in a dynamically created bean
     */
    public void testCanGetValuesFromDynamicallyCreatedBean(XmlService xmlService) {
        DefaultedBean db = xmlService.createBean(DefaultedBean.class);
        
        Assert.assertEquals(13, db.getIntProp());
        Assert.assertEquals(13L, db.getLongProp());
        Assert.assertEquals((byte) 13, db.getByteProp());
        Assert.assertEquals(true, db.isBooleanProp());
        Assert.assertEquals((short) 13, db.getShortProp());
        Assert.assertEquals('f', db.getCharProp());
        Assert.assertEquals(0, Float.compare((float) 13.00, db.getFloatProp()));
        Assert.assertEquals(0, Double.compare(13.00, db.getDoubleProp()));
        Assert.assertEquals("13", db.getStringProp());
        
        Assert.assertEquals(0, db.getDefaultIntProp());
        Assert.assertEquals(0L, db.getDefaultLongProp());
        Assert.assertEquals((byte) 0, db.getDefaultByteProp());
        Assert.assertEquals(false, db.isDefaultBooleanProp());
        Assert.assertEquals((short) 0, db.getDefaultShortProp());
        Assert.assertEquals((char) 0, db.getDefaultCharProp());
        Assert.assertEquals(0, Float.compare((float) 0.00, db.getDefaultFloatProp()));
        Assert.assertEquals(0, Double.compare(0.00, db.getDefaultDoubleProp()));
        Assert.assertEquals(null, db.getDefaultStringProp());
        
    }
    
    /**
     * Ensures that we can default beans via an InstanceLifecycleListener
     * 
     * @throws Exception
     */
    public void testDefaultingViaServiceWorks(ServiceLocator locator, XmlService xmlService) throws Exception {
        Hub hub = locator.getService(Hub.class);
        
        URL url = getClass().getClassLoader().getResource(MergeTest.DOMAIN1_FILE);
        
        XmlRootHandle<DomainBean> rootHandle = xmlService.unmarshal(url.toURI(), DomainBean.class);
        
        MergeTest.verifyDomain1Xml(rootHandle, hub, locator, true);
        
        SecurityManagerBean smb = locator.getService(SecurityManagerBean.class);
        Assert.assertNotNull(smb);
        
        Assert.assertNotNull(smb.getSSLManager());
        
        Assert.assertNotNull(locator.getService(SSLManagerBean.class));
    }
    
    /**
     * Ensures that we can default beans via an InstanceLifecycleListener
     * 
     * @throws Exception
     */
    public void testDefaultingViaAddWorks(ServiceLocator locator, XmlService xmlService) throws Exception {
        Hub hub = locator.getService(Hub.class);
        
        URL url = getClass().getClassLoader().getResource(MergeTest.DOMAIN1_FILE);
        
        XmlRootHandle<DomainBean> rootHandle = xmlService.unmarshal(url.toURI(), DomainBean.class);
        
        MergeTest.verifyDomain1Xml(rootHandle, hub, locator, true);
        
        DomainBean domain = rootHandle.getRoot();
        
        // Removes the securityManager
        domain.setSecurityManager(null);
        
        // Just makes sure the SSLManager added as a default is gone
        Assert.assertNull(locator.getService(SSLManagerBean.class));
        
        SecurityManagerBean smb = xmlService.createBean(SecurityManagerBean.class);
        
        domain.setSecurityManager(smb);
        
        smb = domain.getSecurityManager();
        Assert.assertNotNull(smb);
        
        // For this test to fail properly this MUST be before the lookup in the locator
        Assert.assertNotNull(smb.getSSLManager());
        Assert.assertNotNull(locator.getService(SecurityManagerBean.class));
        
        Assert.assertNotNull(smb.getSSLManager());
        Assert.assertNotNull(locator.getService(SSLManagerBean.class));
    }

}
