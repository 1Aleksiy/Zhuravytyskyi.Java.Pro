package com.hillel.zhuravytskii.homeworks.homework5d;

public class Obstacle {
    private Wall wall;
    public Road road;
    public Obstacle(Wall wall,Road road){
        this.road = road;
        this.wall = wall;
    }
    public int getRoadLength(){
        return road.getLength();
    }
    public Double getWallHeight(){
        return wall.getHeight();
    }
}
