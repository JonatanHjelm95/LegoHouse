/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Jonatan
 */
public class LegoLogic {

    ArrayList<Brick[]> house = new ArrayList<Brick[]>();

    public ArrayList<Brick[]> getHouse() {
        return house;
    }

    public void test(int height, int lenX, int lenY) {
        //side1
        int brickCount = 0;
        int rowLength = 0;
        int availableRoom = lenX * 2;
        Brick[] side1 = new Brick[availableRoom];
        for (int i = 0; rowLength < availableRoom - 2; i++) {
            if (i == 0) {
                side1[i] = new Brick(2);
                rowLength += side1[i].getLength();
                brickCount++;
            }
            if (i > 0 && side1[i - 1].getLength() == 2) {
                side1[i] = new Brick(4);
                rowLength += side1[i].getLength();
                brickCount++;

            }
            if (i > 0 && side1[i - 1].getLength() == 4) {
                side1[i] = new Brick(2);
                rowLength += side1[i].getLength();
                brickCount++;

            }
            System.out.println("wall 1 length: " + rowLength);
        }
        Brick[] side1Trim = new Brick[brickCount];
        for (int i = 0; i < side1.length; i++) {
            if (side1[i] != null) {
                side1Trim[i] = side1[i];
            }
        }
        house.add(side1Trim);
        //side2
        int x = side1Trim.length - 1;
        if (availableRoom - rowLength == 0) {
            availableRoom = lenY * 2 - 2;
        } else {
            availableRoom = lenY * 2;
        }
        brickCount = 0;
        rowLength = 0;
        Brick[] side2 = new Brick[availableRoom];
        for (int i = 0; rowLength < availableRoom - 2; i++) {
            if (i == 0 && side1Trim[x].getLength() == 4) {
                side2[i] = new Brick(2);
                rowLength += side2[i].getLength();
                brickCount++;
            }
            if (i == 0 && side1Trim[x].getLength() == 2) {
                side2[i] = new Brick(4);
                rowLength += side2[i].getLength();
                brickCount++;
            }
            if (i > 0 && side2[i - 1].getLength() == 4) {
                side2[i] = new Brick(2);
                rowLength += side2[i].getLength();
                brickCount++;
            }
            if (i > 0 && side2[i - 1].getLength() == 2) {
                side2[i] = new Brick(4);
                rowLength += side2[i].getLength();
                brickCount++;
            }
            if (availableRoom == 4 && side2[i - 1].getLength() == 2) {
                side2[i] = new Brick(4);
                rowLength += side2[i].getLength();
                brickCount++;
            }
            System.out.println("wall 2 length: " + rowLength);
        }
        Brick[] side2Trim = new Brick[brickCount];
        for (int i = 0; i < side2.length; i++) {
            if (side2[i] != null) {
                side2Trim[i] = side2[i];
            }
        }
        house.add(side2Trim);
        //side3
        int z = side2Trim.length - 1;
        if (availableRoom - rowLength == 0) {
            availableRoom = lenX * 2 - 2;
        } else {
            availableRoom = lenX * 2;
        }
        rowLength = 0;
        brickCount = 0;
        Brick[] side3 = new Brick[availableRoom];
        for (int i = 0; rowLength < availableRoom - 2; i++) {

            if (i == 0 && side2Trim[z].getLength() == 4) {
                side3[i] = new Brick(2);
                rowLength += side3[i].getLength();
                brickCount++;
            }
            if (i == 0 && side2Trim[z].getLength() == 2) {
                side3[i] = new Brick(4);
                rowLength += side3[i].getLength();
                brickCount++;
            }
            if (i > 0 && side3[i - 1].getLength() == 4) {
                side3[i] = new Brick(2);
                rowLength += side3[i].getLength();
                brickCount++;
            }
            if (i > 0 && side3[i - 1].getLength() == 2) {
                side3[i] = new Brick(4);
                rowLength += side3[i].getLength();
                brickCount++;
            }
            System.out.println("wall 3 length: " + rowLength);

        }
        Brick[] side3Trim = new Brick[brickCount];
        for (int i = 0; i < side3.length; i++) {
            if (side3[i] != null) {
                side3Trim[i] = side3[i];
            }
        }
        house.add(side3Trim);
        //side4
        int y = side3Trim.length - 1;
        if (availableRoom - rowLength == 0) {
            availableRoom = (lenY * 2) - 4;
        } else {
            availableRoom = (lenY * 2) - 2;
        }
        rowLength = 0;
        brickCount = 0;
        Brick[] side4 = new Brick[availableRoom];
        System.out.println(side4.length);
        for (int i = 0; rowLength < availableRoom; i++) {
            if (i == 0 && side3Trim[y].getLength() == 4) {
                side4[i] = new Brick(2);
                rowLength += side4[i].getLength();
                brickCount++;
                System.out.println("sætter en 2er");
            }
            if (i == 0 && side3Trim[y].getLength() == 2) {
                side4[i] = new Brick(4);
                rowLength += side4[i].getLength();
                brickCount++;
                System.out.println("sætter en 4er");

            }

            if (i > 0 && availableRoom - rowLength == 4) {
                side4[i] = new Brick(4);
                rowLength += side4[i].getLength();
                brickCount++;
                availableRoom = 0;
                System.out.println("finalized");
                break;
            }
            if (i > 0 && side4[i - 1].getLength() == 4) {
                side4[i] = new Brick(2);
                rowLength += side4[i].getLength();
                brickCount++;
                System.out.println("sætter en 2er");

            }
            if (i > 0 && side4[i - 1].getLength() == 2) {
                side4[i] = new Brick(4);
                rowLength += side4[i].getLength();
                brickCount++;
                System.out.println("sætter en 4er");

            }
//            if (i > 0 && side4[i - 1].getLength() == 2 && availableRoom - rowLength == 6) {
//                side4[i] = new Brick(4);
//                rowLength += side4[i].getLength();
//                brickCount++;
//                System.out.println("nej");
//
//            }
//            if (i > 0 && side4[i - 1].getLength() == 4 && availableRoom - rowLength == 2) {
//                side4[i] = new Brick(2);
//                rowLength += side4[i].getLength();
//                brickCount++;
//                System.out.println("dav");
//
//            }
            System.out.println("wall 4 length: " + rowLength);

            System.out.println("availableRoom: " + (availableRoom - rowLength));

        }
        Brick[] side4Trim = new Brick[brickCount];
        for (int i = 0; i < side4.length; i++) {
            if (side4[i] != null) {
                side4Trim[i] = side4[i];
            }
        }

        house.add(side4Trim);
    }

