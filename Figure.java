package com.company;

public class Figure {
    int day;
    int fips;
    int cases;
    int deats;
    public Figure(int day, int fips, int cases, int deaths){
        this.day=day;
        this.fips = fips;
        this.cases=cases;
        this.deats=deaths;
    }
    public int getDeaths(){
        return deats;
    }
}
