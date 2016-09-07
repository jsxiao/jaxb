package com.ilwllc.sgerke.jaxb;

import javax.xml.bind.annotation.XmlElement;

public class Location {
	
	private String locationkey = null;
	public String getLocationKey() {
		return locationkey;
	}
	@XmlElement(name = "location-key")
	public void setLocationKey(String locationkey) {
		this.locationkey = locationkey;
	}


	private Point point = null;
	public Point getPoint() {
		return point;
	}
	@XmlElement
	public void setPoint(Point point) {
		this.point = point;
	}

	
}
