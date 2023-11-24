package map;

public class Map2D {
    private int width;
    private int height;
    private int robotX, robotY; // Position du robot
    private String robotOrientation; // Orientation du robot (Nord, Sud, Est, Ouest)

    // Constructeur, getters et setters

    public void updateRobotPosition(int x, int y) {
        this.robotX = x;
        this.robotY = y;
    }

    public void updateRobotOrientation(String orientation) {
        this.robotOrientation = orientation;
    }

    // Autres méthodes...
}

