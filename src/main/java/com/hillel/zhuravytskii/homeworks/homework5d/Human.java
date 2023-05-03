package com.hillel.zhuravytskii.homeworks.homework5d;

public class Human extends Sportsman{
    public static final String ObjectClass = "Human";
    public static final String OvercameRunObstacle = " подалав дистанцію біг";
    public static final String OvercameBadRunObstacle = " не подалав дистанцію біг";
    public static final String OvercameJumpObstacle = " перепригнув стіну";
    public static final String OvercameBadJumpObstacle = " не перепригнув стіну";
    public Human(String name, int maxDistance, double maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = ObjectClass + " iм'я "+name;
        super.sucCesFulRunResult = OvercameRunObstacle;
        super.badRunResult = OvercameBadRunObstacle;
        super.sucCesFulJumpResult = OvercameJumpObstacle;
        super.badJumpResult = OvercameBadJumpObstacle;
    }
}
