/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.FloorLayOut;
import FunctionLayer.LegoHouseException;
import FunctionLayer.LegoHouseFactory;
import FunctionLayer.LineItem;
import FunctionLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jonatan
 */
public class PlaceOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LegoHouseException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        int L = Integer.parseInt(request.getParameter("length"));
        int W = Integer.parseInt(request.getParameter("width"));
        int H = Integer.parseInt(request.getParameter("height"));
        FloorLayOut list = LegoHouseFactory.buildLegoHouse(user, L, W, H);
        request.setAttribute("LineItems", list);
        return "confirmation";
    }
    
}
