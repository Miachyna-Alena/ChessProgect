package by.itstep.miachyna.javalessons.homework.stage12.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChessPieceMoveTest {
    public static final int MIN_COORDINATE_POINT = 1;
    public static final int MAX_COORDINATE_POINT = 8;

    @Test
    public void testMoveKingPositive() {
        int[][] offsets = {
                {0, -1},
                {0, +1},
                {+1, 0},
                {-1, 0},
                {-1, -1},
                {-1, +1},
                {+1, -1},
                {+1, +1}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int[] offset : offsets) {
                    int x2 = x1 + offset[0];
                    int y2 = y1 + offset[1];
                    if (x2 < MIN_COORDINATE_POINT || x2 > MAX_COORDINATE_POINT
                            || y2 < MIN_COORDINATE_POINT || y2 > MAX_COORDINATE_POINT) {
                        break;
                    }
                    boolean expected = true;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenPositive() {

        int[][] offsets = {
                {-1, +1},
                {-2, +2},
                {-3, +3},
                {-4, +4},
                {-5, +5},
                {-6, +6},
                {-7, +7},
                {+1, -1},
                {+2, -2},
                {+3, -3},
                {+4, -4},
                {+5, -5},
                {+6, -6},
                {+7, -7},
                {-1, -1},
                {-2, -2},
                {-3, -3},
                {-4, -4},
                {-5, -5},
                {-6, -6},
                {-7, -7},
                {+1, +1},
                {+2, +2},
                {+3, +3},
                {+4, +4},
                {+5, +5},
                {+6, +6},
                {+7, +7},
                {0, -1},
                {0, -2},
                {0, -3},
                {0, -4},
                {0, -5},
                {0, -6},
                {0, -7},
                {0, +1},
                {0, +2},
                {0, +3},
                {0, +4},
                {0, +5},
                {0, +6},
                {0, +7},
                {-1, 0},
                {-2, 0},
                {-3, 0},
                {-4, 0},
                {-5, 0},
                {-6, 0},
                {-7, 0},
                {+1, 0},
                {+2, 0},
                {+3, 0},
                {+4, 0},
                {+5, 0},
                {+6, 0},
                {+7, 0}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int[] offset : offsets) {
                    int x2 = x1 + offset[0];
                    int y2 = y1 + offset[1];
                    if (x2 < MIN_COORDINATE_POINT || x2 > MAX_COORDINATE_POINT
                            || y2 < MIN_COORDINATE_POINT || y2 > MAX_COORDINATE_POINT) {
                        break;
                    }
                    boolean expected = true;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopPositive() {

        int[][] offsets = {
                {-1, +1},
                {-2, +2},
                {-3, +3},
                {-4, +4},
                {-5, +5},
                {-6, +6},
                {-7, +7},
                {+1, -1},
                {+2, -2},
                {+3, -3},
                {+4, -4},
                {+5, -5},
                {+6, -6},
                {+7, -7},
                {-1, -1},
                {-2, -2},
                {-3, -3},
                {-4, -4},
                {-5, -5},
                {-6, -6},
                {-7, -7},
                {+1, +1},
                {+2, +2},
                {+3, +3},
                {+4, +4},
                {+5, +5},
                {+6, +6},
                {+7, +7}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int[] offset : offsets) {
                    int x2 = x1 + offset[0];
                    int y2 = y1 + offset[1];
                    if (x2 < MIN_COORDINATE_POINT || x2 > MAX_COORDINATE_POINT
                            || y2 < MIN_COORDINATE_POINT || y2 > MAX_COORDINATE_POINT) {
                        break;
                    }
                    boolean expected = true;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }


    @Test
    public void testMoveKnightPositive() {

        int[][] offsets = {
                {-2, +1},
                {-1, +2},
                {+1, +2},
                {+2, +1},
                {+2, -1},
                {+1, -2},
                {-1, -2},
                {-2, -1}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int[] offset : offsets) {
                    int x2 = x1 + offset[0];
                    int y2 = y1 + offset[1];
                    if (x2 < MIN_COORDINATE_POINT || x2 > MAX_COORDINATE_POINT
                            || y2 < MIN_COORDINATE_POINT || y2 > MAX_COORDINATE_POINT) {
                        break;
                    }
                    boolean expected = true;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookPositive() {

        int[][] offsets = {
                {0, -1},
                {0, -2},
                {0, -3},
                {0, -4},
                {0, -5},
                {0, -6},
                {0, -7},
                {0, +1},
                {0, +2},
                {0, +3},
                {0, +4},
                {0, +5},
                {0, +6},
                {0, +7},
                {-1, 0},
                {-2, 0},
                {-3, 0},
                {-4, 0},
                {-5, 0},
                {-6, 0},
                {-7, 0},
                {+1, 0},
                {+2, 0},
                {+3, 0},
                {+4, 0},
                {+5, 0},
                {+6, 0},
                {+7, 0}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int[] offset : offsets) {
                    int x2 = x1 + offset[0];
                    int y2 = y1 + offset[1];
                    if (x2 < MIN_COORDINATE_POINT || x2 > MAX_COORDINATE_POINT
                            || y2 < MIN_COORDINATE_POINT || y2 > MAX_COORDINATE_POINT) {
                        break;
                    }
                    boolean expected = true;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative01() {
        int[][] offsets = {
                {0, -1},
                {0, +1},
                {+1, 0},
                {-1, 0},
                {-1, -1},
                {-1, +1},
                {+1, -1},
                {+1, +1}
        };


        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                    flag:
                    for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {
                        for (int[] offset : offsets) {
                            int tempX = x1 + offset[0];
                            int tempY = y1 + offset[1];
                            if (tempX < MIN_COORDINATE_POINT || tempX > MAX_COORDINATE_POINT
                                    || tempY < MIN_COORDINATE_POINT || tempY > MAX_COORDINATE_POINT
                                    || (x2 == tempX && y2 == tempY)) {
                                break flag;
                            }
                        }
                        boolean expected = false;
                        boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                        assertEquals(expected, actual);
                    }
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative02() {
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                int x2 = x1;
                int y2 = y1;
                boolean expected = false;
                boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void testMoveKingNegative03() {
        int x1 = 0;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative04() {
        int y1 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative05() {
        int x2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative06() {
        int y2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative07() {
        int x1 = 9;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative08() {
        int y1 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative09() {
        int x2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKingNegative10() {
        int y2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKing(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative01() {

        int[][] offsets = {
                {-1, +1},
                {-2, +2},
                {-3, +3},
                {-4, +4},
                {-5, +5},
                {-6, +6},
                {-7, +7},
                {+1, -1},
                {+2, -2},
                {+3, -3},
                {+4, -4},
                {+5, -5},
                {+6, -6},
                {+7, -7},
                {-1, -1},
                {-2, -2},
                {-3, -3},
                {-4, -4},
                {-5, -5},
                {-6, -6},
                {-7, -7},
                {+1, +1},
                {+2, +2},
                {+3, +3},
                {+4, +4},
                {+5, +5},
                {+6, +6},
                {+7, +7},
                {0, -1},
                {0, -2},
                {0, -3},
                {0, -4},
                {0, -5},
                {0, -6},
                {0, -7},
                {0, +1},
                {0, +2},
                {0, +3},
                {0, +4},
                {0, +5},
                {0, +6},
                {0, +7},
                {-1, 0},
                {-2, 0},
                {-3, 0},
                {-4, 0},
                {-5, 0},
                {-6, 0},
                {-7, 0},
                {+1, 0},
                {+2, 0},
                {+3, 0},
                {+4, 0},
                {+5, 0},
                {+6, 0},
                {+7, 0}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                    flag:
                    for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {
                        for (int[] offset : offsets) {
                            int tempX = x1 + offset[0];
                            int tempY = y1 + offset[1];
                            if (tempX < MIN_COORDINATE_POINT || tempX > MAX_COORDINATE_POINT
                                    || tempY < MIN_COORDINATE_POINT || tempY > MAX_COORDINATE_POINT
                                    || (x2 == tempX && y2 == tempY)) {
                                break flag;
                            }
                        }
                        boolean expected = false;
                        boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                        assertEquals(expected, actual);
                    }
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative02() {
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                int x2 = x1;
                int y2 = y1;
                boolean expected = false;
                boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void testMoveQueenNegative03() {
        int x1 = 0;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative04() {
        int y1 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative05() {
        int x2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative06() {
        int y2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative07() {
        int x1 = 9;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative08() {
        int y1 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative09() {
        int x2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveQueenNegative10() {
        int y2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveQueen(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative01() {

        int[][] offsets = {
                {-1, +1},
                {-2, +2},
                {-3, +3},
                {-4, +4},
                {-5, +5},
                {-6, +6},
                {-7, +7},
                {+1, -1},
                {+2, -2},
                {+3, -3},
                {+4, -4},
                {+5, -5},
                {+6, -6},
                {+7, -7},
                {-1, -1},
                {-2, -2},
                {-3, -3},
                {-4, -4},
                {-5, -5},
                {-6, -6},
                {-7, -7},
                {+1, +1},
                {+2, +2},
                {+3, +3},
                {+4, +4},
                {+5, +5},
                {+6, +6},
                {+7, +7}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                    flag:
                    for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {
                        for (int[] offset : offsets) {
                            int tempX = x1 + offset[0];
                            int tempY = y1 + offset[1];
                            if (tempX < MIN_COORDINATE_POINT || tempX > MAX_COORDINATE_POINT
                                    || tempY < MIN_COORDINATE_POINT || tempY > MAX_COORDINATE_POINT
                                    || (x2 == tempX && y2 == tempY)) {
                                break flag;
                            }
                        }
                        boolean expected = false;
                        boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                        assertEquals(expected, actual);
                    }
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative02() {
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                int x2 = x1;
                int y2 = y1;
                boolean expected = false;
                boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void testMoveBishopNegative03() {
        int x1 = 0;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative04() {
        int y1 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative05() {
        int x2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative06() {
        int y2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative07() {
        int x1 = 9;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative08() {
        int y1 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative09() {
        int x2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveBishopNegative10() {
        int y2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveBishop(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative01() {

        int[][] offsets = {
                {-2, +1},
                {-1, +2},
                {+1, +2},
                {+2, +1},
                {+2, -1},
                {+1, -2},
                {-1, -2},
                {-2, -1}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                    flag:
                    for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {
                        for (int[] offset : offsets) {
                            int tempX = x1 + offset[0];
                            int tempY = y1 + offset[1];
                            if (tempX < MIN_COORDINATE_POINT || tempX > MAX_COORDINATE_POINT
                                    || tempY < MIN_COORDINATE_POINT || tempY > MAX_COORDINATE_POINT
                                    || (x2 == tempX && y2 == tempY)) {
                                break flag;
                            }
                        }
                        boolean expected = false;
                        boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                        assertEquals(expected, actual);
                    }
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative02() {
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                int x2 = x1;
                int y2 = y1;
                boolean expected = false;
                boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void testMoveKnightNegative03() {
        int x1 = 0;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative04() {
        int y1 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative05() {
        int x2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative06() {
        int y2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative07() {
        int x1 = 9;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative08() {
        int y1 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative09() {
        int x2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveKnightNegative10() {
        int y2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveKnight(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative01() {

        int[][] offsets = {
                {0, -1},
                {0, -2},
                {0, -3},
                {0, -4},
                {0, -5},
                {0, -6},
                {0, -7},
                {0, +1},
                {0, +2},
                {0, +3},
                {0, +4},
                {0, +5},
                {0, +6},
                {0, +7},
                {-1, 0},
                {-2, 0},
                {-3, 0},
                {-4, 0},
                {-5, 0},
                {-6, 0},
                {-7, 0},
                {+1, 0},
                {+2, 0},
                {+3, 0},
                {+4, 0},
                {+5, 0},
                {+6, 0},
                {+7, 0}
        };

        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                    flag:
                    for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {
                        for (int[] offset : offsets) {
                            int tempX = x1 + offset[0];
                            int tempY = y1 + offset[1];
                            if (tempX < MIN_COORDINATE_POINT || tempX > MAX_COORDINATE_POINT
                                    || tempY < MIN_COORDINATE_POINT || tempY > MAX_COORDINATE_POINT
                                    || (x2 == tempX && y2 == tempY)) {
                                break flag;
                            }
                        }
                        boolean expected = false;
                        boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                        assertEquals(expected, actual);
                    }
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative02() {
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                int x2 = x1;
                int y2 = y1;
                boolean expected = false;
                boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void testMoveRookNegative03() {
        int x1 = 0;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative04() {
        int y1 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative05() {
        int x2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative06() {
        int y2 = 0;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative07() {
        int x1 = 9;
        for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative08() {
        int y1 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative09() {
        int x2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int y2 = MIN_COORDINATE_POINT; y2 <= MAX_COORDINATE_POINT; y2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }

    @Test
    public void testMoveRookNegative10() {
        int y2 = 9;
        for (int x1 = MIN_COORDINATE_POINT; x1 <= MAX_COORDINATE_POINT; x1++) {
            for (int y1 = MIN_COORDINATE_POINT; y1 <= MAX_COORDINATE_POINT; y1++) {
                for (int x2 = MIN_COORDINATE_POINT; x2 <= MAX_COORDINATE_POINT; x2++) {

                    boolean expected = false;
                    boolean actual = ChessPieceMove.moveRook(x1, y1, x2, y2);
                    assertEquals(expected, actual);
                }
            }
        }
    }
}
