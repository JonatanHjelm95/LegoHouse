/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

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

//        DAO dao = new DAO();
//        User user = new User("neger@hej.dk", "woel");
//        dao.createUser(user);
        LegoLogic ll = new LegoLogic();
//        Brick[] row = ll.createRow(true, 6);
//        for (Brick brick : row) {
//            System.out.println(brick.getLength());
//        }
        
//        Brick[] bricks = ll.createRow(true, 10);
//        for (int i = 0; i < bricks.length; i++) {
//            System.out.println(bricks[i].getLength());
//        }
//        System.out.println(bricks.length);
        System.out.println(8.0 % 3);
        System.out.println(11.0 / 3* 2-1);
        int amount = ll.getBrickAmount(true, 15);
        System.out.println(amount);
    }
    

}
