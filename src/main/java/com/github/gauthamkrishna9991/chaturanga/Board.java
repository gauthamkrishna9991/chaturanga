package com.github.gauthamkrishna9991.chaturanga;

import java.util.Optional;

import com.github.gauthamkrishna9991.chaturanga.Piece.Bishop;
import com.github.gauthamkrishna9991.chaturanga.Piece.King;
import com.github.gauthamkrishna9991.chaturanga.Piece.Knight;
import com.github.gauthamkrishna9991.chaturanga.Piece.Pawn;
import com.github.gauthamkrishna9991.chaturanga.Piece.Queen;
import com.github.gauthamkrishna9991.chaturanga.Piece.Rook;

public class Board {
    Square[][] chessSquares;

    public Board() {
        this.chessSquares = new Square[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.chessSquares[i][j] = new Square(new Position(i, j));
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 1 || i == 6) {
                    this.chessSquares[i][j].setPiece(
                        new Pawn(
                            i == 6,
                            this.chessSquares[i][j].getPos()
                        )
                    );
                }
                if (i == 0 || i == 7) {
                    if (j == 0 || j == 7) {
                        this.chessSquares[i][j].setPiece(
                            new Rook(
                                i == 7,
                                this.chessSquares[i][j].getPos()
                            )
                        );
                    }
                    if (j == 1 || j == 6) {
                        this.chessSquares[i][j].setPiece(
                            new Knight(
                                i == 7,
                                this.chessSquares[i][j].getPos()
                            )
                        );
                    }
                    if (j == 2 || j == 5) {
                        this.chessSquares[i][j].setPiece(
                            new Bishop(
                                i == 7,
                                this.chessSquares[i][j].getPos()
                            )
                        );
                    }
                    if (j == 3) {
                        this.chessSquares[i][j].setPiece(
                            new Queen(
                                i == 7,
                                this.chessSquares[i][j].getPos()
                            )
                        );
                    }
                    if (j == 4) {
                        this.chessSquares[i][j].setPiece(
                            new King(
                                i == 7,
                                this.chessSquares[i][j].getPos()
                            )
                        );
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 8; j++) {
            sb.append((char)((int)'A' + j) + "\t");
        }
        sb.append("\n");
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                sb.append(this.chessSquares[i][j].toString() + "\t");
            }
            sb.append((i + 1) + "\n");
        }
        return sb.toString();
    }

    public static Optional<Position> parsePosition(String positionString) {
        if (positionString == "") return Optional.empty();
        else {
            int xPosition, yPosition;
            char firstPosition = positionString.charAt(0);
            if (firstPosition >= 'A' && firstPosition <= 'H') {
                xPosition = (int) firstPosition - (int) 'A';
            } else {
                return Optional.empty();
            }
            char secondPosition = positionString.charAt(1);
            if (secondPosition >= '1' && secondPosition <= '8') {
                yPosition = (int) secondPosition - (int) '1';
            } else {
                return Optional.empty();
            }
            return Optional.of(new Position(xPosition, yPosition));
        }
    }
}
