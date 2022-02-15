package com.company;

import java.util.Random;

public class Course {
    String result;

    private int runDistance100;
    private int bikeDistance5000;
    private int swim200;


    Course (int runDistance100, int bikeDistance5000, int swim200) {
        this.runDistance100 = runDistance100;
        this.bikeDistance5000 = bikeDistance5000;
        this.swim200 = swim200;
    }
public void doIt (Member[] members) {
        for (Member member: members) {
            member.setRaceResult(runDistance100/member.getSpeedRun());
            member.setBikeResult(bikeDistance5000/member.getSpeedBike());
            member.setSwimResult(swim200/member.getSpeedSwim());
        }

}

}
