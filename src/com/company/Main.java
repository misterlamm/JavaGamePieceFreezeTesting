package com.company;

public class Main {

    public static void main(String[] args) {
        GamePiece queen = new GamePiece();

        queen.freeze();
        System.out.println(queen.frozen);

        queen.unfreeze();
        System.out.println(queen.frozen);

        queen.move(2, 10);
        System.out.println(queen.positionX);
        System.out.println(queen.positionY);

        queen.freeze();
        queen.move(7,2);
        System.out.println(queen.positionX);
        System.out.println(queen.positionY);

    }
}
