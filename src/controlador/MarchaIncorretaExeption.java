package controlador;

public class MarchaIncorretaExeption extends Exception{
    MarchaIncorretaExeption(String mensagem){
        super(mensagem);
    }
}
