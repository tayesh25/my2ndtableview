package com.example.my2ndtableview;

public class RollerCoasterData {
    String name;

    String park;
    Integer speed;

    public RollerCoasterData(String name, String park, Integer speed) {
        this.name = name;
        this.park = park;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return name + park + speed;
    }
}
