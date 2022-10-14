package com.training.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherWrapper {
	private List<Weather> list;

	public WeatherWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Weather> getList() {
		return list;
	}

	public void setList(List<Weather> list) {
		this.list = list;
	}

	public WeatherWrapper(List<Weather> list) {
		super();
		this.list = list;
	}
	

}
