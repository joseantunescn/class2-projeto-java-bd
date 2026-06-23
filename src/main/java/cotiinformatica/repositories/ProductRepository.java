package cotiinformatica.repositories;

import cotiinformatica.entities.ProductEntity;

import java.sql.DriverManager;

public class ProductRepository {

    // method to receive a product object and record it into the database
    public void insertObject(ProductEntity  product){
        try {

            // open connection to the database
            var host = "jdbc:postgresql://localhost:5434/bd-produtos";
            var user = "coti";
            var password = "coti";
            var connection = DriverManager.getConnection(host, user, password);

            // sql command to insert a product into the database
            var statement = connection.prepareStatement(
                    "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)"
            );
            statement.setString(1, product.nome);
            statement.setDouble(2, product.preco);
            statement.setInt(3, product.quantidade);
            statement.execute();
            statement.close();
            System.out.println("\nProduct inserted successfully!\n");

        } catch (Exception e) {
            System.out.println("Error inserting product: " + e.getMessage());
        }
    }
}
