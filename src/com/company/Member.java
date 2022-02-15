package com.company;


import java.util.Random;

class Member {
    private String name;
    private int raceResult;
    private int swimResult;
    private int bikeResult;
    private int speedRun;
    private int speedSwim;
    private int speedBike;



    public Member(String name, int raceResult, int swimResult, int bikeResult, int speedRun,
                  int speedSwim, int speedBike) {
        this.name = name;
        this.raceResult = raceResult;
        this.swimResult = swimResult;
        this.bikeResult = bikeResult;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.speedBike = speedBike;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public int getSpeedBike() {
        return speedBike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRaceResult() {
        return raceResult;
    }

    public void setRaceResult(int raceResult) {
        this.raceResult = raceResult;
    }

    public int getSwimResult() {
        return swimResult;
    }

    public void setSwimResult(int swimResult) {
        this.swimResult = swimResult;
    }

    public int getBikeResult() {
        return bikeResult;
    }

    public void setBikeResult(int bikeResult) {
        this.bikeResult = bikeResult;
    }

    @Override
    public String toString() {
        return "Member{" +
                name +
                ", raceResult:" + raceResult + "sec" +
                ", swimResult:" + swimResult + "sec" +
                ", bikeResult:" + bikeResult + "sec" +
                '}';
    }
}



