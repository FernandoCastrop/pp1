package exe2;
public class Cliente {
    public int numAgencia, numConta; // tipo primitivo
    public String nome; // tipo de classe
    public float saldo; // tipo primitivo

    // metodo construtor sem parametro
    public Cliente(){
        this.nome = "Sem nome";
    }

    //metodo construtor com parametro
    public Cliente(int numAgencia, int numConta, String nome, float saldo){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.nome =  nome;
        this.saldo =  saldo;
    }

    //realizar deposito
    public void depositar(float x){
        this.saldo += x;
    }
    public void exibirDetalhes(){
        System.out.println(("Num Conta: " + this.numConta +
                " Num Agencia: " + this.numAgencia +
                " Nome: " + this.nome +
                " Saldo: " + this.saldo));
    }
    //realizar o saldo
    public void sacar(float x){
        if(this.saldo >= x){
            this.saldo -= x;
            System.out.println("Saque realizado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}