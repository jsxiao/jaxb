package com.ilwllc.sgerke.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dwml {
	
	private String header = null;
 	public String getHeader() {
		return header;
	}
 	@XmlElement
	public void setHeader(String header) {
		this.header = header;
	}
	
	
	private Data data = null;
 	public Data getData() {
		return data;
	}
 	@XmlElement
	public void setData(Data data) {
		this.data = data;
	}

}
