import controlador.Carro;

public class Motorista {

    static void acelerar(Carro carro){
        try {
            carro.acelerarCarro();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Carro carro = new Carro();

        acelerar(carro);

        System.out.println(carro.carroLigado());
        carro.ligarCarro();
        System.out.println(carro.carroLigado());
        carro.subirMarchaCarro();
        
        for (int i = 0; i < 20; i++) {
            acelerar(carro);
        }
        carro.subirMarchaCarro();
        acelerar(carro);

        
    }
}
