package com.github.gauthamkrishna9991.chaturanga.Piece;

import com.github.gauthamkrishna9991.chaturanga.Position;

public class Bishop extends Piece {
    public Bishop(boolean pieceColor, Position pos) {
        super(pieceColor, pos);
    }

    @Override
    public String toString() {
        if (this.pieceColor) {
            return "BB";
        }
        return "BW";
    }
}
