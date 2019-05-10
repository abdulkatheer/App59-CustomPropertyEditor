package org.katheer.bean;

public class Address {
    private String hno;
    private String street;
    private String village;
    private String district;
    private String state;
    private String pin;

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void printAddress() {
        System.out.println("Address");
        System.out.println("-------");
        System.out.println(this.getHno() + ", " + this.getStreet() + ",");
        System.out.println(this.getVillage() + ", " + this.getDistrict() + ",");
        System.out.println(this.getState() + ". PIN : " + this.getPin());
    }
}
