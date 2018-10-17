/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Timestamp;

/**
 *
 * @author Jonatan
 */
public class Order {

    private int OrderID, height, lenX, lenY, noBricks, TotalPrice;
    private String status;
    private Timestamp created;

    public Order(int OrderID, int height, int lenX, int lenY, int noBricks, int TotalPrice, String status) {
        this.OrderID = OrderID;
        this.height = height;
        this.lenX = lenX;
        this.lenY = lenY;
        this.noBricks = noBricks;
        this.TotalPrice = TotalPrice;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getHeight() {
        return height;
    }

    public int getLenX() {
        return lenX;
    }

    public int getLenY() {
        return lenY;
    }

    public int getNoBricks() {
        return noBricks;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public String getStatus() {
        return status;
    }

    public Timestamp getCreated() {
        return created;
    }

}
