package by.itstep.miachyna.javalessons.homework.stage12.model.logic;

public class ChessPieceMove {
    public static final int MIN_COORDINATE_POINT = 1;
    public static final int MAX_COORDINATE_POINT = 8;

    public static boolean checkCoordinate(int x1, int y1, int x2, int y2) {
        return x1 >= MIN_COORDINATE_POINT && x1 <= MAX_COORDINATE_POINT
                && y1 >= MIN_COORDINATE_POINT && y1 <= MAX_COORDINATE_POINT
                && x2 >= MIN_COORDINATE_POINT && x2 <= MAX_COORDINATE_POINT
                && y2 >= MIN_COORDINATE_POINT && y2 <= MAX_COORDINATE_POINT;
    }

    public static boolean moveKing(int x1, int y1, int x2, int y2) {
        return checkCoordinate(x1, y1, x2, y2) && (Math.abs(x1 - x2) <= 1
                && Math.abs(y1 - y2) <= 1
                && (!(x1 == x2 && y1 == y2)));
    }


    public static boolean moveQueen(int x1, int y1, int x2, int y2) {
        return checkCoordinate(x1, y1, x2, y2) && ((Math.abs(x1 - x2) == Math.abs(y1 - y2)
                || (x1 == x2 || y1 == y2))
                && (!(x1 == x2 && y1 == y2)));
    }


    public static boolean moveBishop(int x1, int y1, int x2, int y2) {
        return checkCoordinate(x1, y1, x2, y2) && (Math.abs(x1 - x2) == Math.abs(y1 - y2)
                && !(x1 == x2 && y1 == y2));
    }

    public static boolean moveKnight(int x1, int y1, int x2, int y2) {
        return checkCoordinate(x1, y1, x2, y2) && ((((x1 - 1 == x2 || x1 + 1 == x2) && (y1 - 2 == y2 || y1 + 2 == y2))
                || ((x1 - 2 == x2 || x1 + 2 == x2) && (y1 - 1 == y2 || y1 + 1 == y2))));
    }

    public static boolean moveRook(int x1, int y1, int x2, int y2) {
        return checkCoordinate(x1, y1, x2, y2) && ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2));
    }
}
