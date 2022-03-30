package com.gamis214;

public class Main {

    public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
	    Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
            //-->Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark","Pasto",25,"Pony");
        caballo.Alimentarse();

        //Creamos un pollito
        Animal pollito = new Pollito("Pio", "Maiz", 1, "Pelea");
        pollito.Alimentarse();

    }
}
