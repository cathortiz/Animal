
package clases;

/**
 *
 * @author Catherin
 */
public class EjemploAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato pupi = new Gato();
        Gato pupa = new Gato(Sexo.HEMBRA);
        pupi.hazRuido();
        pupi.come("Asado");
        pupi.duerme();
        pupi.peleaCon(pupa);
        System.out.println(pupi);
        System.out.println(pupa);
    }
    
}
