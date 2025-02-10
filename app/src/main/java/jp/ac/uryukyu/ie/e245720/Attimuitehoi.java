package jp.ac.uryukyu.ie.e245720;
import java.util.Random;

public class Attimuitehoi {
    private String[] directions = {"上", "下", "右", "左"};
    private Random random = new Random();

    public Attimuitehoi() {
        this.random = new Random();
    }

    public Attimuitehoi(Random random) {
        this.random = random;
    }

    public int computerDirection(){
        return random.nextInt(4);
    }

    public String DirectionName(int choice){
        return directions[choice];
    }

    public boolean isMatch(int playerDirection, int computerDirection){
        return playerDirection == computerDirection;
    }
}
