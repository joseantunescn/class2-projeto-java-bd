package cotiinformatica.entities;

public class ProductEntity {

    public Integer id;
    public String nome;
    public Double preco;
    public Integer quantidade;

    public void printData() {
        System.out.println("\nDADOS DO PRODUTO:\n");
        System.out.println("\tID: " + id);
        System.out.println("\tNOME: " + nome);
        System.out.println("\tPRECO: " + preco);
        System.out.println("\tQUANTIDADE: " + quantidade);
        System.out.println("\tTOTAL: " + (preco * quantidade));
    }


}
