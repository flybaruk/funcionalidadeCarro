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
            marchaAtual = aumentar.aumentar(marchaAtual);
            System.out.println("Aumentando marcha para "+marchaAtual);
        }
    }

    public void diminuir(){
        if (marchaAtual <= 0) {
            System.out.println("já está na menor macha possivel");
        }
        else{
            marchaAtual = diminuir.diminuir(marchaAtual);
            System.out.println("Diminuindo marcha para "+marchaAtual);
        }
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }
}
