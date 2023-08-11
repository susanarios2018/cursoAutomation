package com.icaro;

public class Calculadora {
        private int num1;
        private int num2;

        public void setNum1(int num1){

            this.num1=num1;
        }
        public int getNum1(){
            return num1;
        }
        public void setNum2(int num2){
        this.num2=num2;
        }
        public int getNum2(){
        return num2;
        }

        public int suma(int num1, int num2) {
            int total=0;
            total=num1+num2;
            return total;
        }

        public int resta(int num1, int num2) {
            int resultadoResta=0;
            resultadoResta=num1-num2;
            return resultadoResta;
        }

        public int multiplicacion(int num1, int num2) {
            int resultadoMultip=0;
            resultadoMultip=num1*num2;
            return resultadoMultip;
        }

        public int division(int num1, int num2) {
            int resultadodiv=0;
            if (num2 == 0) {
                System.out.print("No se puede dividir por cero.");
            }
            resultadodiv=num1/num2;
            return resultadodiv;
        }
    }


