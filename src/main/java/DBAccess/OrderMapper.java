/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LegoHouseException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonatan
 */
public class OrderMapper {
    public static void createOrder(User user, int length, int width, int height) throws LegoHouseException{
        try {
            String sql = "INSERT INTO orders SET userid = ?, legohouselength = ?, legohousewidth = ?, legohouseheight = ?;";
            PreparedStatement userPstmt = Connector.connection().prepareStatement(sql);
            userPstmt.setInt(1, user.getId());
            userPstmt.setInt(2, length);
            userPstmt.setInt(3, width);
            userPstmt.setInt(4, height);
            userPstmt.executeUpdate();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LegoHouseException( ex.getMessage() );
        }
    }
    
    public static int getOrder(User user) throws LegoHouseException{
        Statement stm;
        try {
            stm = Connector.connection().createStatement();
            String sql = "SELECT id FROM orders WHERE currentStatus = 'Open' AND userid = "+user.getId() + ";";
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                throw new LegoHouseException( "Could not find Order" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LegoHouseException(ex.getMessage());
        }
    }
    
    public static List<Order> getOrders()throws LegoHouseException{
        List<Order> orderList = new ArrayList();
        Statement stm;
        try {
            stm = Connector.connection().createStatement();
            String sql = "SELECT * FROM orders WHERE currentStatus = 'Open'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                orderList.add(new Order(rs.getInt("id"), rs.getInt("userid"), rs.getInt("legohouselength"), rs.getInt("legohousewidth"), rs.getInt("legohouseheight"), rs.getString("currentStatus")));
            }
            return orderList;
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LegoHouseException(ex.getMessage());
        }
    }
    
    public static void closeOrder(int orderId)throws LegoHouseException{
        try {
            String sql = "UPDATE orders SET currentStatus = 'Closed' WHERE id = ?;";
            PreparedStatement userPstmt = Connector.connection().prepareStatement(sql);
            userPstmt.setInt(1, orderId);
            userPstmt.executeUpdate();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LegoHouseException( ex.getMessage() );
        }
    }
    
    
    
}
