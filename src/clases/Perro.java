package clases;

/**
 *
 * @author Catherin
 */
public class Perro extends Animal implements Mascota{
    private int peso;

    public Perro() {
        peso = 10;
    }

    public Perro(Sexo s) {
        super(s);
        peso = 10;
    }

    public Perro(int peso, Sexo s) {
        super(s);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void ladrar(int veces){
        String guau = "";
        for (int i = 0; i < veces; i++) {
            guau+= "guau ";
        }
        System.out.println(guau);
    }
    @Override
    public void hazRuido() {
        ladrar(10);
    }

    @Override
    public void come(String comida) {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void peleaCon(Animal contrincante) {
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else if (contrincante.getSexo() == Sexo.HEMBRA) {
            System.out.println("no peleo contra perritas");
        } else {
            System.out.println("ven aquí que te vas a enterar");
        }
    }
    @Override
    public String toString() {
        return super.toString()
                + "Peso: " + this.peso
                + "\n*************************\n";
    }
    
}
