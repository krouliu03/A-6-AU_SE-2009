package com.company.subtask4;

public class HouseBuilder implements Builder {
    private House house;

    HouseBuilder() {
        this.reset();
    }

    public House getResult() {
        House product = this.house;
        this.reset();
        return product;
    }

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {

    }

    @Override
    public void buildDoors() {

    }

    @Override
    public void buildWindows() {

    }

    @Override
    public void buildRoof() {

    }

    @Override
    public void buildGarage() {

    }
}
