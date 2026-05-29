package trianglestar;

public class starPattern {

    private void printRightAngledTriangleStarPatterntarPattern(){
        for (int row = 1; row <= 4; row++){
            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        starPattern conditionalExamples = new starPattern();
        //starpattern.printRightAngledTriangleStarPattern();
    }
}
