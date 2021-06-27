package com.github.gauthamkrishna9991.chaturanga.Piece;

import java.util.List;
import java.util.Optional;

import com.github.gauthamkrishna9991.chaturanga.Position;

// import com.github.gauthamkrishna9991.chaturanga.Board;

public class Piece {
    // pieceColor -> true = 1
    boolean pieceColor;
    // position in X and Y
    Position pos;
    // move list
    Optional<List<Position>> moveList;

    public Piece(boolean pieceColor, Position pos) {
        this.pieceColor = pieceColor;
        this.pos = pos;
        this.moveList = Optional.empty();
    }

    @Override
    public String toString() {
        return "XX";
    }
}
