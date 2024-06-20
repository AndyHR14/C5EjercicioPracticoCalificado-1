/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopráctico.pkg1_andyhidalgo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EjercicioPráctico1_AndyHidalgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Trabajo realizado por Andy Hidalgo
        /*Empezamos declarando las variables que se van a utilizar en este trabajo, en este caso algunas variables son declaradas como
        "Lectura" debido a que empiezan siendo un String, pero en el proceso de la creación del programa debemos transformarlos a un valor númerico
        "montTotal" se inicializa en 0 debido a que en este valor se va a almacenar la información de las reducciones de salarios
         */
        String cantEmpleadosLectura;
        int cantEmpleadosNum;
        String salarioEmpleadoLectura;
        double salarioEmpleadoDouble;
        double sem;
        double ivm;
        double montTotal = 0;
        double reduccionSEM;
        double reduccionIVMySEM;

        // A continuación asignamos sus debidos valores al SEM e IVM, al ser valores porcentuales se deben trabajar de manera decimal
        sem = 0.0925;
        ivm = 0.0508;

        //Aquí empieza la parte funcional de nuestro código, se pide al usuario que ingrese la cantidad de empleados (como String) y el dato obtenido se convierte a Integer
        cantEmpleadosLectura = JOptionPane.showInputDialog("Ingrese la cantidad de empleados que posee la empresa:");
        cantEmpleadosNum = Integer.parseInt(cantEmpleadosLectura);

        /*Con la cantidad de empleados obtenida anteriormente ejecutamos el ciclo for, por lo que el bucle se repetirá una vez por cada empleado que posea la empresa
        El bucle pide al usuario ingresar el salario de un empleado (como String) y lo convierte a Double, después de convertir el salario a una variable númerica el bucle
        multiplica ese salario por el 9.25% del SEM y lo almacena en la variable "reduccionSEM", luego de eso, el bucle for multiplica el salario del trabajador por el 5.08% del IVM
        y además le suma el valor de la reduccionSEM obtenida anteriormente, esto lo almacena en la variable reduccionIVMySEM. Por último, el bucle suma y almacena el valor obtenido en la
        variable reduccionIVMySEM, por lo que por cada repetición del bucle for irá sumando las reducciones de todos los trabajadores.
         */
        for (int i = 1; i < cantEmpleadosNum + 1; i++) {
            salarioEmpleadoLectura = JOptionPane.showInputDialog("Ingrese el salario del " + i + "° empleado:");
            salarioEmpleadoDouble = Double.parseDouble(salarioEmpleadoLectura);
            reduccionSEM = salarioEmpleadoDouble * sem;
            reduccionIVMySEM = (salarioEmpleadoDouble * ivm) + reduccionSEM;

            montTotal += reduccionIVMySEM;
        }
        //Por último, se coloca el JOptionPane.showMessageDialog fuera del bucle for para que solamente lo muestre una vez.
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de ₡" + montTotal + " por concepto de SEM y IVM");
    }

}
