package com.google.sps.data;

public class JsonData
{
    private final String brand;
    private final String model;
    private final String color;
    private final int year;

    public JsonData(String brand, String model, String color, int year)
    {
        this.brand  = brand ;
        this.model = model;
        this.color = color;
        this.year  = year ;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public String getModel()
    {
        return this.model;
    }

    public String getColor()
    {
        return this.color;
    }

    public int getYear()
    {
        return this.year;
    }
}