package com.training.ifaces;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.training.model.Weather;
import com.training.model.WeatherWrapper;

@WebService
@SOAPBinding(style=Style.RPC)
public interface WeatherService {
	public Weather getWeatherByCity(String cityName);
    public WeatherWrapper getWeatherByState(String stateName);



}
