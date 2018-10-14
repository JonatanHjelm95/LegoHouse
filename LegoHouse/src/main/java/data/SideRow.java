/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Jonatan
 */
public class SideRow {

    private boolean isEven;
    private int length;
    private Brick[] bricks;
    private int rowPrice;

    public int getLength() {
        return length;
    }

    public SideRow(Brick[] bricks) {
        this.bricks = bricks;
    }

    public SideRow(boolean isEven, int length, Brick[] bricks, int rowPrice) {
        this.isEven = isEven;
        this.length = length;
        this.bricks = bricks;
        this.rowPrice = rowPrice;
    }

    public SideRow(boolean isEven, int length) {
        this.isEven = isEven;
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRowPrice() {
        return rowPrice;
    }

    public void setRowPrice(int rowPrice) {
        this.rowPrice = rowPrice;
    }

    public boolean isIsEven() {
        return isEven;
    }

    public void setIsEven(boolean isEven) {
        this.isEven = isEven;
    }

    public Brick[] getBricks() {
        return bricks;
    }

    public void setBricks(Brick[] bricks) {
        this.bricks = bricks;
    }

//    public int getRowPrice(Brick[] bricks) {
//
//        for (Brick brick : bricks) {
//            rowPrice += brick.getPrice(brick.getLength());
//        }
//        return rowPrice;
//    }

    public int getRemainingLength(Brick[] bricks, int length) {

        int current = length;
        for (int i = 0; i < bricks.length; i++) {
            current -= bricks[i].getLength();
        }
        return current;
    }

}
