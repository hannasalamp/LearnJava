package Inheritance;

public class Robot {
    void speak(){
        System.out.println("robot is speaking");
    }
    void interact(){
        System.out.println("robot is interacting");
    }
    void learn(){
        System.out.println("robot is learning");
    }
    void recharge(){
        System.out.println("robot is recharged");
    }
}
class FighterRobot extends Robot{
    void fight(){
        System.out.println("Fighter robot is fighting");
    }
}
class playingRobot extends Robot{
    void play(){
        System.out.println("playing robot is playing");
    }
}
