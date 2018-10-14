/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Jonatan
 */
public class Wall {

    public Wall() {
    }
    
    ArrayList<Brick[]> Wall;

    public ArrayList<Brick[]> getWall() {
        return Wall;
    }

    public void setWall(ArrayList<Brick[]> Wall) {
        this.Wall = Wall;
    }

    public Wall(ArrayList<Brick[]> Wall) {
        this.Wall = new ArrayList<Brick[]>();
    }
}
