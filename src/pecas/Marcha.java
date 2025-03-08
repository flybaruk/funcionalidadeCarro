package pecas;

import acoes.AumentarMarcha;
import acoes.DiminuirMarcha;

public class Marcha {
    private int marchaAtual = 0;
    private AumentarMarcha aumentar = new AumentarMarcha();
    private DiminuirMarcha diminuir = new DiminuirMarcha();

    public void aumentar(){
        if (marchaAtual >= 6) {
            System.out.println("já está na maior macha possivel");
        }
        else{
            System.out.println("Aumentando marcha");
            aumentar.aumentar(marchaAtual);
        }
    }

    public void diminuir(){
        if (marchaAtual <= 0) {
            System.out.println("já está na menor macha possivel");
        }
        else{
            System.out.println("Diminuindo marcha");
            diminuir.diminuir(marchaAtual);
        }
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }
}
