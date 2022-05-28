/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete01;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import paquete02.Ciudad;
import paquete02.Enfermeros;
import paquete02.Hospital;
import paquete02.Medico;

/**
 *
 * @author Matias Quezada
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        String nombre, nombreHospital, provincia, ciudad, especialidad, tipo, direccion;
        double sueldo;
        int especialidades;
        System.out.println("Ingrese el nombre del Hospital");
        nombreHospital = leer.nextLine();
        System.out.println("Ingrese la Provincia en la cual se encuentra ubicado el Hospital");
        provincia = leer.nextLine();
        System.out.println("Ingrese la Ciudad en la cual se encuentra ubicado el Hospital");
        ciudad = leer.nextLine();
        System.out.println("Ingrese el numero de especialidades del Hospital");
        especialidades = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = leer.nextLine();
        Ciudad c = new Ciudad(ciudad, provincia);
        int n, m;
        System.out.println("Ingrese cuantos doctores tiene el hospital");
        n = leer.nextInt();
        leer.nextLine();
        Medico[] d = new Medico[n];
        for (int i = 0; i < d.length; i++) {
            System.out.printf("Ingrese el nombre del doctor %d\n", i + 1);
            nombre = leer.nextLine();
            System.out.printf("Ingrese la especialidad del doctor %d\n", i + 1);
            especialidad = leer.nextLine();
            System.out.printf("Ingrese el sueldo del doctor %d\n", i + 1);
            sueldo = leer.nextDouble();
            leer.nextLine();
            d[i] = new Medico(nombre, especialidad, sueldo);
        }
        System.out.println("Ingrese el numero de enfermeros que tiene el hospital");
        m = leer.nextInt();
        leer.nextLine();
        Enfermeros[] e = new Enfermeros[m];
        for (int i = 0; i < e.length; i++) {
            System.out.printf("Ingrese la nomina enfermero %d\n", i + 1);
            nombre = leer.nextLine();
            System.out.printf("Ingrese el tipo de contrato del enfermero %d\n", i + 1);
            tipo = leer.nextLine();
            System.out.printf("Ingrese el salario del enfermero %d\n", i + 1);
            sueldo = leer.nextDouble();
            leer.nextLine();
            e[i] = new Enfermeros(nombre, tipo, sueldo);
        }
        Hospital h = new Hospital(
                nombreHospital, c, especialidades, d, e, direccion);
        PrintStream printf = System.out.printf("%s", h);
    }
       
}