    public HashMap<String, Wall> createHouse(int height, int lenX, int lenY) {
        //wall 1
        try {
            Stykliste house = new Stykliste();
            ArrayList<Brick[]> wall_1 = createWall_1(height, lenX);
            house.put("wall 1", wall_1);
            ArrayList<Brick[]> wall_2 = createWall_2(height, lenY, wall_1, lenX);
            house.put("wall 2", wall_2);
            return house;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //Code for creating Wall 1
    //Creates row of bricks with designated brickAmount
    public Brick[] createRowForWall_1(boolean isEven, int length) {
        int brickAmount = getBrickAmountForWall_1(isEven, length);
        int modu = length % 3;
        try {

            Brick[] row = new Brick[brickAmount];
            setBrickRowFor_wall_1(row, isEven);

            return row;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    private void setBrickRowFor_wall_1(Brick[] row, boolean isEven) {
        for (int i = 0; i < row.length; i++) {
            switch (i) {
                case 0:
                    row[i] = new Brick(2);
                    if (isEven) {

                        row[i].setIsEven(true);
                    } else {
                        row[i].setIsEven(false);
                    }
                    break;
                default:
                    if (row[i - 1].getLength() == 2) {
                        row[i] = new Brick(4);
                        if (isEven) {

                            row[i].setIsEven(true);
                        } else {
                            row[i].setIsEven(false);
                        }
                    } else {
                        row[i] = new Brick(2);
                        if (isEven) {

                            row[i].setIsEven(true);
                        } else {
                            row[i].setIsEven(false);
                        }
                    }
            }
        }
    }

    public int getBrickAmountForWall_1(boolean isEven, int length) {
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

    public int[] wall_1_Status(ArrayList wall_1, int lenX) {
        int firstLength = 0;
        int secLength = 0;
        int[] spareRoom = {0, 0};
        Brick[] firstRow = (Brick[]) wall_1.get(0);
        Brick[] secRow = (Brick[]) wall_1.get(1);
        for (int i = 0; i < firstRow.length; i++) {
            firstLength += firstRow[i].getLength();
        }
        for (int i = 0; i < secRow.length; i++) {
            secLength += secRow[i].getLength();
        }
        spareRoom[0] = (lenX * 2) % firstLength;
        spareRoom[1] = (lenX * 2) % secLength;
        return spareRoom;
    }

    private ArrayList<Brick[]> createWall_1(int height, int lenX) {
        ArrayList<Brick[]> wall_1 = new ArrayList();
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                Brick[] row = createRowForWall_1(true, lenX);
                wall_1.add(row);
                System.out.println("Wall 1: added even row");

            } else {
                Brick[] row = createRowForWall_1(false, lenX);
                wall_1.add(row);
                System.out.println("Wall 1: added Uneven row");

            }

        }
        return wall_1;
    }

    //Code for Wall 2
    public Brick[] createRowForWall_2(boolean isEven, int length, ArrayList<Brick[]> wall_1, int lenX) {
        int brickAmount = getBrickAmountForWall_2(isEven, length, wall_1, lenX);
        int modu = length % 3;
        try {

            Brick[] row = new Brick[brickAmount];
            setBrickRowFor_wall_2(row, isEven, wall_1, lenX);

            return row;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    public int getBrickAmountForWall_2(boolean isEven, int length, ArrayList<Brick[]> wall_1, int lenX) {
        int amount = 0;
        double length_double = (int) length;
        double amount_double;
        int modu = length % 3;
        int[] spareRoom = wall_1_Status(wall_1, lenX);

        if (spareRoom[0] == 0) {
            amount_double = (length_double - 1) / 3 * 2;
            amount = (int) Math.ceil(amount_double);
        }
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

    private void setBrickRowFor_wall_2(Brick[] row, boolean isEven, ArrayList wall_1, int lenX) {
        Brick[] w1row1 = (Brick[]) wall_1.get(0); //wall 1, 1st row
        Brick[] w1row2 = (Brick[]) wall_1.get(1); //wall 1, 2nd row 
        Brick lastBrick1 = w1row1[w1row1.length - 1];
        Brick lastBrick2 = w1row2[w1row2.length - 1];
        for (int i = 0; i < row.length; i++) {
            switch (i) {
                case 0:
                    if (lastBrick2.getLength() == 4) {
                        row[i] = new Brick(2);
                    }
                    if (lastBrick2.getLength() == 2) {
                        row[i] = new Brick(4);
                    }
                    if (isEven) {

                        row[i].setIsEven(true);
                    } else {
                        row[i].setIsEven(false);
                    }

                    break;

                default:
                    if (row[i - 1].getLength() == 2) {
                        row[i] = new Brick(4);
                        if (isEven) {

                            row[i].setIsEven(true);
                        } else {
                            row[i].setIsEven(false);
                        }
                    } else {
                        row[i] = new Brick(2);
                        if (isEven) {

                            row[i].setIsEven(true);
                        } else {
                            row[i].setIsEven(false);
                        }
                    }
            }
        }
    }

    private ArrayList<Brick[]> createWall_2(int height, int lenY, ArrayList<Brick[]> wall_1, int lenX) {
        ArrayList<Brick[]> wall_2 = new ArrayList();

        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {

                Brick[] row = createRowForWall_2(true, lenY, wall_1, lenX);
                wall_2.add(row);
                System.out.println("Wall 2: added even row");

            } else {
                Brick[] row = createRowForWall_2(false, lenY, wall_1, lenX);
                wall_2.add(row);
                System.out.println("Wall 2: added Uneven row");
            }

        }

        return wall_2;
    }
}
