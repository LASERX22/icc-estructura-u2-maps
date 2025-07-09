import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Joey Diaz"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //System.out.println("----Practica Empleados----");
        runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("----Practica Mapas con HashMap----");
        mapa.runHashMap();
        System.out.println("----Practica Mapas con LinkedHashMap----");
        mapa.runLinkedHashMap();
        System.out.println("----Practica Mapas con TreeMap----");
        mapa.runTreeMap();
    }

    private static void runEmpleadoExample() {
        // Mapa mapa = new Mapa();
        // System.out.println("----Practica Empleados con HashMap----");
        // mapa.runHashMapObj();
        // System.out.println("----Practica Empleados con TreeMap----");
        // mapa.runTreeMapObj();

        EmpleadoDAO empleadoDAOHash=new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoControllerHash=new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree=new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoControllerTree=new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1=new Empleado(4,"Pedro","DEV");
        Empleado emp2=new Empleado(2,"Pedro","DEV");
        Empleado emp3=new Empleado(5,"Juan","DEV");
        Empleado emp4=new Empleado(3,"Maria","DEV");
        Empleado emp5=new Empleado(1,"Juan","DEV");

        empleadoControllerHash.agregarEmpleado(emp1);
        empleadoControllerHash.agregarEmpleado(emp2);
        empleadoControllerHash.agregarEmpleado(emp3);
        empleadoControllerHash.agregarEmpleado(emp4);
        empleadoControllerHash.agregarEmpleado(emp5);
        empleadoControllerTree.agregarEmpleado(emp1);
        empleadoControllerTree.agregarEmpleado(emp2);
        empleadoControllerTree.agregarEmpleado(emp3);
        empleadoControllerTree.agregarEmpleado(emp4);
        empleadoControllerTree.agregarEmpleado(emp5);
        System.out.println("Lista de empleados Hash");
        empleadoControllerHash.list();
        System.out.println("Lista de empleados Hash");
        empleadoControllerHash.remove(2);
        empleadoControllerHash.list();
        System.out.println("Lista de empleados Tree");
        empleadoControllerTree.list();
        System.out.println("Lista de empleados Tree");
        empleadoControllerTree.remove(2);
        empleadoControllerTree.list();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
