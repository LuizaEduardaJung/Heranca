
package exercicio01;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario1 = new Professor("Biologia", "Luíza", 25, 3000);
        Funcionario funcionario2 = new Administrativo("TI", "Rayan", 24, 4000);
        
        System.out.println(funcionario1.exibirDetalhes());
        System.out.println(funcionario2.exibirDetalhes());
    }
    
}
    

