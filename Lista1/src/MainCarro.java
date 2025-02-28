import exe0.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCarro {
    public static void main(String[] args) {
        // criando objetos da classe Carro
        // instanciar a classe Carro
        Carro obj1 = new Carro(2015, 0.0f, "Chevrolet", "Onix");
        obj1.exibirDetalhes();
        obj1.acelerar( 60);
        obj1.exibirDetalhes();
        obj1.frear(70);
        obj1.exibirDetalhes();


        Carro obj2 = new Carro(2010, 30.0f, "Volks", "Gol");
        obj2.exibirDetalhes();
        obj2.acelerar(50);
        obj2.exibirDetalhes();
        obj2.frear(40);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}