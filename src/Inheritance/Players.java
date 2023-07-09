package Inheritance;

public class Players {
    void exercise(){
        System.out.println("exercise daily");
    }
    void play(){
        System.out.println("play a game");
    }

}
class Cricketers extends Players{
    void play(){
        System.out.println("play cricket");
    }
    void scoreRuns(){
        System.out.println("score runs to win ");
    }
}
class FootBaller extends Players{
    void play(){
        System.out.println("play football");
    }
    void scoreGoals(){
        System.out.println("score goal to win");
    }
}
