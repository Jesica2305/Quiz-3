package src;

public class Principal {
    /**
     * primer metodo que se ejecuta
     * @param args
     */
    public static void main(String[]args){
        Ropa blusa = new Ropa("blusa", "rosada");
        Ropa jean = new Ropa("gorra", "azul");
        Ropa medias = new Ropa("manilla", "blanca");

        blusa.colorPrenda();
        jean.colorPrenda();
        medias.colorPrenda();
    }
}
