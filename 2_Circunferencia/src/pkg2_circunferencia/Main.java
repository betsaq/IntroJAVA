//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package pkg2_circunferencia;

import Entidades.Circunferencia;

public class Main {

    public static void main(String[] args) {

        Circunferencia C1 = new Circunferencia();
        C1.crearCircunferencia();
        C1.crearArea();
        C1.crearPerimetro();

    }

}
