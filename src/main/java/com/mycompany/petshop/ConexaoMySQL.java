package com.mycompany.petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    public static Connection conectar() {
        Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/Petshop";
        String usuario = "root";
        String senha = "Roma1616#";

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso ao banco de dados!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return conexao;
    }

    public static void main(String[] args) {
        conectar();
    }
}