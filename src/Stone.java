import java.util.Scanner;
public class Stone {

    //attributes
    private double weight;
    private String material;
    private int numStones;
    private int wall;
    Scanner ask = new Scanner(System.in);

    //methods
    public void stoneCheck(int s) {
        System.out.println("You are holding" + numStones + " stones now.");
    }

    public void grabStone() {
        System.out.println("How many stones do you want to grab?");
        int grab = ask.nextInt();
        numStones += grab;
        stoneCheck(numStones);

    }
}
