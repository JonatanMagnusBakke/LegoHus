/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LegoHouseException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jonatan
 */
public class OrderMapper {
    public static void createOrder(User user) throws LegoHouseException{
        try {
            String sql = "INSERT INTO orders set userid = ?;";
            PreparedStatement userPstmt = Connector.connection().prepareStatement(sql);
            userPstmt.setInt(1, user.getId());
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
    
    public static void createLineItem(int orderId) throws LegoHouseException{
        try {
            String sql = "";
            PreparedStatement userPstmt = Connector.connection().prepareStatement(sql);
            userPstmt.setInt(1, orderId);
            userPstmt.executeUpdate();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LegoHouseException( ex.getMessage() );
        }
    }
    
    
    
}
