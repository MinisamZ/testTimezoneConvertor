package com.company.model;

public class City {
    public String countryCode;
    public String zoneName;
    public String cityName;
    public String gmtOffset;

    @Override
    public String toString() {
        return "City{" +
                "countryCode='" + countryCode + '\'' +
                ", zoneName='" + zoneName + '\'' +
                ", city='" + cityName + '\'' +
                ", gmtOffset='" + gmtOffset + '\'' +
                '}';
    }

    public String toString2() {
        return " City:" +
                "\ncountry code: " + countryCode +
                "\nzone name: " + zoneName +
                "\ncity name: " + cityName +
                "\nUTC: " + gmtOffset;
    }
}
