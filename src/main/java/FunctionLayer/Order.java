/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Jonatan
 */
public class Order {
    private int id;
    private int userid;
    private int legohouselength;
    private int legohousewidth;
    private int legohouseheigth;
    private String currentStatus;

    public Order(int id, int userid, int legohouselength, int legohousewidth, int legohouseheigth, String currentStatus) {
        this.id = id;
        this.userid = userid;
        this.legohouselength = legohouselength;
        this.legohousewidth = legohousewidth;
        this.legohouseheigth = legohouseheigth;
        this.currentStatus = currentStatus;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public int getLegohouselength() {
        return legohouselength;
    }

    public int getLegohousewidth() {
        return legohousewidth;
    }

    public int getLegohouseheigth() {
        return legohouseheigth;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", userid=" + userid + ", legohouselength=" + legohouselength + ", legohousewidth=" + legohousewidth + ", legohouseheigth=" + legohouseheigth + ", currentStatus=" + currentStatus + '}';
    }
    
    
}
