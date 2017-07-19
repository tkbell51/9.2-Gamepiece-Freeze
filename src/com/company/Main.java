package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        System.out.print("Hello! Ready to play Freeze? ");
        Scanner scanner = new Scanner(System.in);
//        String gameAnswer = scanner.nextLine();
//
//        if (gameAnswer.equalsIgnoreCase("Y") || gameAnswer.equalsIgnoreCase("Yes")) {
//            System.out.println("Great! Let's Play");
//        } else {
//            System.out.println("Hmmm. Let's play anyway.");
//        }
        System.out.println("FREEZE!!!");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();

        GamePiece myGamePiece = new GamePiece();
        myGamePiece.setColor(color);
        myGamePiece.setName(name);
        myGamePiece.printInfo();

        myGamePiece.move();
        myGamePiece.move();
        myGamePiece.freeze();
        myGamePiece.move();
        myGamePiece.move();
        myGamePiece.unfreeze();
        myGamePiece.move();
        myGamePiece.move();

        //while loop to play the game until this.counter == ?20 or this.hearts == 0





        }

    }

