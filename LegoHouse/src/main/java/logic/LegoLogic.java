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

    public Brick[] createRow(boolean isEven, int length) {
        int brickAmount = getBrickAmount(isEven, length);
        int modu = length % 3;
        try {

            Brick[] row = new Brick[brickAmount];
            setBrickRow(row);

            return row;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    public ArrayList<Wall> createHouse(int height, int lenX, int lenY) {
        //wall 1
        ArrayList<Wall> walls = new ArrayList<Wall>();
        try {
            ArrayList<Brick[]> wall1 = new ArrayList<Brick[]>();
            for (int i = 0; i < height; i++) {
                if (i % 2 == 0) {
                    wall1.add(createRow(true, lenX));
                } else {
                    wall1.add(createRow(false, lenX));
                }
                Wall wall_1 = new Wall(wall1);
                walls.add(wall_1);
                return walls;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private void setBrickRow(Brick[] row) {
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
