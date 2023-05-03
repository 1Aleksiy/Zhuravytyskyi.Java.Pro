package com.hillel.zhuravytskii.homeworks.homework5d;

public class Program {
    public static void main(String[] args) {
        Team team1 = new Team(" Works 2");
        team1.addSportsman(new Human("Pet",1600,2));
        team1.addSportsman(new Cat("Tem",600,1.2));
        team1.addSportsman(new Robot("Boot", 2500,2));

        ObstacleCourse course1 = new ObstacleCourse();
        course1.obstacleAdd(new Obstacle(new Wall(1.2),new Road(1500)));
        course1.obstacleAdd(new Obstacle(new Wall(1.6),new Road(500)));
        course1.obstacleAdd(new Obstacle(new Wall(1.5),new Road(2200)));
        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacles());

        team1.getWinner();


    }
}
