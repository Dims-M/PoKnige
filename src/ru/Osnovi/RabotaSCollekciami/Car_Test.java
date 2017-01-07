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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car_Test)) return false;

        Car_Test car_test = (Car_Test) o;

        if (Double.compare(car_test.stoimost, stoimost) != 0) return false;
        if (!Name.equals(car_test.Name)) return false;
        return Mjdel.equals(car_test.Mjdel);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = Name.hashCode();
        result = 31 * result + Mjdel.hashCode();
        temp = Double.doubleToLongBits(stoimost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        return "В классе Car_Test Содержится \n :" +
                "Имя='" + Name + '\'' +
                ",\n  Модель='" + Mjdel + '\'' +
                ",\n  Стоимость=" + stoimost ;
    }
}
