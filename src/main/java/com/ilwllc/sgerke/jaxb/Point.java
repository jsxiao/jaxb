package com.ilwllc.sgerke.jaxb;

import javax.xml.bind.annotation.XmlElement;

public class Point {
	
	private String latitude = null;
	public String getLatitude() {
		return latitude;
	}
	@XmlElement
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
	private String longitude = null;
	public String getLongitude() {
		return longitude;
	}
	@XmlElement
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
