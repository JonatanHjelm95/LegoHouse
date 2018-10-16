/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.HashMap;
import logic.LegoLogic;

/**
 *
 * @author jonab
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        printHouse();
        LegoLogic ll = new LegoLogic();
        ll.test(4, 3, 8);
        ArrayList<Brick[]> house = ll.getHouse();
        for (int i = 0; i < house.size(); i++) {
            Brick[] row = house.get(i);
            for (int j = 0; j < row.length; j++) {
                if (row[j] != null) {
                    System.out.println(row[j].getLength());
                }
            }
            System.out.println("___");
            //4x10 virker
            //6x6 virker
            //5x8 virker
        }
//        Brick[] test = house.get(3);
//        System.out.println(test.length);
//        int length = 6*2;
//        int maxAmount = 8;
//          int amount = ll.getBrickAmount(true, 6);
//          System.out.println(amount);

    }

    private static void printHouse() {
        LegoLogic ll = new LegoLogic();

        Stykliste liste = (Stykliste) ll.createHouse(5, 6, 5);
        ArrayList wall_1 = (ArrayList) liste.get("wall 1");
        ArrayList wall_2 = (ArrayList) liste.get("wall 2");
        for (int i = 0; i < wall_1.size(); i++) {
            Brick[] rows = (Brick[]) wall_1.get(i);
            for (int j = 0; j < rows.length; j++) {
                System.out.println(rows[j].getLength());
                System.out.println(rows[j].isIsEven());
            }
            System.out.println("___");
        }
        ll.wall_1_Status(wall_1, 6);
        System.out.println("wall 2");
        for (int i = 0; i < wall_2.size(); i++) {
            Brick[] rows2 = (Brick[]) wall_2.get(i);
            for (int j = 0; j < rows2.length; j++) {
                System.out.println(rows2[j].getLength());
                System.out.println(rows2[j].isIsEven());
            }
            System.out.println("___");
        }
    }

}
