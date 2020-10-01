package cr.ac.tec.design.prototype;

import cr.ac.tec.design.prototype.Car;
import cr.ac.tec.design.prototype.Deportivo;
import cr.ac.tec.design.prototype.Camion;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Car> cars = new ArrayList<>();
        List<Car> carsCopy = new ArrayList<>();

        Deportivo deportivo = new Deportivo();
        Deportivo.nitro = 50;
        Deportivo.size = "Pequeño";
        Deportivo.Color = "Green";
        Deportivo.marca = "Hiunday";
        cars.add(deportivo);

        Deportivo otherDeportivo = (Deportivo) deportivo.clone();
        cars.add(otherDeportivo);

        Camion camion = new Camion();
        camion.size = "Grande";
        camion.Color = "BLack";
        camion.marca = "Toyota";
        camion.tipo_cajuela = "Large";
        camion.add(camion);
    }
}