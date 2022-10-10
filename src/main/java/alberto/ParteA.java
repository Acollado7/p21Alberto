package alberto;

import java.util.Scanner;

public class ParteA {
    public static void main(String[] args) {
        //TODO Enunciado:
        //Tenemos una tienda de reparaciones de PCs low cost en la que las reparaciones
        //cuestan siempre lo mismo, tenemos que crear un programa que ayude a los dueños a
        //saber cuanto han cobrado al final del dia y tambien al final de la semana
        //las reparaciones se realizan de lunes a viernes y cada una cuesta 32,6.
        //Una vez leidos los datos del numero de reparaciones que hay de lunes a viernes se debe motsrar
        //en un float cuanto se cobra cada dia y cuanto se cobra en total en la semana con otro float,
        // esto tiene que estar limitado a 3 decimales, debemos introducir los datos por teclado.
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables

        int lunes, martes, miercoles, jueves, viernes;

        float total, totalLunes, totalMartes, totalMiercoles, totalJueves, totalViernes;
        double precio = 32.6f;

        //Creamos la entrada de datos para poder decir cuantas reparacions hacemos cada dia.

        System.out.println("Introduce el numero de reparaciones de lunes");
        lunes = sc.nextInt();
        System.out.println("Introduce el numero de reparaciones de martes");
        martes = sc.nextInt();
        System.out.println("Introduce el numero de reparaciones de miercoles");
        miercoles = sc.nextInt();
        System.out.println("Introduce el numero de reparaciones de jueves");
        jueves = sc.nextInt();
        System.out.println("Introduce el numero de reparaciones de viernes");
        viernes = sc.nextInt();

        //Calculamos el precio de lo que nos cuesta cada reparacion multiplicado por
        //cuantas reparaciones hacemos por dia.

        totalLunes = (float) (lunes * precio);
        totalMartes = (float) (martes * precio);
        totalMiercoles = (float) (miercoles * precio);
        totalJueves = (float) (jueves * precio);
        totalViernes = (float) (viernes * precio);
        //Hacemos el calculo de la semana
        total = totalLunes + totalMartes + totalMiercoles + totalJueves + totalViernes;

        //Aqui mostraremos por pantalla los datos que nos salen por dia.
        //usando el printf para que nos salga con 3 decimales.


        System.out.printf("El total de lunes es %.3f %n", totalLunes);
        System.out.printf("El total de martes es %.3f %n", totalMartes);
        System.out.printf("El total de miercoles es %.3f %n", totalMiercoles);
        System.out.printf("El total de jueves es %.3f %n", totalJueves);
        System.out.printf("El total de viernes es %.3f %n", totalViernes);

        //Aqui nos saldria el total de la semana.

        System.out.printf("El total de la semana es %.3f %n", total);


    }
}
