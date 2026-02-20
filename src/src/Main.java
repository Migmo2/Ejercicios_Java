import EjerciciosCondicionales.EjerciciosCondicionales;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido A Programando Ando");
        System.out.println("Aqui Aprenderemos a Programar Con Java");
        System.out.println("Lista De Ejercicios");
        System.out.println("1.Condicionales");
        System.out.println("2.Ciclos y Bucles");
        System.out.println("3.Switch");
        System.out.println("4.Do-While");
        System.out.println("5.Ejercicios Basicos POO");
        System.out.println("6.POO con Conexion a Base De Datos");

        Scanner lector =new Scanner(System.in);
        System.out.println("Ingrese una opcion:");
        int opcion = lector.nextInt();

        switch(opcion){
            case 1:
                System.out.println("1.Ingresando a Ejercicios Con Condicionales");
                EjerciciosCondicionales ejerciciosCondicionales=new EjerciciosCondicionales();
                break;

            case 2:
                System.out.println("2.Ingresando a Ejercicios Con Ciclos y Bucles");
                break;

            case 3:
                System.out.println("3.Ingresando a Ejercicios Con Switch");
                break;

            case 4:
                System.out.println("4.Ingresando a Ejercicios Con Do-While");
                break;

            case 5:
                System.out.println("5.Ingresando a Ejercicios Basicos POO");
                break;

            case 6:
                System.out.println("6.Ingresando a Ejercicios Con POO con Conexion a Base De Datos");
                break;

            default:
                System.out.println("Ingresaste una opcion invalida, intentalo de nuevo");
        }


        lector.close();


    }
}
