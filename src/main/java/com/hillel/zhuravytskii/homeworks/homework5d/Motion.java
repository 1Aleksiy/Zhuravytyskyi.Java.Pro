package com.hillel.zhuravytskii.homeworks.homework5d;

public class Motion extends IMotion {
  public boolean jump (double height, double maxHeight){
      if (height<maxHeight)
          return true;
      return false;
  }
  public boolean run(int distance, int maxDistance){
      if (distance<maxDistance)
          return true;
      return false;
  }
}