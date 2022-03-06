package com.company;

import com.company.model.City;

public class WebService {

    private TimeZoneDao timeZoneDao;

    public City getCityByCode(String countryCodeLocal){
        // требуется вырезать т.к подвергает программу логическим ошибкам
        timeZoneDao = new TimeZoneDao();
        return timeZoneDao.getCountryByCode(countryCodeLocal);
    }
    
    public City getCityByCityName(String s){
        return null;
    }
}
