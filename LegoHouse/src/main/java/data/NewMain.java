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

        printHouse();
    }

    private static void printHouse() {
        LegoLogic ll = new LegoLogic();
        Stykliste liste = (Stykliste) ll.createHouse(5, 6, 5);
        System.out.println(liste.get("wall 1"));
        ArrayList wall_1 = (ArrayList) liste.get("wall 1");
        for (int i = 0; i < wall_1.size(); i++) {
            Brick[] rows = (Brick[]) wall_1.get(i);
            for (int j = 0; j < rows.length; j++) {
                System.out.println(rows[j].getLength());
            }
            System.out.println("___");
        }
    }

}
