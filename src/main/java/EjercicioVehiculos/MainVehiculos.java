package EjercicioVehiculos;
import EjercicioVehiculos.Vehiculo;
import EjercicioVehiculos.Coche;

public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo= new Vehiculo("Toyota", ": Corolla", 2020);
        Coche coche= new Coche(" Ford", " Mustang",2021,5000);
        System.out.println("---------VEHICULOS------------");
        System.out.println("Marca"+vehiculo.getMarca());
        System.out.println("Modelo"+vehiculo.getModelo());
        System.out.println("Año"+vehiculo.getAño());
        System.out.println("---------COCHE------------");
        System.out.println("Marca"+coche.getMarca());
        System.out.println("Modelo"+coche.getModelo());
        System.out.println("Año"+coche.getAño());
        System.out.println("Cilindrada"+coche.getCilindrada());
        vehiculo.acelerar();
        vehiculo.frenar();



    }
}
