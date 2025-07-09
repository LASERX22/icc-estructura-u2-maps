package controllers;

import models.Empleado;

public interface EmpleadoDAO{
    
    public void add(Empleado empleado);

    public void list();

    public void remove(int id);
}