/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.jackrabbit.rmi.server.principal;

import java.rmi.RemoteException;
import java.security.Principal;
import java.util.Iterator;
import org.apache.jackrabbit.commons.iterator.RangeIteratorAdapter;
import org.apache.jackrabbit.rmi.server.RemoteAdapterFactory;
import org.apache.jackrabbit.rmi.server.iterator.ServerIterator;

@Deprecated(forRemoval = true) public class ServerPrincipalIterator extends ServerIterator {

    public ServerPrincipalIterator(Iterator<Principal> iterator,
            RemoteAdapterFactory factory, int maxBufferSize)
            throws RemoteException {
        super(new RangeIteratorAdapter(iterator), factory, maxBufferSize);
    }

    /**
     * {@inheritDoc}
     */
    protected Object getRemoteObject(Object object) throws RemoteException {
        return getFactory().getRemotePrincipal((Principal) object);
    }
}
