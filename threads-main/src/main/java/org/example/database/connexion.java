package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
    Connection con ;

    public connexion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=  DriverManager.getConnection("jdbc:mysql://localhost:8888/javathread","root","");

    }
    public Connection getConnection(){
        return con;
    }
}
