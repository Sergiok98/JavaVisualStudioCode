package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

    public final static String CADENA_CONEXION = "jdbc:mariadb://localhost:3306/banco";
    public final static String USER = "root";
    public final static String PASS = "";

    /**
     * Mostrar productos con la referencia que indique el usuarios
     */
    public static void apartado1() {    
            try (Connection conn = DriverManager.getConnection(CADENA_CONEXION, USER, PASS)) {
                PreparedStatement stOrigin = conn.prepareStatement("UPDATE cuenta SET saldo = saldo - ? WHERE numero = ?");
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args) {
        
        apartado1();

    }
}
