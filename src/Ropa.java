package src;

/**
 * Clase src.Ropa
 */
public class Ropa {
    /**
     * Atributos:
     */
    String nombre;
    String color;

    /**
     * constructor de la clase
     * @param nombre Nombre de la prenda
     * @param color Color de la prenda
     */
    Ropa(String nombre, String color){
        this.nombre= nombre;
        this.color = color;
    }
    /**
     * metodo que imprime el color de la prenda
     */
    void colorPrenda(){
        System.out.println("La " + nombre + " es de color " + color);
    }
}
