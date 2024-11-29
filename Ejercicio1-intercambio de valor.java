public class Ejercicio1-intercambio de valor {
    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método - x: " + x + ", y: " + y);
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Antes de intercambiar - a: " + a + ", b: " + b);
        
        intercambiar(a, b);
        
        System.out.println("Después de intercambiar - a: " + a + ", b: " + b);
    }
    
}