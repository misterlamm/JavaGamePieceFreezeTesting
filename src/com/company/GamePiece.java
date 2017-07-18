package com.company;

/**
 * Created by alamm7 on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public  GamePiece () {
        positionX = 0;
        positionY = 0;
        frozen = false;
        name = name;
        color = color;
    }
    public int getPositionX(){
        return positionX;
    }

    public int getPositionY(){
        return positionY;
    }

    public boolean getFrozen(){
        return frozen;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public void move(int newXPosition, int newYPosition) {

        if (frozen == true) {
            System.out.println("Cannot move piece");
            } else {
            this.positionX = newXPosition;
            this.positionY = newYPosition;
        }
    }

    public void freeze(){
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }
}
