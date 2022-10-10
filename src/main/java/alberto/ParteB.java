package alberto;


import javax.swing.*;

public class ParteB {
    public static void main(String[] args) {
        //TODO Enunciado:
        //Ejercicio anterior + se debe preguntar cuánto se va a cobrar por
        // reparación cada día de la semana (double) y luego preguntar cuántas
        // reparaciones se han hecho cada día (int). Una vez leídos los datos,
        // calcula lo que se cobra cada día y al final de la semana, guardando
        // los datos en tipos float. Usa un text block, limitando la salida a 1
        // decimal, para usarlo en un JOptionPane que muestre la información de salida.
        //Guarda el resultado de evaluar si se ha cobrado al final de la semana
        // más de 1000€, mostrando el resultado por consola.

        //Declaracion de variables

        int lunes, martes, miercoles, jueves, viernes;
        double precioLunes, precioMartes, precioMiercoles, precioJueves, precioViernes;
        float total, totalLunes, totalMartes, totalMiercoles, totalJueves, totalViernes;


        //Creamos la entrada de datos para poder decir cuantas reparacions hacemos cada dia Con JOptionPane.

        lunes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de reparaciones de lunes"));
        martes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de reparaciones de martes"));
        miercoles = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de reparaciones de miercoles"));
        jueves = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de reparaciones de jueves"));
        viernes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de reparaciones de viernes"));

        //Preguntamos cuanto se va a cobrar por dia

        precioLunes = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de lunes"));
        precioMartes = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de martes"));
        precioMiercoles = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de miercoles"));
        precioJueves = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de jueves"));
        precioViernes = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de viernes"));

        //Multiplicamos las repraciones que hemos hecho ese dia por el precio que
        // hemos decidido que se usara ese dia

        totalLunes = (float) (lunes * precioLunes);
        totalMartes = (float) (martes * precioMartes);
        totalMiercoles = (float) (miercoles * precioMiercoles);
        totalJueves = (float) (jueves * precioJueves);
        totalViernes = (float) (viernes * precioViernes);
        total = totalLunes + totalMartes + totalMiercoles + totalJueves + totalViernes;

        //Mostramos por pantalla el dinero ganado cada dia y el total de la semana usando un
        // textblock y limitando la salida a 1 decimal


        JOptionPane.showMessageDialog(null, """
                Lunes: %.1f €
                Martes: %.1f €
                Miercoles: %.1f €
                Jueves: %.1f €
                Viernes: %.1f €
                Total de la semana: %.1f €
                """.formatted(totalLunes, totalMartes, totalMiercoles, totalJueves, totalViernes, total));

        //si se ha cobrado mas de 1000 € en una semana guardamos el valor en consola

        System.out.println(total > 1000);
        System.out.println( "Se ha cobrado mas de 1000€ en una semana");

        //Con el if quedaba mas bonito pero bueno :(
        /*if (total > 1000) {
            System.out.println("El total de la semana es mayor de 1000€");
            System.out.println("El total de la semana es: " + total);
        }*/



    }
}
