/******************************************************************
Copyright (c) 2007 Erik Bengtson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 

Contributors:
    ...
*****************************************************************/
package org.datanucleus.api.jdo.metadata.xml;

import junit.framework.TestCase;

import org.datanucleus.NucleusContext;
import org.datanucleus.PersistenceNucleusContextImpl;
import org.datanucleus.api.jdo.metadata.JDOMetaDataManager;
import org.datanucleus.exceptions.NucleusException;
import org.datanucleus.metadata.xml.MetaDataParser;

public class MetaDataParserTest extends TestCase
{
    public void testParseMetaDataURLnullURL()
    {
        NucleusContext nucCtx = new PersistenceNucleusContextImpl("JDO", null);
        MetaDataParser parser = new MetaDataParser(new JDOMetaDataManager(nucCtx), nucCtx.getPluginManager(), true, true);
        try
        {
            parser.parseMetaDataURL(null, "jdo");
            fail("expected JPOXException");
        }
        catch(NucleusException ex)
        {
            //expected
        }
    }

    public void testParseMetaDataURLnullhandler()
    {
        NucleusContext nucCtx = new PersistenceNucleusContextImpl("JDO", null);
        MetaDataParser parser = new MetaDataParser(new JDOMetaDataManager(nucCtx), nucCtx.getPluginManager(), true, true);
        try
        {
            parser.parseMetaDataURL(getClass().getResource("/org/datanucleus/api/jdo/metadata/xml/package2.jdo"), null);
            fail("expected JPOXException");
        }
        catch(NucleusException ex)
        {
            //expected
        }
    }
}
