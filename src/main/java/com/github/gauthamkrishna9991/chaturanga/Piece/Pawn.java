package com.github.gauthamkrishna9991.chaturanga.Piece;

import com.github.gauthamkrishna9991.chaturanga.Position;

public class Pawn extends Piece {
    public Pawn(boolean pieceColor, Position pos) {
        super(pieceColor, pos);
    }

    @Override
    public String toString() {
        if (this.pieceColor) {
            return "PB";
        }
        return "PW";
    }
}
