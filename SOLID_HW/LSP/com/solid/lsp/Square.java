package com.solid.lsp;

public class Square extends Quadrilateral {

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    
}
