package EjercicioVehiculos;

   class Coche extends Vehiculo {  //se le agrega cilindrada a vehiculo
        private int cilindrada;

        public Coche(String marca, String modelo, int año, int cilindrada) {
            super(marca, modelo, año);
            this.cilindrada = cilindrada;
        }

        public int getCilindrada() {

            return cilindrada;
        }

        public void setCilindrada(int cilindrada) {

            this.cilindrada = cilindrada;
        }

        @Override  //Para sobrescribir el metodo acelerar
        public void acelerar() {

            System.out.println("El coche está acelerando.");
        }
    }

