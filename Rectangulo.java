
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 10;
        r.alto = 20;
    }
    

    public int getAncho() {
        return ancho;
    }
    
    public int getAlto() {
        return alto;
    }
    
   
    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo(5, 7);
            
        System.out.println("Antes de modificar:");
        System.out.println("Ancho: " + rect.getAncho());
        System.out.println("Alto: " + rect.getAlto());
            

        modificarRectangulo(rect);
            
        System.out.println("Después de modificar:");
        System.out.println("Ancho: " + rect.getAncho());
        System.out.println("Alto: " + rect.getAlto());
    }
}


