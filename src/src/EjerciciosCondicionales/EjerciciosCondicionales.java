package EjerciciosCondicionales;

/*
========================================
EJERCICIO 1 - Número positivo, negativo o cero
========================================
Pida un número entero al usuario e imprima:

- "Positivo" si el número es mayor que 0
- "Negativo" si el número es menor que 0
- "Cero" si el número es igual a 0

Use if - else if - else.
*/
/*
========================================
EJERCICIO 2 - Número par o impar
========================================
Solicite un número entero al usuario y determine si es:

- Par
- Impar

Use el operador módulo (%) para resolverlo.
*/

/*

========================================
EJERCICIO 3 - Mayor de edad
========================================
Pida la edad del usuario.

- Si es mayor o igual a 18 → mostrar "Puede ingresar"
- Si es menor → mostrar "Acceso denegado"
- Si la edad es negativa → mostrar "Edad inválida"

Use estructuras condicionales.
*/

/*
========================================
EJERCICIO 4 - Calculadora básica
========================================
Solicite:

- Dos números
- Un operador (+, -, *, /)

Según el operador, realice la operación correspondiente.

Use switch.

Valide que no se pueda dividir entre cero.
*/

/*
========================================
EJERCICIO 5 - Año bisiesto
========================================
Pida un año y determine si es bisiesto.

Reglas:
- Es divisible entre 4
- No es divisible entre 100
- Excepto si es divisible entre 400

Imprima si el año es o no es bisiesto.
*/
/*
========================================
EJERCICIO 6 - Clasificación de nota
========================================
Pida una nota entre 0 y 100 y clasifíquela así:

90 – 100 → Excelente
80 – 89  → Bueno
70 – 79  → Aceptable
60 – 69  → Insuficiente
Menor a 60 → Reprobado

Valide que la nota esté en el rango correcto.
*/

/*
========================================
EJERCICIO 7 - Número mayor entre tres
========================================
Solicite tres números al usuario e imprima cuál es el mayor.

Extra:
- Si hay empate, indíquelo.
*/

/*
========================================
EJERCICIO 8 - Descuento en tienda
========================================
Solicite el valor de una compra.

Aplique los siguientes descuentos:

Mayor a 100000 → 10%
Mayor a 200000 → 15%
Mayor a 500000 → 20%

Imprima:
- Valor original
- Porcentaje de descuento aplicado
- Valor final a pagar
*/

import java.util.Scanner;

/*
========================================
EJERCICIO 9 - Sistema de login
========================================
Simule un sistema de login donde:

Usuario correcto: "admin"
Contraseña correcta: "1234"

Si ambos coinciden → mostrar "Bienvenido"
Si no → mostrar "Credenciales incorrectas"

Use el método equals() para comparar Strings.
*/
/*
========================================
EJERCICIO 10 - Cálculo de IMC
========================================
Solicite:

- Peso en kilogramos
- Altura en metros

Calcule el IMC con la fórmula:

IMC = peso / (altura * altura)

Clasifique el resultado:

Menor a 18.5 → Bajo peso
18.5 – 24.9 → Normal
25 – 29.9 → Sobrepeso
30 o más → Obesidad
*/
public class EjerciciosCondicionales {

