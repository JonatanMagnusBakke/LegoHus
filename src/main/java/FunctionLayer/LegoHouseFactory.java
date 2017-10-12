/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

/**
 *
 * @author Jonatan
 */
public class LegoHouseFactory {
    
    public static void buildLegoHouse(User user, int length, int width, int height) throws LegoHouseException{
        int lbrick4 = length / 4;
        int lbrick2 = (length % 4) / 2;
        int lbrick1 = (length % 2);
        width = width -4;
        int wbrick4 = width / 4;
        int wbrick2 = (width % 4) / 2;
        int wbrick1 = (width % 2);
        System.out.println(lbrick4 + " " + lbrick2 + " " + lbrick1 + "\n" + wbrick4 + " " + wbrick2 + " " + wbrick1);
        OrderMapper.createOrder(user);
        int orderId = OrderMapper.getOrder(user);
        OrderMapper.createLineItem(user.getId(), lbrick4, lbrick2, lbrick1, wbrick4, wbrick2, wbrick1, height);
        
    }

    public static void main(String[] args) throws LegoHouseException {
        
        User user = UserMapper.login("nicolai@bakke.net", "bakke");
        List<LineItem> list = OrderMapper.getLineItems(user.getId());
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        //LegoHouseFactory.buildLegoHouse(user, 13, 12, 3);
    }
    
    
    
}
