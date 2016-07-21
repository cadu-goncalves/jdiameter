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

package org.jdiameter.api.slg.events;

/**
 * @author fernando.mendioroz@telestax.com (Fernando Mendioroz)
 *
 */

/*
 * As for 3GPP TS 29.172 v13.0.0, Subscriber Location Report operation is used by an MME or SGSN to provide the location of a
 * target UE to a GMLC, when a request for location has been implicitly issued or when a Delayed Location Reporting is triggered
 * after receipt of a request for location for a UE transiently not reachable.
 * 
 * The Location-Report-Answer (LRA) command, indicated by the Command-Code field set to 8388621 and the �R� bit cleared in the
 * Command Flags field, is sent by the GMLC to the MME or SGSN in response to the Location-Report-Request command (Subscriber
 * Location Report operation answer)
 */

public interface LocationReportAnswer {

    public static final String _SHORT_NAME = "LRA";
    public static final String _LONG_NAME = "Location-Report-Answer";

    public static final int code = 8388621;

}