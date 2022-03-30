# Polimorfismo Java
Ejemplo aplicando Polimorfismo y Herencia en Java

##Ejemplo
Siguiendo el ejercicio de: [Herencia en Java](https://github.com/Gamis214/Herencia-Java)

Tenemos nuestra clase Padre **Animal** junto con sus 3 clases hijas **Perro**, **Gato**, **Caballo**.

##¿Que es el polimorfismo?
Son cambios y mutaciones de distintas formas, llevando esto a la programacion lo que nos va a permitir es que ciertos metodos o funciones
se van a comportar de manera diferente deacuerdo a la instancia de los que se creen.

##Aplicacion
Para poder aplicar el **Polimorfismo** en java debemos tener en cuenta que nuestra clase padre se le debe asignar la palabra reservada 
**abstract** la cual nos indica que nuestra clase es una clase Abstracta, esto quiere decir que nuestra clase contendra metodos abstractos
la cual se comportaran de manera diferente en cada clase hija.

###Declaracion abstract a clase padre
```java
public abstract class Animal 
```
Una vez que nuestra clase ya es Abstracta creamos nuestro metodo:
```java
public abstract void Alimentarse();
```
Este metodo abstracto sera de mucha ayuda para las clases hijas que deberan usarlo para definir de que es alimentado cada animal.

Como se muestra a continuacion en nuestra clase hija **Gato** se define el metodo abstracto de la clase padre **Animal**
```java
@Override
public void Alimentarse() {
    System.out.println("Me alimento de ratones");
}
```

**@Override** Esto nos indica que vamos a sobreescribir la logica de lo que se va a contener en ese Metodo.

Una vez implementado los metodos abstractos dentro de cada clase hija nuestro **Main** queda de la siguiente manera:
```java
public class Main {

    public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
	    Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();


        //-->Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();

    }
}
```

Al correr nuestra aplicacion se debe mostrar el siguiente resultado:
```

Me alimento de croquetas
Me alimento de ratones
Me alimento de hierbas
```
