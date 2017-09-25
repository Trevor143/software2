package proj;
import java .sql.PreparedStatement;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
public class Database {
 private static String user="root";
 private static String password="";
 private static String dbName="timetable";
 private static String urL="jdbc:mysql://localhost:3306/";
  private static String driver="com.mysql.jdbc.Driver";
  private static Connection connection=null;
      ResultSet rs;
      PreparedStatement pst;
      Statement stm;


public  Database(){
    try{
Class.forName(driver);
connection=DriverManager.getConnection(urL+dbName,user,password);
    System.out.println("Connection created");

    JOptionPane.showMessageDialog(null,"Open");
    return ;
}catch(SQLException | ClassNotFoundException e){
    System.out.println(e.getMessage());;
}    
}
    public static void main(String[] args) {
        new Database();
    }
}
    