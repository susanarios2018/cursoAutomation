package com.icaro;
import com.icaro.Calculadora;
import java.util.Scanner;

public class OtroMain {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        String operacion="";


        do{
             try {
                 System.out.print("Primer valor: ");
                 int num1 = scanner.nextInt();
                 calculadora.setNum1(num1);
                 System.out.print("Segundo valor: ");
                 int num2 = scanner.nextInt();
                 calculadora.setNum2(num2);
                 System.out.print("Operación (Suma +, Resta -, Multiplicacion *,Division /): ");
                 operacion = scanner.next();

                 int resultado = 0;

                 switch (operacion) {
                     case "+":
                         resultado = calculadora.suma(calculadora.getNum1(), calculadora.getNum2());
                         break;
                     case "-":
                         resultado = calculadora.resta(calculadora.getNum1(), calculadora.getNum2());
                         break;
                     case "*":
                         resultado = calculadora.multiplicacion(calculadora.getNum1(), calculadora.getNum2());
                         break;
                     case "/":
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




            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());

            }}
        while(operacion.equals("+") || operacion.equals("-") || operacion.equals("*") || operacion.equals("/"));
        scanner.close();
    }
}


