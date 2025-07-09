package controllers;

import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO=empleadoDAO;
    }

    public void agregarEmpleado(Empleado empleado){
        empleadoDAO.add(empleado);
    }

    public void list(){
        empleadoDAO.list();
    }

    public void remove(int id){
        empleadoDAO.remove(id);
    }
}