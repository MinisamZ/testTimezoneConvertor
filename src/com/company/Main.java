package com.company;

import com.company.model.City;

public class Main {

    public static void main(String[] args) {
        TimeZoneDao timeZoneDao = new TimeZoneDao();
        timeZoneDao.checkCon();
        WebService webService = new WebService();
        City city = webService.getCityByCode("KZ");
        System.out.println(city.toString2());

        // write your code here
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
//        System.out.println(sdf.format(496803600));
    }
}
