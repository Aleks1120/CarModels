package com.exsersice.cars;

public class Engine {
    private EngineType type;
    private double volume;
    private int horsePower;

    Engine(EngineType type, double volume, int horsePower) throws Exception {
        this.type = type;
        setVolume(volume);
        setHorsePower(horsePower);
    }

    public double getVolume() {
        return volume;
    }
    private void setVolume(double volume) throws Exception {
        if (volume < 1.0 || volume > 3.0){
            throw new Exception("Volume does not apply");
        }
        this.volume = volume;
    }
    public int getHorsePower(){
        return horsePower;
    }
    private void  setHorsePower(int horsePower) throws Exception {
        if (horsePower < 70 || horsePower > 300){
            throw new Exception("Not fast enough or too fast to drive");
        }
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
