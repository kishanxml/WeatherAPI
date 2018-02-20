package com.weather.api.service;

import com.weather.api.pojo.AverageData;
import com.weather.api.entity.WeatherData;
import java.util.List;

public interface WeatherDataService {

    List<String> getCityList();

    public String getLatestProperty(String city, String propoerty);

    public  WeatherData getLatestWeather(String city);

    public List<AverageData> getHourlyWeather(String city);

    public List<AverageData> getDailyWeather(String city);

    public WeatherData create(WeatherData data);
}
