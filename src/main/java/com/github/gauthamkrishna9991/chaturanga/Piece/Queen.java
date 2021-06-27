package com.github.gauthamkrishna9991.chaturanga.Piece;

import com.github.gauthamkrishna9991.chaturanga.Position;

public class Queen extends Piece {
    public Queen(boolean pieceColor, Position pos) {
        super(pieceColor, pos);
    }

    @Override
    public String toString() {
        if (this.pieceColor) {
            return "QB";
        }
        return "QW";
    }
}
