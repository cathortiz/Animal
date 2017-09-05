
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
        Perro lula = new Perro();
        Perro pepe = new Perro(22, Sexo.HEMBRA);
        pepe.hazRuido();
        pepe.peleaCon(lula);
        System.out.println(pepe);
        System.out.println(lula);
        lula.ladrar(5);
        
    }
    
}
