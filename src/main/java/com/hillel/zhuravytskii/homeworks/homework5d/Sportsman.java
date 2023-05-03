package com.hillel.zhuravytskii.homeworks.homework5d;

public abstract class Sportsman {
    protected String info;
    protected int maxDistance;
    protected double maxHeight;
    protected String sucCesFulRunResult;
    protected String badRunResult;
    protected String sucCesFulJumpResult;
    protected String badJumpResult;
    private boolean condition;
    private IMotion motion;

    public Sportsman(String name, int maxDistance, double maxHeight) {
        this.info = "";
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.sucCesFulRunResult = "";
        this.badRunResult = "";
        this.condition = true;
        this.motion = new Motion();
    }
    public String getInfo(){
        return info;
    }
    public String getRunResult(int distance){
        if (motion.run(distance,maxDistance)&&condition){
            return info + sucCesFulRunResult + distance + " m";
        }
        condition=false;
        return info + badRunResult;
    }
    public String getJumpResult(double height){
        if (motion.jump(height,maxHeight)&& condition){
            return info + sucCesFulJumpResult +height + " m";
        }condition = false;
        return info + badJumpResult;
    }
    public boolean getCondition(){
        return condition;
    }
}
