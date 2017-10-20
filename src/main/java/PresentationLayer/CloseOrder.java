/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LegoHouseException;
import FunctionLayer.Order;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonatan
 */
public class CloseOrder extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LegoHouseException {
        request.removeAttribute("Orders");
        OrderMapper.closeOrder(Integer.parseInt(request.getParameter("orderId")));
        List<Order> list = OrderMapper.getOrders();
        request.setAttribute("Orders", list);
        return "AllOrders";
    }
    
}
