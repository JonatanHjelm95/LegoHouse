/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.*;
import java.util.ArrayList;

/**
 *
 * @author Jonatan
 */
public class LegoLogic {

//    public Brick[] createRow(Boolean isEven, int length) { //minimum length = 2
////        SideRow row = new SideRow(isEven, length);
////        Brick[] bricks = row.getBricks();
//////        if (isEven) {
////            for (int i = 0; i < row.getLength(); i++) {
////                
//////                while (row.getCurrentRowLength(bricks) < row.getLength()) {
////                    switch (i) {
////                        case 0:
////                            if (row.getLength() > 2) {
////                                bricks[i] = new Brick(2);
////                            } else {
////                                bricks[i] = new Brick(4);
////                            }
////                            break;
//////                        case 1:
//////                            bricks[i] = new Brick(4);
//////                            break;
////                        default:
////                            if (bricks[i - 1].getLength() == 2 ) {
////                                bricks[i] = new Brick(4);
////                            }
////                            if (bricks[i - 1].getLength() == 4 ) {
////                                bricks[i] = new Brick(2);
////                            }
////                            break;
////                    }
//////                }
////
////            }
////            return bricks;
////        }
////        return null;
////    }
    public Brick[] createRow(boolean isEven, int length) {
        int brickAmount = getBrickAmount(isEven, length);
        int modu = length % 3;
        try {

            Brick[] row = new Brick[brickAmount];
            if (isEven) {
                setEvenBrickRow(row);
            } else {
                setUnevenBrickRow(row);
            }
            return row;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    private void setUnevenBrickRow(Brick[] row) {
        for (int i = 0; i < row.length; i++) {
            switch (i) {
                case 0:
                    row[i] = new Brick(0);
                    break;
                case 1:
                    row[i] = new Brick(2);
                    break;
                default:
                    if (row[i - 1].getLength() == 2) {
                        row[i] = new Brick(4);
                    } else {
                        row[i] = new Brick(2);
                    }
            }
        }
    }

    private void setEvenBrickRow(Brick[] row) {
        for (int i = 0; i < row.length; i++) {
            switch (i) {
                case 0:
                    row[i] = new Brick(2);
                    break;
                default:
                    if (row[i - 1].getLength() == 2) {
                        row[i] = new Brick(4);
                    } else {
                        row[i] = new Brick(2);
                    }
            }
        }
    }

    public int getBrickAmount(boolean isEven, int length) {
        int amount = 0;
        double length_double = (int) length;
        double amount_double;
        int modu = length % 3;
        if (isEven) {
            switch (modu) {
                case 0:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double);
                    break;
                case 1:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double) - 1;
                    break;
                case 2:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double) - 1;
                    break;
                default:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double);
                    break;
            }
        } else {
            switch (modu) {
                case 0:
                    amount_double = length_double / 3 * 2 - 1;
                    amount = (int) Math.ceil(amount_double);
                    break;
                case 1:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double) - 1;
                    break;
                case 2:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double) - 1;
                    break;
                default:
                    amount_double = length_double / 3 * 2;
                    amount = (int) Math.ceil(amount_double);
                    break;
            }
        }
        return amount;
    }
}
