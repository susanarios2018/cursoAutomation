package com.icaro;
import com.icaro.Calculadora;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while (contador < 5) {
            try {
                System.out.print("Primer valor: ");
                int num1 = scanner.nextInt();
                calculadora.setNum1(num1);
                System.out.print("Segundo valor: ");
                int num2 = scanner.nextInt();
                calculadora.setNum2(num2);
                System.out.print("Operación (Suma +, Resta -, Multiplicacion *,Division /): ");
                char operacion = scanner.next().charAt(0); //Toma el primer caracter

                int resultado = 0;

                switch (operacion) {
                    case '+':
                        resultado = calculadora.suma(calculadora.getNum1(), calculadora.getNum2());
                        break;
                    case '-':
                        resultado = calculadora.resta(calculadora.getNum1(), calculadora.getNum2());
                        break;
                    case '*':
                        resultado = calculadora.multiplicacion(calculadora.getNum1(), calculadora.getNum2());
                        break;
                    case '/':
                        resultado = calculadora.division(calculadora.getNum1(), calculadora.getNum2());
                        break;
                    default:
                        System.out.println("Operación inválida.");
                        continue;
                }

                System.out.println("Resultado: " + resultado);

                if (resultado < 0) {
                    System.out.println("El resultado es negativo, ten cuidado!");
                }
                if (resultado > 1000) {
                    System.out.println("El resultado es un número grande");
                }

                contador++;

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());

            }
        }
            scanner.close();
        }
    }
