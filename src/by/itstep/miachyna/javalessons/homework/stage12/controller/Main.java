package by.itstep.miachyna.javalessons.homework.stage12.controller;

import by.itstep.miachyna.javalessons.homework.stage12.model.logic.ChessPieceMove;
import by.itstep.miachyna.javalessons.homework.stage12.view.Printer;

import java.util.Scanner;

public class Main {
    public static final int MIN_COORDINATE_POINT = 1;
    public static final int MAX_COORDINATE_POINT = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;

        do {
            Printer.print("Input x1 = ");
            x1 = scanner.nextInt();

            Printer.print("Input y1 = ");
            y1 = scanner.nextInt();

            Printer.print("Input x2 = ");
            x2 = scanner.nextInt();

            Printer.print("Input y2 = ");
            y2 = scanner.nextInt();

        } while (x1 < MIN_COORDINATE_POINT || x1 > MAX_COORDINATE_POINT
                || y1 < MIN_COORDINATE_POINT || y1 > MAX_COORDINATE_POINT
                || x2 < MIN_COORDINATE_POINT || x2 > MAX_COORDINATE_POINT
                || y2 < MIN_COORDINATE_POINT || y2 > MAX_COORDINATE_POINT);


        String resultMoveKing = ChessPieceMove.moveKing(x1, y1, x2, y2) ? "YES" : "NO";
        Printer.print("Can KING move? --> " + resultMoveKing + "\n");

        String resultMoveQueen = ChessPieceMove.moveQueen(x1, y1, x2, y2) ? "YES" : "NO";
        Printer.print("Can QUEEN move? --> " + resultMoveQueen + "\n");

        String resultMoveBishop = ChessPieceMove.moveBishop(x1, y1, x2, y2) ? "YES" : "NO";
        Printer.print("Can BISHOP move? --> " + resultMoveBishop + "\n");

        String resultMoveKnight = ChessPieceMove.moveKnight(x1, y1, x2, y2) ? "YES" : "NO";
        Printer.print("Can KNIGHT move? --> " + resultMoveKnight + "\n");

        String resultMoveRook = ChessPieceMove.moveRook(x1, y1, x2, y2) ? "YES" : "NO";
        Printer.print("Can ROOK move? --> " + resultMoveRook + "\n");
    }
}