public class Ejercicio4pasoPorValor {
    public static int incrementar(int x) {
        x = x + 1; 
        return x; 
    }

    public static void main(String[] args) {
        int x = 5; 
        System.out.println("Valor de x antes de llamar a incrementar: " + x);

        int resultado = incrementar(x);

        System.out.println("Valor de x después de llamar a incrementar (sin usar el resultado): " + x);

        System.out.println("Valor retornado por el método incrementar: " + resultado);

        x = incrementar(x);
        System.out.println("Valor de x después de asignar el resultado: " + x);
    }
}
