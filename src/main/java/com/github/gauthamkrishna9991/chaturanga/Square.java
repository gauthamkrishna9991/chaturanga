package com.github.gauthamkrishna9991.chaturanga;

import java.util.Optional;

import com.github.gauthamkrishna9991.chaturanga.Piece.Piece;


public class Square {
    // Square Content
    Optional<Piece> content;
    // Square Position
    Position pos;

    public Square(Position pos) {
        this.content = Optional.empty();
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }
    
    public Optional<Piece> getPiece() {
        return this.content;
    }
    
    public void setPiece(Piece piece) {
        this.content = Optional.of(piece);
    }

    @Override
    public String toString() {
        if (this.content.isPresent()) {
            // return this.content.get().toString() + this.getPos().toString();
            return this.content.get().toString();
        }
        // return "##" + this.getPos().toString();
        return "XX";
    }
}
