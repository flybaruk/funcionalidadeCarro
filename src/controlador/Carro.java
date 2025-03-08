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

    public void acelerarCarro() throws MarchaIncorretaExeption {
        if (!carroLigado) {
            System.out.println("\nO carro precisa estar ligado para poder acelerar!");
            return;
        }
    
        int novaVelocidade = pedals.getVelocidade() + 1;
        if (novaVelocidade > maxVelocidade) {
            System.out.println("Carro não pode mais ser acelerado!");
            return;
        }
        if (!validarMarcha(novaVelocidade)) { 
            throw new MarchaIncorretaExeption("Marcha incorreta! Ajuste a marcha antes de acelerar.");
        }
    
        pedals.acelerar();
        System.out.println("Velocidade atual: " + pedals.getVelocidade() + " km/h");
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
        if (pedals.getVelocidade() >= 40) {
            volante.direita();
        }else{
            System.out.println("A velocidade precisa chegar em 40km/h para virar o carro");
        }
    }
    public void virarCarroEsquerda(){
        if (pedals.getVelocidade() >= 40) {
            volante.esquerda();
        }else{
            System.out.println("A velocidade precisa chegar em 40km/h para virar o carro");
        }
    }

    private boolean validarMarcha(int novaVelocidade) {
        switch (marcha.getMarchaAtual()) {
            case 1: return novaVelocidade >= 0 && novaVelocidade <= 20;
            case 2: return novaVelocidade > 20 && novaVelocidade <= 40;
            case 3: return novaVelocidade > 40 && novaVelocidade <= 60;
            case 4: return novaVelocidade > 60 && novaVelocidade <= 80;
            case 5: return novaVelocidade > 80 && novaVelocidade <= 100;
            case 6: return novaVelocidade > 100 && novaVelocidade <= 120;
            default: return false;
        }
    }

    
    public void subirMarchaCarro(){
        marcha.aumentar();
    }
    public void diminuirMarchaCarro(){
        marcha.diminuir();
    }
    
}
