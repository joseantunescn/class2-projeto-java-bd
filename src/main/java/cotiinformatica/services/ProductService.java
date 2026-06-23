package cotiinformatica.services;

import cotiinformatica.entities.ProductEntity;
import cotiinformatica.repositories.ProductRepository;

import java.util.Scanner;

public class ProductService {

    public void fillOutProducts() {
        System.out.println("\nCADASTRO DE PRODUTOS\n");

        var product = new ProductEntity();

        var scanner = new Scanner(System.in);

        System.out.print("NOME: ");
        product.nome = scanner.nextLine();
        System.out.println("PRECO: ");
        product.preco = Double.parseDouble(scanner.nextLine());
        System.out.println("QUANTIDADE: ");
        product.quantidade = Integer.parseInt(scanner.nextLine());

        product.printData();

        System.out.print("Deseja salvar este produto? (S/N): ");
        var option = scanner.nextLine();
        if(option.equalsIgnoreCase("S")) {

            var productRepository = new ProductRepository();
            productRepository.insertObject(product);


        }
        else {
            System.out.println("\nProduct not saved.\n");
        }
    }
}
