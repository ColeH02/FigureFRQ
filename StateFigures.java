package com.company;

public class StateFigures {
    int sum=0;
    public void insert(Figure figure){
        sum+=figure.getDeaths();
    }
    public int getTotalDeaths(){
        return sum;
    }
}
