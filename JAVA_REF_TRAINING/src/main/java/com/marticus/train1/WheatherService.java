package com.marticus.train1;

public interface WheatherService {
//	Create an Interface WeatherService having two methods
//	String getTodaysForeCast(String pinCode)
//	String getTomorrowsForeCast(String pinCode)
//
//	Create a class called IndianWeatherService implementing interfaces WeatherService
//	       the functions will return values based on some hardcoded pincodes.like if pincode ==700078 will return cloudy . Will have status like cloudy,sunny,rain etc
//
//	3. In the test class instantiate IndianWeatherService class object and call the methods to get today’s forecast or tomorrow’s forecast by passing different PIN codes
//
	public String getTodaysForeCast(String l);
	public String getTomorrowsForeCast(String i);
	
}

