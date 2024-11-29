public class Ejercicio3modificarUnArray {
    public static void modificarArray(int[] arr) {
        // Modificar algunos elementos del array
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;  // Duplicar cada elemento
        }
    }

    public static void main(String[] args) {
        // Crear un array inicial
        int[] miArray = {1, 2, 3, 4, 5};
        
        System.out.println("Antes de modificar:");
        for (int num : miArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Modificar el array
        modificarArray(miArray);
        
        System.out.println("Después de modificar:");
        for (int num : miArray) {
            System.out.print(num + " ");
        }
    }
}
