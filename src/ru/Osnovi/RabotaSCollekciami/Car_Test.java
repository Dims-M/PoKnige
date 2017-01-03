package ru.Osnovi.RabotaSCollekciami;

/**
 * Created by User on 003 03.01.17.
 */
public class Car_Test {

 private    String Name;
 private    String Mjdel;
 private    double stoimost;


 Car_Test (String name, String model, double price){
    Name = name;
    Mjdel = model;
    stoimost = price;
 }

    public String getName() {
        if (Name != null) {
            return Name;
        }
        String error = "Имя не заданно!!!!";
        return error;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getMjdel() {
        return Mjdel;
    }

    public void setMjdel(String mjdel) {
        Mjdel = mjdel;
    }

    public double getStoimost() {
        return stoimost;
    }

    public void setStoimost(double stoimost) {
        this.stoimost = stoimost;
    }
}
