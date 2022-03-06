package com.company;

import com.company.model.City;

import java.util.List;

public class WebService {

    private TimeZoneDao timeZoneDao = new TimeZoneDao();

    public List<City> getListCityByCode(String countryCodeLocal){
        // требуется вырезать т.к подвергает программу логическим ошибкам
        return timeZoneDao.getListCityByCode(countryCodeLocal);
    }

    public City getCityByCityName(String s){
        List<City> ret = timeZoneDao.getListCity();
        for (City city : ret) {
            if (city.cityName.equals(s)) {
                return city;
            }
        }
        return null;
    }
}
