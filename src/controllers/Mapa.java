package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Cellular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet()); // set pq no se repiten las claves
        for (String clave : mapa.keySet()) {
            System.out.println(mapa.get(clave));
        }

        System.out.println(mapa.get("001")); // Acceso a un elemento por su clave
        System.out.println(mapa.get("005")); // Si no existe la clave, devuelve null

    }

    public void runLinkedHashMap() {
        Map<Integer, String> linkedMapa = new LinkedHashMap<>();
        linkedMapa.put(1, "Celular");
        linkedMapa.put(2, "Laptop");
        linkedMapa.put(3, "PC");
        linkedMapa.put(4, "Tablet");
        linkedMapa.put(5, "Smartwatch");
        System.out.println(linkedMapa.values());
    }

    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>(); // Ordena naturalmente por las claves
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");
        System.out.println(items.values());
    }

    public void runHashMapObj() {
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500); // Reemplaza el valor del empleado con id 1
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);
        System.out.println(empleados);
    }

    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>(); // Ordena por el orden natural de los empleados
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        System.out.println(empleados);
    }
}
