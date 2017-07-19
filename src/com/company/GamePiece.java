package com.company;

import java.util.Random;

/**
 * Created by TKB on 7/18/17.
 */
public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;


    private String name;
    private String color;

    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
    private int counter;
    private int hearts;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
        this.minX = 0;
        this.maxX = 50;
        this.minY = 0;
        this.maxY = 100;
//        this.counter = 1;
//        this.hearts = 4;



    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void move () {
        if(!frozen) {
//            this.counter++; if a random number == this.counter call freeze()
            Random rand = new Random();
            this.positionX = rand.nextInt(75);
            this.positionY = rand.nextInt(150);
            if(this.positionX > this.maxX){
                System.out.println("You're at the border.");
                this.positionX = this.maxX;
            }
            if (this.positionX < this.minX){
                System.out.println("You're at the border.");
                this.positionX = this.minX;
            }
            if(this.positionY > this.maxY){
                System.out.println("You're at the border.");
                this.positionY = this.maxY;
            }
            if (this.positionY < this.minY){
                System.out.println("You're at the border.");
                this.positionY = this.minY;
            }
            System.out.println("Your position: " + this.positionX + "," + this.positionY);
        } else {
            setColor("blue");
            System.out.println("Freeze!! No moves for you!");
        }

    }

    public void freeze(){
        this.frozen = true;


    }

    public void unfreeze(){
//        this.hearts--; ask user to lose a heart to unfreeze and continue with moves
        this.frozen = false;
        System.out.println("You can move again");
    }
    public void printInfo(){
        System.out.print("Name: " + getName());
        System.out.println("   Color: " + getColor());
    }


}
