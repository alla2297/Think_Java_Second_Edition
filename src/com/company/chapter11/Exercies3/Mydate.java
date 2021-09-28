package com.company.chapter11.Exercies3;

public class Mydate {
    private int year;
    private int mount;
    private int day;

    public Mydate(){
        this.year=2021;
        this.mount=9;
        this.day=28;
    }

    public Mydate(int year, int mount, int day){
         this.year=year;
         this.mount=mount;
         this.day=day;

    }
    public String toString(){
        return "Date: "+"year:" + year+" mount:"+ mount+" day:"+day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year){
            this.year =year;
    }

    public int getMount() {
        return mount;
    }
    public void setMount(int mount){
        this.mount =mount;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day){
        this.day =day;
    }
}
