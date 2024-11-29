public class Ejercicio5-pasarCadenaPorValor {
    public static void modificarCadena(String texto) {
        texto = texto + " - Modificado"; 
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String cadena = "Texto original"; 
        System.out.println("Antes de llamar al método: " + cadena);
        
        modificarCadena(cadena);

        System.out.println("Después de llamar al método: " + cadena);
    }
}