    public EjerciciosCondicionales() {
        Scanner lector = new Scanner(System.in);

        System.out.println("EJERCICIO 1 - Número positivo, negativo o cero");
        System.out.println("EJERCICIO 2 - Número par o impar");
        System.out.println("EJERCICIO 3 - Mayor de edad");
        System.out.println("EJERCICIO 4 - Calculadora básica");
        System.out.println("EJERCICIO 5 - Año bisiesto");
        System.out.println("EJERCICIO 6 - Clasificación de nota");
        System.out.println("EJERCICIO 7 - Número mayor entre tres");
        System.out.println("EJERCICIO 8 - Descuento en tienda");
        System.out.println("EJERCICIO 9 - Sistema de login");
        System.out.println("EJERCICIO 10 - Cálculo de IMC");

        System.out.println("Ingrese un ejercicio");
        int Ejercicios = lector.nextInt();

        if (Ejercicios==1){
            System.out.println("EJERCICIO 1 - Número positivo, negativo o cero");
            System.out.println("Ingrese un numero Para determinar si es Negativo o Positivo");
            int numero= lector.nextInt();
            if (numero>0){
                System.out.println("Numero es positivo " + numero);
            }else if (numero<0){
                System.out.println("Numero es Negativo " + numero);
            }else {
                System.out.println("Numero Ingresado es Cero "+numero);
            }
        }

        if(Ejercicios==2 /*condicion*/){
            //codigo relacionado con la logica
            //Inicio Desarrollo Ejercicio 2
            System.out.println("EJERCICIO 2 - Número par o impar. ");
            System.out.println("Ingrese un numero entero parea determinar si es par o impar: ");
            int par_impar = lector.nextInt();
            if (par_impar % 2 == 0){
                System.out.println("El numero" + par_impar + " es par.");
            }else{
                System.out.println("El numero es " + par_impar + " es impar.");
            }

        }

        if(Ejercicios==3 ){
            // Inicio Desarrollo Ejercicio 3
            System.out.println("EJERCICIO 3 - Mayor de edad");
            System.out.println("ingresa tu edad");
            int edad = lector.nextInt();
            if (edad>=18){
                System.out.println("Puede ingresar.");
            }else if(edad<18){
                System.out.println("Acceso denegado.");
            }else {
                System.out.println("Edad invalida.");
            }
        }

        if(Ejercicios==4){
            //Inicio Desarrollo Ejercicio 4
            System.out.println("EJERCICIO 4 - Calculadora básica");
            System.out.println("Ingresa un numero: ");
            double numero1 = lector.nextDouble();
            System.out.println("Ingresa un segundo numero: ");
            double numero2 = lector.nextDouble();
            System.out.println("Ingrese un operador(+,-,*,/ ): ");
            String operador = lector.next();

            switch (operador){
                case "+":
                    System.out.println("Realizando la operación suma.");
                    double resultado = numero1 + numero2;
                    System.out.println("La suma es " + resultado);
                    break;
                case "-":
                    System.out.println("Realizando la operación de la resta.");
                    double resultado2 = numero1 - numero2;
                    System.out.println("La resta es " + resultado2);
                    break;
                case  "*":
                    System.out.println("Realizando la operación de multiplicación.");
                    double resultado3 = numero1 * numero2;
                    System.out.println("El resultado de la multiplicación: " + resultado3);
                    break;
                case  "/":
                    System.out.println("Verificando para realizar la operación de división.");
                    if (numero2 == 0){
                        System.out.println("No se puede dividir entre cero, ingresa un numero diferente.");
                        EjerciciosCondicionales ejerciciosCondicionales = new EjerciciosCondicionales();
                    }else {
                        double resultado_division =  numero1 / numero2;
                        System.out.println("La division es " + resultado_division);
                    }
                    break;
                default:
                    System.out.println("No se puede reconocer el operador, intentalo nuevamente.");
            }
        }
        if(Ejercicios==5){
            //Inicio Desarrollo Ejercicio 5
            System.out.println("EJERCICIO 5 - Año bisiesto");
            System.out.println("ingresa un año para determinar si es bisiesto o no: ");
            int año = lector.nextInt();
            boolean es_bisiesto;
            if (año % 4 == 0){
                es_bisiesto = true;
            }else if(año % 100 == 0){
                es_bisiesto = false;
            }else if (año % 400 == 0) {
                es_bisiesto = true;
            }else {
                es_bisiesto = false;
            }

            if(es_bisiesto){
                System.out.println("El año " + es_bisiesto + " si es bisiesto.");
            }else {
                System.out.println("El año que ingresaste " + es_bisiesto + " no es bisiesto.");
            }
        }
        if(Ejercicios==6){
            //Inicio Desarrollo Ejercicio 6
            /*
            ========================================
            EJERCICIO 6 - Clasificación de nota
            ========================================
            Pida una nota entre 0 y 100 y clasifíquela así:

            90 – 100 → Excelente
            80 – 89  → Bueno
            70 – 79  → Aceptable
            60 – 69  → Insuficiente
            Menor a 60 → Reprobado

            Valide que la nota esté en el rango correcto.
            */
            System.out.println("EJERCICIO 6 - Clasificación de nota");
            System.out.println("Señor usuario ingrese una nota entre 0 y 100: ");
            int nota = lector.nextInt();
            if(nota > 90 && nota < 100){
                System.out.println("Tu calificación es Excelente: " + nota);
            }else if(nota > 80 && nota < 89){
                System.out.println("Tu calificación es Bueno: " + nota);
            }else if(nota > 70 && nota < 79){
                System.out.println("Tu calificación es Aceptable: " + nota);
            }else if(nota > 60 && nota < 69){
                System.out.println("TU calificaión es Insuficiente: " + nota);
            }else if(nota )


        }
        if(Ejercicios==7){
            //Inicio Desarrollo Ejercicio 7
        }
        if(Ejercicios==8){
            //Inicio Desarrollo Ejercicio 8
        }

        if(Ejercicios==9){
            //Inicio Desarrollo Ejercicio 9
        }
        if(Ejercicios==10){
            //Inicio Desarrollo Ejercicio 10
        }



        if (Ejercicios>10 || Ejercicios <=0){
            System.out.println("Ingreso un valor invalido");

        }
    }
}


