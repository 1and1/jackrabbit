/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.rmi.server.security;

import java.rmi.RemoteException;

import javax.jcr.security.AccessControlEntry;

import org.apache.jackrabbit.rmi.remote.principal.RemotePrincipal;
import org.apache.jackrabbit.rmi.remote.security.RemoteAccessControlEntry;
import org.apache.jackrabbit.rmi.remote.security.RemotePrivilege;
import org.apache.jackrabbit.rmi.server.RemoteAdapterFactory;
import org.apache.jackrabbit.rmi.server.ServerObject;

@Deprecated(forRemoval = true) public class ServerAccessControlEntry extends ServerObject implements
        RemoteAccessControlEntry {

    private final AccessControlEntry ace;

    public ServerAccessControlEntry(final AccessControlEntry ace,
            final RemoteAdapterFactory factory) throws RemoteException {
        super(factory);
        this.ace = ace;
    }

    public RemotePrincipal getPrincipal() throws RemoteException {
        return getFactory().getRemotePrincipal(ace.getPrincipal());
    }

    public RemotePrivilege[] getPrivileges() throws RemoteException {
        return getFactory().getRemotePrivilege(ace.getPrivileges());
    }

    AccessControlEntry getAccessControlEntry() {
        return ace;
    }
}
