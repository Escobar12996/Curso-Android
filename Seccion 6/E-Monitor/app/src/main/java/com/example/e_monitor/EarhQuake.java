package com.example.e_monitor;

public class EarhQuake {

    private String magnitude;
    private String place;

    public EarhQuake() {
    }

    public EarhQuake(String magnitude, String place) {
        this.magnitude = magnitude;
        this.place = place;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
