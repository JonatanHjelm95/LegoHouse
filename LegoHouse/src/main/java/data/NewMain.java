/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
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

        LegoLogic ll = new LegoLogic();

//        Brick[] firstRow = ll.createRow(true, 6);
//        Brick[] secRow = ll.createRow(false, 6);
//        for (Brick brick : firstRow) {
//            System.out.println(brick.getLength());
//        }
//        System.out.println("break");
//        for (Brick brick : secRow) {
//            System.out.println(brick.getLength());
//        }
//        
        ArrayList<Wall> hus = ll.createHouse(4, 6, 8);
        ArrayList<Brick[]> wall_1 = hus.get(0).Wall;
        for (int i = 0; i < wall_1.size(); i++) {
            Brick[] row1 = wall_1.get(i);
            System.out.println(row1[i].getLength());

        }
    }

}
