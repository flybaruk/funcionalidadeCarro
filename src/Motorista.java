import controlador.Carro;

public class Motorista {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.acelerarCarro();

        System.out.println(carro.carroLigado());
        carro.ligarCarro();
        System.out.println(carro.carroLigado());
        carro.acelerarCarro();
    }
}
