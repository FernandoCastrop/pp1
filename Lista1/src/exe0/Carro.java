package exe0;
import javax.swing.*;

public class Carro {
    // variaveis
    // tipo de dados primitivo
    public int ano;
    public float velocidade;
    // tipo de dado é uma classe
    public String marca, modelo;

    // metodos construtores
    // em parâmetros
    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazia";
    }

    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void exibirDetalhes(){
        //this representa o objeto que chama o metodo
        JOptionPane.showMessageDialog(null,"Marca: " + this.marca +
                " | Modelo: " + this.modelo +
                " | Ano: " + this.ano +
                " | Velocidade: " + this.velocidade);
    }

    public void acelerar(float x){
        this.velocidade += x;
    }
    public void frear(float x){
        if(this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else{
            System.out.println("Freagem não ocorreu");
        }
    }
}
