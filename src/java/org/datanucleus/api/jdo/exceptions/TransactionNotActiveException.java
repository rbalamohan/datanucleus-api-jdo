/**********************************************************************
Copyright (c) 2002 Mike Martin (TJDO) and others. All rights reserved. 
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
2002 Kelly Grizzle (TJDO)
2003 Andy Jefferson - commented and localised.
    ...
**********************************************************************/
package org.datanucleus.api.jdo.exceptions;

import javax.jdo.JDOUserException;

import org.datanucleus.util.Localiser;

/**
 * An <tt>TransactionNotActiveException</tt> is thrown if a transaction is not
 * active and an operation is performed that requires that a transaction be
 * active (such as committing a transaction).
 */
public class TransactionNotActiveException extends JDOUserException
{
    private static final Localiser LOCALISER=Localiser.getInstance("org.datanucleus.Localisation",
        org.datanucleus.ClassConstants.NUCLEUS_CONTEXT_LOADER);

    /**
     * Constructor.
     */
    public TransactionNotActiveException()
    {
        super(LOCALISER.msg("015035"));
    }

    /**
     * Constructor.
     * @param message the localized error message
     * @param failedObject the failed object
     */
    public TransactionNotActiveException(String message, Object failedObject)
    {
        super(message,failedObject);
    }
}
