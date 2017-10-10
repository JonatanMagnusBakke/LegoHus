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
public class LegoHouseFactory {
    
    public static void buildLegoHouse(int length, int width, int hight){
        int lbrick4 = length / 4;
        int lbrick2 = (length % 4) / 2;
        int lbrick1 = (length % 2);
        width = width -4;
        int wbrick4 = width / 4;
        int wbrick2 = (width % 4) / 2;
        int wbrick1 = (width % 2);
        System.out.println(lbrick4 + " " + lbrick2 + " " + lbrick1 + "\n" + wbrick4 + " " + wbrick2 + " " + wbrick1);
        
    }

    public static void main(String[] args) {
        LegoHouseFactory.buildLegoHouse(13, 9, 6);
    }
    
    
    
}
