import controllers.Mapa;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Joey Diaz"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        System.out.println("----Practica Empleados----");
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
        Mapa mapa = new Mapa();
        System.out.println("----Practica Empleados con HashMap----");
        mapa.runHashMapObj();
        System.out.println("----Practica Empleados con TreeMap----");
        mapa.runTreeMapObj();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
