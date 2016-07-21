/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jdiameter.common.api.app.slg;

import org.jdiameter.api.app.AppSession;
import org.jdiameter.api.app.StateChangeListener;
import org.jdiameter.api.slg.ClientSLgSessionListener;
import org.jdiameter.api.slg.ServerSLgSessionListener;
import org.jdiameter.common.api.app.slg.ISLgMessageFactory;

/**
 * @author fernando.mendioroz@telestax.com (Fernando Mendioroz)
 *
 */

public interface ISLgSessionFactory {

    /**
     * Get stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
     * However clustered session use this value when recreated!
     *
     * @return the serverSessionListener
     */
    public ServerSLgSessionListener getServerSessionListener();

    /**
     * Set stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
     * However clustered session use this value when recreated!
     *
     * @param serverSessionListener the serverSessionListener to set
     */
    public void setServerSessionListener(ServerSLgSessionListener serverSessionListener);

    /**
     * Get stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
     * However clustered session use this value when recreated!
     *
     * @return the clientSessionListener
     */
    public ClientSLgSessionListener getClientSessionListener();

    /**
     * Set stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
     * However clustered session use this value when recreated!
     *
     * @param clientSessionListener the clientSessionListener to set
     */
    public void setClientSessionListener(ClientSLgSessionListener clientSessionListener);

    /**
     * @return the messageFactory
     */
    public ISLgMessageFactory getMessageFactory();

    /**
     * @param messageFactory the messageFactory to set
     */
    public void setMessageFactory(ISLgMessageFactory messageFactory);

    /**
     * @return the stateListener
     */
    public StateChangeListener<AppSession> getStateListener();

    /**
     * @param stateListener the stateListener to set
     */
    public void setStateListener(StateChangeListener<AppSession> stateListener);
}
