public class Test {
    public static void main(String[] args) {
        //Starts the user with 72 stones
        Stone s = new Stone(72);
        //Tells the user how many stones they have now
        s.stoneCheck();
        s.grabStone();
        s.buildWall();

    }
}
