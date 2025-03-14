import exe4.Rio;
public class MainRio {
    public static void main(String[] args){
        // chama o objeto produto sem parâmetro
        Rio obj1 = new Rio();

        // chama o objeto produto com parâmetro
        Rio obj2 = new Rio("Tiete", 7.0f, false);
        System.out.println(obj1.exibirDetalhes());
        System.out.println(obj2.exibirDetalhes());
        obj2.poluir();
        obj2.limpar();
        obj2.chover(4);
        obj2.ensolarar(6);

    }
}
