package com.company;

import com.company.model.City;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@WebService
public class TimeZoneWebService {

    private TimeZoneDao timeZoneDao = new TimeZoneDao();

    @WebMethod
    public List<City> getListCityByCode(String countryCodeLocal){
        // требуется вырезать т.к подвергает программу логическим ошибкам
        return timeZoneDao.getListCityByCode(countryCodeLocal);
    }

    @WebMethod
    public City getCityByCityName(String s) {
        List<City> ret = timeZoneDao.getListCity();
        for (City city : ret) {
            if (city.cityName.equals(s)) {
                return city;
            }
        }
        return null;
    }

    @WebMethod
    public List<City> getListCityByZoneName(String s) {
        List<City> ret = timeZoneDao.getListCity();
        List<City> result = new ArrayList<>();
        for (City city : ret) {
            if (city.zoneName.equals(s)) {
                result.add(city);
            }
        }
        return result;
    }

    @WebMethod
    public List<City> getListCityByZoneNameAndByCode(String zone, String code) {
        List<City> ret = timeZoneDao.getListCity();
        List<City> result = new ArrayList<>();
        for (City city : ret) {
            if (city.zoneName.equals(zone) && city.countryCode.equals(code.toUpperCase(Locale.ROOT))) {
                result.add(city);
            }
        }
        return result;
    }

}
