import java.util.Scanner;
public class Stone {

    //attributes
    private double weight;
    private String material;
    private int numStones;
    private int wall;
    Scanner ask = new Scanner(System.in);

    //methods
    public Stone(int n) {
        numStones = n;
    }
    public void stoneCheck()
        {
        System.out.println("You are holding " + numStones + " stones now.");
        }
    public void wallCheck()
        {
        System.out.println("The wall is made of " + wall + " stones now.");
        }

    public void grabStone()
        {
        System.out.println("How many stones do you want to grab?");
        int grab = ask.nextInt();
        numStones += grab;
        stoneCheck();

        }
    public void buildWall()
        {
        wall += numStones;
        System.out.println("You add " + numStones + " stones to the wall.");
        numStones = 0;
        wallCheck();

        }
}
