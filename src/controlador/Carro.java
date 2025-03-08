package controlador;

import pecas.Marcha;
import pecas.Motor;
import pecas.Pedals;
import pecas.Volante;

public class Carro {

    final int maxVelocidade = 120;
    boolean carroLigado = false;

    Marcha marcha = new Marcha();
    Motor motor = new Motor();
    Pedals pedals = new Pedals();
    Volante volante = new Volante();
    

    public void ligarCarro(){
        motor.ligarMotor();
        carroLigado = motor.getLigado();
    }

    public boolean carroLigado(){
        return carroLigado;
    }

    public void acelerarCarro(){
        if (carroLigado) {
            if(permissaoMovimentarMarcha()){
                if (pedals.getVelocidade() >= maxVelocidade) {
                    System.out.println("Carro não pode mais ser acelerado");
                }else{
                    pedals.acelerar();
                }
            }else{
                System.out.println("Precisa ajustar a marcha do carro para poder movimentar o carro");
            }
        }else{
            System.out.println("O carro precisa ser ligado para poder acelerar");
            
        }
    }

    public void frearCarro(){
        if (carroLigado) {
            if (pedals.getVelocidade() <= 0) {
                System.out.println("Carro já está parado");
            }else{
                pedals.frear();
                
            }
        }else{
            System.out.println("O carro precisa estar ligado para pode frear");
        }
    }

    public void virarCarroDireita(){
        volante.direita();
    }
    public void virarCarroEsquerda(){
        volante.esquerda();
    }

    private boolean permissaoMovimentarMarcha(){
        if (pedals.getVelocidade() == 0) {
            
        }
        return true;
    }
    public void subirMarchaCarro(){
        
    }
    
}
