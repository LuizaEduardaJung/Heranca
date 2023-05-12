
package exercicio02;

    public class Moto extends Veiculo{
    
    private boolean possuiPartidaEletrica;

    public Moto(boolean possuiPartidaEletrica, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public String exibirDetalhes() {
        return "Moto{" + super.exibirDetalhes()+ " possuiPartidaEletrica=" + possuiPartidaEletrica + '}';
    }

    @Override
    public double calcularVelocidadeMaxima() {
        return 180.0;
    }
    
    
    
}
