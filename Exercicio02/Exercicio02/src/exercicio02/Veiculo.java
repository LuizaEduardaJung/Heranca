/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
       
    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
    
    public abstract double calcularVelocidadeMaxima();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String exibirDetalhes () {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", velocidade máx="+ calcularVelocidadeMaxima();
    }
    
    
    
    
}
