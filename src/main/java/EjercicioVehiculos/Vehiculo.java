package EjercicioVehiculos;

public class Vehiculo {

        private String marca;
        private String modelo;
        private int año;

        public Vehiculo(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAño() {
            return año;
        }

        public void acelerar() {
            System.out.println("El vehículo está acelerando.");
        }

        public void frenar() {
            System.out.println("El vehículo está frenando.");
        }


}
