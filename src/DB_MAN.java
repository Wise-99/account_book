import java.sql.*;
import java.io.*;
import java.util.*;

public class DB_MAN {
    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = "WRITE_YOUR_SQL_URL";
    String strUser = "root";
    String strPWD = "WRITE_YOUR_PASSWD";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try{
        Class.forName(strDriver);

        DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
        DB_stmt = DB_con.createStatement();
        }catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try{
            DB_stmt.close();
            DB_con.close();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
}
