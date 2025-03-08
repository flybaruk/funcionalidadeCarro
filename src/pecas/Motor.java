package pecas;

import acoes.Desligar;
import acoes.Ligar;

public class Motor {
    private boolean ligado = false;
    private Ligar ligar = new Ligar();
    private Desligar desligar = new Desligar();

    public void ligarMotor(){
        if (ligado) {
            System.out.println("O carro já está ligado");
        }else{
            System.out.println("Ligando Carro");
            ligado = ligar.ligar();
        }
    }
    public void desligar(){
        if (ligado) {
            System.out.println("Desligando carro");
            ligado = desligar.desligar();
            
        }else{
            System.out.println("Carro já está desligado");
        }  
    }

    public boolean getLigado(){
        return ligado;
    }
    
}
