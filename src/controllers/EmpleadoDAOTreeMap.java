package controllers;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO{

    private Map<Empleado,Empleado> empleados;

    
    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void list() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void remove(int id) {
        Empleado temporal=new Empleado(id);
        empleados.remove(temporal);
    }
    
}
