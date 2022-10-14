package com.training.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Weather {
   private String city;
   private double maxTemp;
   private double minTemp;
   private double humidity;
public Weather() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getMaxTemp() {
	return maxTemp;
}
public void setMaxTemp(double maxTemp) {
	this.maxTemp = maxTemp;
}
public double getMinTemp() {
	return minTemp;
}
public void setMinTemp(double minTemp) {
	this.minTemp = minTemp;
}
public double getHumidity() {
	return humidity;
}
public void setHumidity(double humidity) {
	this.humidity = humidity;
}
public Weather(String city, double maxTemp, double minTemp, double humidity) {
	super();
	this.city = city;
	this.maxTemp = maxTemp;
	this.minTemp = minTemp;
	this.humidity = humidity;
}
@Override
public String toString() {
	return "Weather [city=" + city + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + ", humidity=" + humidity + "]";
}
   
}
