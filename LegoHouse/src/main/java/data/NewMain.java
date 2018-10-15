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
        ArrayList<Brick[]> wall = ll.createHouse(5, 6, 5);
        for (int i = 0; i < wall.size(); i++) {
            for (int j = 0; j < wall.get(i).length; j++) {
                System.out.println(wall.get(i)[j].getLength());
            }
                System.out.println("___");
        }
    }

}
