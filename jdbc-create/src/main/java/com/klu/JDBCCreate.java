package com.klu;
import java.sql.*;

public class JDBCCreate {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
String url="jdbc:mysql://localhost:3306/fsad52";
String usr="root";
String pwd="root";
try {
  Connection con=DriverManager.getConnection(url,usr,pwd);
  System.out.println("Connection established");
  String query ="create table if not exists Student ("+"id int primary key auto_increment,"+"name varchar(20)"+")";
  Statement st =con.createStatement();
  st.execute(query);
  System.out.println("table created");
  con.close();
}catch(Exception e) {
  e.printStackTrace();
}
  }

}