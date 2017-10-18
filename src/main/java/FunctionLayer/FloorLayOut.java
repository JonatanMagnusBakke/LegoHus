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
public class FloorLayOut {
    private int lbrick4;
    private int lbrick2;
    private int lbrick1;
    private int wbrick4;
    private int wbrick2;
    private int wbrick1;

    public FloorLayOut(int lbrick4, int lbrick2, int lbrick1, int wbrick4, int wbrick2, int wbrick1) {
        this.lbrick4 = lbrick4;
        this.lbrick2 = lbrick2;
        this.lbrick1 = lbrick1;
        this.wbrick4 = wbrick4;
        this.wbrick2 = wbrick2;
        this.wbrick1 = wbrick1;
    }

    public int getLbrick4() {
        return lbrick4;
    }

    public int getLbrick2() {
        return lbrick2;
    }

    public int getLbrick1() {
        return lbrick1;
    }

    public int getWbrick4() {
        return wbrick4;
    }

    public int getWbrick2() {
        return wbrick2;
    }

    public int getWbrick1() {
        return wbrick1;
    }

    @Override
    public String toString() {
        return "FloorLayOut{" + "lbrick4=" + lbrick4 + ", lbrick2=" + lbrick2 + ", lbrick1=" + lbrick1 + ", wbrick4=" + wbrick4 + ", wbrick2=" + wbrick2 + ", wbrick1=" + wbrick1 + '}';
    }
    
    
    
    public String floorLayOut2HTML() {
        String res;
        res = "<table class=\"table table-bordered\">"
                + "<thead>"
                + "<tr>"
                + "<th>Type</th>"
                + "<th>side1</th>"
                + "<th>side2</th>"
                + "<th>side3</th>"
                + "<th>side4</th>"
                + "<th>ialt x højde</th>"
                + "</tr>"
                + "</thead>"
                + "<tbody>"
                + "<tr>"
                + "<td>2x4</td>"
                + "<td>"+lbrick4+"</td>"
                + "<td>"+wbrick4+"</td>"
                + "<td>"+lbrick4+"</td>"
                + "<td>"+wbrick4+"</td>"
                + "<td>"+(lbrick4 + wbrick4 + lbrick4 + wbrick4) + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>2x2</td>"
                + "<td>"+lbrick2+"</td>"
                + "<td>"+wbrick2+"</td>"
                + "<td>"+lbrick2+"</td>"
                + "<td>"+wbrick2+"</td>"
                + "<td>"+(lbrick2 + wbrick2 + lbrick2 + wbrick2) + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>1x2</td>"
                + "<td>"+lbrick1+"</td>"
                + "<td>"+wbrick1+"</td>"
                + "<td>"+lbrick1+"</td>"
                + "<td>"+wbrick1+"</td>"
                + "<td>"+(lbrick1 + wbrick1 + lbrick1 + wbrick1) + "</td>"
                + "</tr>"
                + "</tbody"
                + "</table>";
        return res;
    }
    
}
