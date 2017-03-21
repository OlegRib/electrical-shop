package com.virtualShop.app.Objects.Personal;

/**
 * Created by Zazonga on 21.03.2017.
 */
public class Director {

    private int age;
    private int height;
    private int weight;
    private String name;
    private String nationality;

    private Director(){

    }

    public Director(int age, int height, int weight, String name, String nationality) {
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.setName(name);
        this.setNationality(nationality);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public void getJob(String employeeName){
        System.out.println("Director in person "+"( " +age+name+nationality + ") "+ employeeName + " set to job");
    }
    public void quite(String employeeName){
        System.out.println("Director in person "+"( " +age+name+nationality + ") "+ employeeName + " quite from position");
    }
}
