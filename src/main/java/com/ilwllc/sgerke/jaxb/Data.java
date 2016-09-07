package com.ilwllc.sgerke.jaxb;

import java.util.List;
import java.net.URL;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Data {
	
	private Location location = null;
	public Location getLocation() {
		return location;
	}
	@XmlElement
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	private List<TimeLayout> timeLayouts = null;
	public List<TimeLayout> getTimeLayouts() {
		return timeLayouts;
	}
	@XmlElement(name = "time-layout")
	public void setTimeLayouts(List<TimeLayout> timeLayouts) {
		this.timeLayouts = timeLayouts;
	}
	
	
	private List<Parameters> parameters = null;
	public List<Parameters> getParameters() {
		return parameters;
	}
	@XmlElement
	public void setParameters(List<Parameters> parameters) {
		this.parameters = parameters;
	}
	
	
	private URL moreweatherinformation;
	public URL getMoreWeatherInformation() {
		return moreweatherinformation;
	}
	@XmlElement
	public void setMoreWeatherInformation(URL moreweatherinformation) {
		this.moreweatherinformation = moreweatherinformation;
	}
	/*
	private String moreweatherinformation;
	public String getMoreWeatherInformation() {
		return moreweatherinformation;
	}
	@XmlElement
	public void setMoreWeatherInformation(String moreweatherinformation) {
		this.moreweatherinformation = moreweatherinformation;
	}	
	*/
	
	
	private String applicablelocation;
	public String getApplicablelocation() {
		return applicablelocation;
	}
	@XmlAttribute
	public void setApplicablelocation(String applicablelocation) {
		this.applicablelocation = applicablelocation;
	}
	
}
