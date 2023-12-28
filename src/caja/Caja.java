package caja;

/**
 *
 * @author Santiago Emanuel Castillo
 */
public class Caja {
    int ancho;
    int alto;
    int profundida;
    
    public Caja(){
        
    }
    
    public Caja(int ancho, int alto, int profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundida = profundidad;
    }
    
    public void calcularVolumen(){
        int volumen = this.ancho * this.alto * this.profundida;
        System.out.println("El volumen de la caja creada es: " + volumen);
    }
    
}
