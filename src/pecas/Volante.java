package pecas;

import acoes.VirarDireita;
import acoes.VirarEsquerda;

public class Volante {

    private VirarDireita direita = new VirarDireita();
    private VirarEsquerda esquerda = new VirarEsquerda();
    
    public void direita(){
        direita.movimentar();
    }

    public void esquerda(){
        esquerda.movimentar();
    }
}
