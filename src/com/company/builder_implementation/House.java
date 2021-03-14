package com.company.builder_implementation;

public class House {
    public House() {
    }

    int walls;
    int windows;
    int doors;
    int roof;
    int garage;
    int swimmingPool;
    int fancyStatues;
    int garden;

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    public int getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(int swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getFancyStatues() {
        return fancyStatues;
    }

    public void setFancyStatues(int fancyStatues) {
        this.fancyStatues = fancyStatues;
    }

    public int getGarden() {
        return garden;
    }

    public void setGarden(int garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", windows=" + windows +
                ", doors=" + doors +
                ", roof=" + roof +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", fancyStatues=" + fancyStatues +
                ", garden=" + garden +
                '}';
    }
}
