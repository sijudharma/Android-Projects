package com.e.carfax;

public class CarDetails {
    String model;
    String year;
    String make;
    String trim;
    String mileage;
    String Currentprice;
    String image;
    String location;
    String phonenumber;
    String exteriorColor;
    String interiorColor;
    String engine;
    String drivetype;
    String transmission;
    String fuel;
    String bodytype;
    String state;

    public CarDetails(String model, String year, String make, String trim,
                      String mileage, String currentprice, String image,
                      String location, String phonenumber, String exteriorColor, String interiorColor, String engine, String drivetype, String transmission, String fuel, String bodytype, String state) {
        this.model = model;
        this.year = year;
        this.make = make;
        this.trim = trim;
        this.mileage = mileage;
        this.Currentprice = currentprice;
        this.image = image;
        this.location = location;
        this.phonenumber = phonenumber;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.engine = engine;
        this.drivetype = drivetype;
        this.transmission = transmission;
        this.fuel = fuel;
        this.bodytype = bodytype;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getCurrentprice() {
        return Currentprice;
    }

    public void setCurrentprice(String currentprice) {
        Currentprice = currentprice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
