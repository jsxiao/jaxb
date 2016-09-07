package com.ilwllc.sgerke.jaxb;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class TimeLayout {

	private String timecoordinate;
	public String getTimecoordinate() {
		return timecoordinate;
	}
	@XmlAttribute(name = "time-coordinate")
	public void setTimecoordinate(String timecoordinate) {
		this.timecoordinate = timecoordinate;
	}
	
	
	private String summarization;
	public String getSummarization() {
		return summarization;
	}
	@XmlAttribute
	public void setSummarization(String summarization) {
		this.summarization = summarization;
	}
	
	
	private String layoutKey;
	public String getLayoutKey() {
		return layoutKey;
	}
	@XmlElement(name = "layout-key")
	public void setLayoutKey(String layoutKey) {
		this.layoutKey = layoutKey;
	}
	
	
	private List<String> startValidTime;
	public List<String> getStartValidTime() {
		return startValidTime;
	}
	@XmlElement(name = "start-valid-time")
	public void setStartValidTime(List<String> startValidTime) {
		this.startValidTime = startValidTime;
	}
	
	
	private List<String> endValidTime;
	public List<String> getEndValidTime() {
		return endValidTime;
	}
	@XmlElement(name = "end-valid-time")
	public void setEndValidTime(List<String> endValidTime) {
		this.endValidTime = endValidTime;
	}

}
