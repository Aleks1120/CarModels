package com.exsersice.cars;

public class Engine {
    private EngineType type;
    private double volume;
    private int horsePower;

    Engine(EngineType type, double volume, int horsePower){
        this.type = type;
        this.volume = volume;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine" +
                " type: " + type +
                ", volume = " + volume +
                ", horsePower = " + horsePower;
    }
}
