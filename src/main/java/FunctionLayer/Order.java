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
    private String currentStatus;

    public Order(int id, int userid, String currentStatus) {
        this.id = id;
        this.userid = userid;
        this.currentStatus = currentStatus;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", userid=" + userid + ", currentStatus=" + currentStatus + '}';
    }
    
}
