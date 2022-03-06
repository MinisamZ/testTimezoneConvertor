package com.company;

import com.company.model.City;

import java.util.List;

public class WebService {

    private TimeZoneDao timeZoneDao = new TimeZoneDao();

    public List<City> getListCityByCode(String countryCodeLocal){
        // требуется вырезать т.к подвергает программу логическим ошибкам
        timeZoneDao = new TimeZoneDao();
        return timeZoneDao.getListCityByCode(countryCodeLocal);
    }

    public City getCityByCityName(String s){

        return null;
    }
}
