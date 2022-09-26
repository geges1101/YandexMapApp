package com.example.mapkitApp.model;

public class mapPoint{
    private String[] coordinates;
    private String name;
    private String address;

    public String[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    private String rating;
    private String hours;

    public mapPoint(String coordinates, String name,
                    String address, String rating, String hours){
        this.coordinates = coordinates.split(" ");
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.hours = hours;
    }
}