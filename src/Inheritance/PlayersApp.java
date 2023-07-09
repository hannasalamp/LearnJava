package Inheritance;

public class PlayersApp {
    public static void main (String[] args){
        Cricketers c=new Cricketers();
        FootBaller f=new FootBaller();
        System.out.println("cricket:");
        c.exercise();
        c.play();
        c.scoreRuns();
        System.out.println("football:");
        f.exercise();
        f.play();
        f.scoreGoals();
    }
}
