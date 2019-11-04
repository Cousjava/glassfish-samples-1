/*
 	Copyright (c) 2019 Oracle and/or its affiliates. All rights reserved.
	
	This program and the accompanying materials are made available under the
	terms of the Eclipse Public License v. 2.0, which is available at
	http://www.eclipse.org/legal/epl-2.0.
	
	This Source Code may also be made available under the following Secondary
	Licenses when the conditions for such availability set forth in the
	Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
	version 2 with the GNU Classpath Exception, which is available at
	https://www.gnu.org/software/classpath/license.html.
	
	SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples.twitter.api;

import javax.inject.Named;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author arungup
 */
@XmlRootElement
@Named
public class Trends {
    private Locations[] locations;
    private String as_of;
    private Trend[] trends;
    private String created_at;

    public String getAs_of() {
        return as_of;
    }

    public void setAs_of(String as_of) {
        this.as_of = as_of;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Locations[] getLocations() {
        return locations;
    }

    public void setLocations(Locations[] locations) {
        this.locations = locations;
    }

    public Trend[] getTrends() {
        return trends;
    }

    public void setTrends(Trend[] trends) {
        this.trends = trends;
    }
    
    
}