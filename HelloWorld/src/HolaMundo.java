import java.util.Arrays;
import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {
        
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 11;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 15;

        String nombre;
        nombre = "Andres";

        if (numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        //comentario1 * líneas
        /*comentario2 * se puede bloque completo*/
        /*
        también se puede comentar seleccionando en texto o bloque a comentar
        y en el menu opciones en la opción code y sub_opción comment with line or Block
        */



    }
}
