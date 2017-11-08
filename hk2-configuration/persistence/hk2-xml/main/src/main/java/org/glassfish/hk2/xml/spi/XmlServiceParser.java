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
package org.glassfish.hk2.xml.spi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import javax.xml.bind.Unmarshaller;

import org.glassfish.hk2.xml.api.XmlRootHandle;
import org.jvnet.hk2.annotations.Contract;

/**
 * If an implementation of this exists it will be used to parse the XML file rather
 * than the default implementation which uses JAXB
 * 
 * @author jwells
 */
@Contract
public interface XmlServiceParser {
    /**
     * The default Xml parsing service will have this name
     */
    public static final String DEFAULT_PARSING_SERVICE = "JAXBXmlParsingService";
    
    /**
     * A stream parsing service that does not use JAXB but an internal stream based
     * implementation
     */
    public static final String STREAM_PARSING_SERVICE = "StreamXmlParsingService";
    
    /**
     * This method must return an instance of the given class as the root of
     * an XML graph
     * 
     * @param rootModel The Model object of the root to be parsed
     * @param location The location of the file to parse
     * @param listener A listener that must be called via the contract of Unmarshaller.Listener
     * @param options optional (possibly null) options from the caller
     * @return The root object with all fields filled in from the given document
     */
    public <T> T parseRoot(Model rootModel, URI location, Unmarshaller.Listener listener, Map<String, Object> options) throws Exception;
    
    /**
     * This method must return an instance of the given class as the root of
     * an XML graph
     * 
     * @param rootModel The Model object of the root to be parsed
     * @param input A non-null input stream.  This stream will NOT be closed by this method
     * @param listener A listener that must be called via the contract of Unmarshaller.Listener
     * @param options optional (possibly null) options from the caller
     * @return The root object with all fields filled in from the given document
     */
    public <T> T parseRoot(Model rootModel, InputStream input, Unmarshaller.Listener listener, Map<String, Object> options) throws Exception;
    
    
    /**
     * This tells the system whether or not it needs to pregenerate all proxies
     * prior to parsing a document or if the proxies can be generated lazily
     * 
     * @return The value that indicates whether or not the proxies can be
     * loaded lazily or must be pre-generated prior to parsing a document
     */
    public PreGenerationRequirement getPreGenerationRequirement();
    
    /**
     * Marshalls this tree into the given stream.  Will hold the WRITE
     * lock of this tree while it does so that the tree cannot change
     * underneath while it is being written out.  It will use a basic
     * indentation and new-line scheme
     * 
     * @param outputStream A non-closed output stream.  This method will
     * not close the output stream
     * @param root The root of the tree to marshall
     * @param options optional (possibly null) options from the caller
     * @throws IOException On any exception that might happen
     */
    public <T> void marshal(OutputStream outputStream, XmlRootHandle<T> root, Map<String, Object> options) throws IOException;

}
