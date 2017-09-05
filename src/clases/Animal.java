/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Catherin
 */
public abstract class Animal {
    private Sexo sexo;
    
        public Animal () {
            sexo = Sexo.MACHO;
        }
        public Animal (Sexo s) {
            sexo = s;
        }
        public Sexo getSexo() {
            return sexo;
        }
        @Override
        public String toString() {
            return "Sexo: " + this.sexo + "\n";
        }
        /**
        * Hace que el animal se eche a dormir.
        */
        public void duerme() {
            System.out.println("Zzzzzzz");
        }
    }