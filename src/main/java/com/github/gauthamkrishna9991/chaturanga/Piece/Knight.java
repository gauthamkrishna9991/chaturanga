package com.github.gauthamkrishna9991.chaturanga.Piece;

import com.github.gauthamkrishna9991.chaturanga.Position;

public class Knight extends Piece {
    public Knight(boolean pieceColor, Position pos) {
        super(pieceColor, pos);
    }

    @Override
    public String toString() {
        if (this.pieceColor) {
            return "NB";
        }
        return "NW";
    }
}
