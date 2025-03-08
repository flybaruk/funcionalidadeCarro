package controlador;

public class MarchaIncorreExeption extends Exception{
    protected MarchaIncorreExeption(){
        System.out.println("É preciso ajustar a marcha");
    }
}
