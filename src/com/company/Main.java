package com.company;

import com.company.model.City;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TimeZoneDao timeZoneDao = new TimeZoneDao();
        timeZoneDao.checkCon();
        WebService webService = new WebService();
        List<City> city = webService.getListCityByCode("KZ");
        System.out.println(city.get(2).toString2());
        System.out.println(webService.getCityByCityName("London").toString2());
        // write your code here
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
//        System.out.println(sdf.format(496803600));
    }
}
