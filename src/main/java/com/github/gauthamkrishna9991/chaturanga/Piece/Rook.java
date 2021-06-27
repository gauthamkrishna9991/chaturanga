package com.github.gauthamkrishna9991.chaturanga.Piece;

import com.github.gauthamkrishna9991.chaturanga.Position;

public class Rook extends Piece {
    public Rook(boolean pieceColor, Position pos) {
        super(pieceColor, pos);
    }

    @Override
    public String toString() {
        if (this.pieceColor) {
            return "RB";
        }
        return "RW";
    }
}
