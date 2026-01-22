package com.klu;
import java.sql.*;
public class Table {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fsad52";
        String usr = "root";
        String pwd = "root";

   try {
   Connection con = DriverManager.getConnection(url, usr, pwd);
System.out.println("Connection established");
String createDept ="CREATE TABLE IF NOT EXISTS department (" +"dept_id INT PRIMARY KEY AUTO_INCREMENT, " + "dept_name VARCHAR(50)" + ")";
 Statement st = con.createStatement();
            st.executeUpdate(createDept);
            System.out.println(" department table created successfully!");
            String createEmp = "CREATE TABLE IF NOT EXISTS employee1(" +"emp_id INT PRIMARY KEY, " +"emp_name VARCHAR(50), " + "salary DOUBLE, " + "dept_id INT, " + "FOREIGN KEY (dept_id) REFERENCES department(dept_id)" +")";
            Statement st1= con.createStatement();
           st1.executeUpdate(createEmp);
           System.out.println(" employee table created successfully!");
           st.executeUpdate("INSERT INTO department values(3,'charlie')");
           
            st1.executeUpdate("INSERT INTO employee1 values(100,'charlie',5000,3)");
            

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}