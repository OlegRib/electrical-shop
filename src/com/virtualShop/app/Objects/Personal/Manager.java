package com.virtualShop.app.Objects.Personal;

/**
 * Created by Zazonga on 21.03.2017.
 */
public class Manager {

    private String name;
    private String nationality;
    private String region;
    private int price;

    public Manager(){}
    public Manager(String name, String nationality, String region, int price) {
        this.setName(name);
        this.setNationality(nationality);
        this.setRegion(region);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getingPrice(int price){
        return this.price=price;
    }
    public int givingBonus(){
        TBD
    }
}
