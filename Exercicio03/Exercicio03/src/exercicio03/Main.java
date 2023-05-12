
package exercicio03;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto1 = new Livro("V. E. Schwab", "A Vida Invisivel de Addie LaRue", 250.23);
        Produto produto2 = new CD("Lana Del Rey", "Young and Beautiful", 15.23);
       
        System.out.println(produto1.exibirDetalhes());
        System.out.println(produto2.exibirDetalhes());
    }
    
}
