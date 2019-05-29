/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;
import java.sql.*;

/**
 *
 * @author IceFox
 */
public class Studentdatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              try{

String url = "jdbc:mysql://127.0.0.1:3306/";

String dbName = "studentdata";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root";
          String password = "root";


  //Class.forName(driver).newInstance();
          Connection conn = DriverManager.getConnection(url+dbName,userName,password);

}
catch (SQLException err) {
  System.out.println(err.getMessage());
}

        
        
        
        
        
        
        
        
        
        
        
    }}