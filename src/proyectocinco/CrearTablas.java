package proyectocinco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas {
    
    public static void CrearTablas () {
        try{
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/?user=root&password=usbw");
            Statement sentencia=conexion.createStatement();

            sentencia.execute("DROP DATABASE IF EXISTS AGENCIA");
            sentencia.execute("CREATE DATABASE IF NOT EXISTS AGENCIA;");
            sentencia.execute("USE AGENCIA;");
            
            sentencia.execute("CREATE TABLE IF NOT EXISTS clientes ("+
                    "dni VARCHAR(9) NOT NULL, "+
                    "nombre VARCHAR(30) NOT NULL, "+
                    "sexo VARCHAR(10) NOT NULL, "+
                    "edad INT(2) NOT NULL, "+
                    "ciudad VARCHAR(30) NOT NULL, "+
                    "aficiones TEXT NOT NULL, "+
                    "PRIMARY KEY (dni) )"+
                    "ENGINE INNODB;");
         
            sentencia.execute("CREATE TABLE IF NOT EXISTS citas ("+
                    "individuo1 VARCHAR(9) NOT NULL, "+
                    "individuo2 VARCHAR(9) NOT NULL, "+
                    "fecha DATE NOT NULL, "+
                    "lugar VARCHAR(30) NOT NULL, "+
                    "matrimonio VARCHAR(2) NULL, "+
                    "PRIMARY KEY (individuo1, individuo2), "+
                    "FOREIGN KEY (individuo1) "+
                    "   REFERENCES clientes (dni)"+
                    "   ON DELETE CASCADE "+
                    "   ON UPDATE CASCADE, "+
                    " FOREIGN KEY (individuo2) "+
                    "   REFERENCES clientes (dni)"+
                    "   ON DELETE CASCADE "+
                    "   ON UPDATE CASCADE )"+
                    "ENGINE INNODB;");  
            
            conexion.close();
            
            System.out.println("-- CREADA BASE DE DATOS AGENCIA MATRIMONIAL --");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}