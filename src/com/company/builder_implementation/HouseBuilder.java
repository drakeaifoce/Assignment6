package com.company.builder_implementation;

public class HouseBuilder implements IHouseBuilder{
    private House house;

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void buildWalls(int walls) {
        this.house.setWalls(walls);
    }

    @Override
    public void buildWindows(int windows) {
        this.house.setWindows(windows);
    }

    @Override
    public void buildDoors(int doors) {
        this.house.setDoors(doors);
    }

    @Override
    public void buildRoof(int roof) {
        this.house.setRoof(roof);
    }

    @Override
    public void buildGarage(int garage) {
        this.house.setGarage(garage);
    }

    @Override
    public void buildSwimmingPool(int swimmingPool) {
        this.house.setSwimmingPool(swimmingPool);
    }

    @Override
    public void buildFancyStatues(int fancyStatues) {
        this.house.setFancyStatues(fancyStatues);
    }

    @Override
    public void buildGarden(int garden) {
        this.house.setGarden(garden);
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
