package prova;

public class Principal {
    public static void main(String[] args) {
        Produto produto01 = new Produto(21, "Sabão em Pó", "Sabão em Pó Omo Multi Ação", 2009, "Protect", 25.50);
        Setor setor01 = new Setor(31, "LPZ", "Limpeza");
        produto01.setSetor(setor01);

        Produto produto02 = new Produto(45, "Creme Dental", "Creme Dental Tripla Ação", 2002, "Protect", 9.90, new Setor(1035, "HGN", "Higiene"));

        System.out.println(produto01.toString());
        produto01.reajustarPreco(10);
        System.out.println("Preço do produto 01 após reajuste de 10%: " + produto01.toString());
        System.out.println("--------------------------------------------");
        System.out.println(produto02.toString());
        produto02.reajustarPreco(20);
        System.out.println("Preço do produto 02 após reajuste de 20%: " + produto02.toString());
        System.out.println("--------------------------------------------");

        produto01.descontarPreco(5);
        System.out.println("Preço do produto 01 após desconto de 5%: " + produto01.toString());
        System.out.println("--------------------------------------------");
        produto02.descontarPreco(7);
        System.out.println("Preço do produto 02 após desconto de 7%: " + produto02.toString());
        System.out.println("--------------------------------------------");



    }
}
