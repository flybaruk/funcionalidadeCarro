package pecas;

import acoes.Acelerar;
import acoes.Frear;

public class Pedals {
    private int velocidade = 0;
    private Acelerar acelerar = new Acelerar();
    private Frear frear = new Frear();
    
    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(){
        velocidade = acelerar.acelerar(velocidade);
        System.out.println("Aumentando a velocidade para: "+velocidade);
    }

    public void frear(){
        velocidade = frear.freiar(velocidade);
        System.out.println("Diminuindo a velocidade para: "+velocidade);
    }
}
