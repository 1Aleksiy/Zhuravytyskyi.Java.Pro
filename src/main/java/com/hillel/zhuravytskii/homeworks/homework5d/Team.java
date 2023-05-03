package com.hillel.zhuravytskii.homeworks.homework5d;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String[] arr;
    private ArrayList<Sportsman> team;
    private String teamName;
    private IOutputProvider outputProvider;
    public Team(String teamName){
        this.team = new ArrayList<Sportsman>();
        this.teamName=teamName;
        outputProvider = new DesktopFormOutputProvider(teamName);

    }
    public void addSportsman(Sportsman sportsman){
        team.add(sportsman);
    }
    public void getTeamInfo(){
        arr = new String[team.size()];
        for (int i = 0; i< arr.length;i++){
            arr[i]=team.get(i).getInfo();
        }
        System.out.println("The team" + teamName + " consist of: " + Arrays.toString(arr));}
        public void startCompetition(ArrayList<Obstacle> course){
            System.out.println("Competiti  on start!");
        for (Obstacle obstacle:course){
            for (int i = 0; i< arr.length;i++){
                if (team.get(i).getCondition())
                    System.out.println(team.get(i).getRunResult(obstacle.getRoadLength()));
                if (team.get(i).getCondition())
                    System.out.println(team.get(i).getJumpResult(obstacle.getWallHeight()));
            }
        }
    }

    public void getWinner(){
        for (Sportsman sportsman : team){
            if (sportsman.getCondition()){
                System.out.println("\n Переможець в команді " + teamName + " " + sportsman.info + " !!");
            }
        }
    }
}
