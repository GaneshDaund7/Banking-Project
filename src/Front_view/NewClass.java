/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front_view;
import java.util.Date;
import java.text.*;
/**
 *
 * @author Abhijeet_
 */
public class NewClass {
    public static void main(String[] args) {
        
        
    }
    public static String getdate()
    {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String frmtdDate = dateFormat.format(date);
        return frmtdDate; 
    }
    public static String gettime()
    {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date();
        String frmtdDate1 = dateFormat1.format(date);
        return frmtdDate1; 
    }
}
