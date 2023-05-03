package com.hillel.zhuravytskii.homeworks.homework5d;

import java.util.ArrayList;

public class ObstacleCourse {
    private ArrayList<Obstacle>obstaclecourse;
    public ObstacleCourse(){
        obstaclecourse = new ArrayList<Obstacle>();
    }
    public void obstacleAdd(Obstacle obstacle){
        obstaclecourse.add(obstacle);
    }
    public ArrayList<Obstacle> getObstacles(){
        return obstaclecourse;
    }

}
