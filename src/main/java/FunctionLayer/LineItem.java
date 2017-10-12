/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Jonatan
 */
public class LineItem {
    private int id;
    private String side;
    private int floorLevel;
    private String brickType;
    private int numberOfBricks;

    public LineItem(int id, String side, int floorLevel, String brickType, int numberOfBricks) {
        this.id = id;
        this.side = side;
        this.floorLevel = floorLevel;
        this.brickType = brickType;
        this.numberOfBricks = numberOfBricks;
    }

    public int getId() {
        return id;
    }

    public String getSide() {
        return side;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public String getBrickType() {
        return brickType;
    }

    public int getNumberOfBricks() {
        return numberOfBricks;
    }

    @Override
    public String toString() {
        return "LineItem{" + "id=" + id + ", side=" + side + ", floorLevel=" + floorLevel + ", brickType=" + brickType + ", numberOfBricks=" + numberOfBricks + '}';
    }
    
    
}
