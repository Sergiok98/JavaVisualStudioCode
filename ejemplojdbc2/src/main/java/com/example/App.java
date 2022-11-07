package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

    public final static String CADENA_CONEXION = "jdbc:mariadb://localhost:3306/product-manager";
    public final static String USER = "root";
    public final static String PASS = "";

    /**
     * Mostrar productos con la referencia que indique el usuarios
     */
    public static void apartado1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("referencia del producto");
        String referencia = sc.nextLine();
        String sql = "SELECT * FROM product WHERE reference = '" + referencia + "'";

        try (Connection conn = DriverManager.getConnection(CADENA_CONEXION, USER, PASS)) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String ref = rs.getString("reference");
                String name = rs.getString("name");
                int precio = rs.getInt("price");
                System.out.println(id + " - " + ref + " - " + name + " - " + precio);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        sc.close();
    }

    public static void main(String[] args) {
        
        apartado1();

    }
}
