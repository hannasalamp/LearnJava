package Inheritance;

public class RoboApp {
    public  static  void main(String[] args){
        FighterRobot fr=new FighterRobot();
        System.out.println("the output of fighter robot is:");
        fr.speak();
        fr.learn();
        fr.interact();
        fr.recharge();
        fr.fight();
        playingRobot pr=new playingRobot();
        System.out.println("the output of playing robot is:");
        pr.speak();
        pr.learn();
        pr.interact();
        pr.recharge();
        pr.play();
    }
}
