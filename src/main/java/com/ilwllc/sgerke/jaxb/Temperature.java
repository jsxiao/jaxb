package com.ilwllc.sgerke.jaxb;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Temperature {

	private String type = null;
	public String getType() {
		return type;
	}
	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}
	
	
	private String units = null;
	public String getUnits() {
		return units;
	}
	@XmlAttribute
	public void setUnits(String units) {
		this.units = units;
	}
	
	
	private String timeLayout = null;
	public String getTimeLayout() {
		return timeLayout;
	}
	@XmlAttribute(name = "time-layout")
	public void setTimeLayout(String timeLayout) {
		this.timeLayout = timeLayout;
	}
	
	private String name = null;
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	
	private List<String> value = null;
	public List<String> getValue() {
		return value;
	}
	@XmlElement
	public void setValue(List<String> value) {
		this.value = value;
	}

}
