package com.ilwllc.sgerke.jaxb;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Parameters {

		private String applicableLocation = null;
		public String getApplicableLocation() {
			return applicableLocation;
		}
		@XmlAttribute(name = "applicable-location")
		public void setApplicableLocation(String applicableLocation) {
			this.applicableLocation = applicableLocation;
		}
		
		
		private List<Temperature> temperature = null;
		public List<Temperature> getTemperature() {
			return temperature;
		}
		@XmlElement
		public void setTemperature(List<Temperature> temperature) {
			this.temperature = temperature;
		}

}
