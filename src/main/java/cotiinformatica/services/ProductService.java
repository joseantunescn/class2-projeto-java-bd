package cotiinformatica.services;

import cotiinformatica.entities.ProductEntity;

import java.util.Scanner;

public class ProductService {

    public void fillOutProducts() {
        System.out.println("\nCADASTRO DE PRODUTOS\n");

        var product = new ProductEntity();

        var scanner = new Scanner(System.in);

        System.out.print("ID: ");
        product.id = Integer.parseInt(scanner.nextLine());
        System.out.print("NOME: ");
        product.nome = scanner.nextLine();
        System.out.println("PRECO: ");
        product.preco = Double.parseDouble(scanner.nextLine());
        System.out.println("QUANTIDADE: ");
        product.quantidade = Integer.parseInt(scanner.nextLine());

        product.printData();

    }
}
